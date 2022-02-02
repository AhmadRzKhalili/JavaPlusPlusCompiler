package ir.ac.kntu.khalili.javapluspluscompiler;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class SymbolTable {

    private List<SymbolNode> symbols = new ArrayList<>();

    public void addSymbol(String value, Token token) {
        SymbolNode symbolNode = new SymbolNode(value, token);
        symbols.add(symbolNode);
    }

    public void addSymbol(String value, String type, Token token) {
        if (!containsSymbol(value)) {
            SymbolNode symbolNode = new SymbolNode(value, type, token);
            symbols.add(symbolNode);
        }
    }

    public void addSymbol(SymbolNode.SymbolType symbolType, String value, int col, int row, int block, Token token) {
        SymbolNode symbolNode = new SymbolNode(symbolType, value, col, row, block);
        symbols.add(symbolNode);
    }

    public boolean containsSymbol(String value) {
        for (int i = 0; i < symbols.size(); i++) {
            if (symbols.get(i).getValue().equals(value))
                return true;
        }

        return false;
    }

    public String getType(String var) {
        for (int i = 0; i < symbols.size(); i++) {
            if (symbols.get(i).getValue().equals(var))
                return symbols.get(i).getType();
        }

        return null;
    }

    public void clearTable() {
        symbols.clear();
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < symbols.size(); i++) {
            s = s + symbols.get(i).toString() + "\n";
        }
        return s + '\n';
    }
}
