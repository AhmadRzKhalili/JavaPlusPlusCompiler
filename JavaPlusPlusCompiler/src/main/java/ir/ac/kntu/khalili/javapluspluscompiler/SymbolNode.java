package ir.ac.kntu.khalili.javapluspluscompiler;

import org.abego.treelayout.internal.util.java.lang.string.StringUtil;
import org.antlr.v4.runtime.Token;
public class SymbolNode {

    enum SymbolType {
        S_INT_NO, S_INT, S_FLT_NO, S_FLT,
        S_AS, S_MUL, S_DIV, S_ADD, S_SUB,
        S_IF, S_ELSE, S_SWITCH, S_CASE, S_BREAK,
        S_EQ, S_NEQ, S_GTE, S_LTE, S_GT, S_LT,
        S_WHILE, S_FOR, S_DO,
        S_OPEN_PAR, S_CLOSE_PAR, S_OPEN_CUR_BRA, S_CLOSE_CUR_BRA,
        S_CLASS, S_MAIN_FUNC,
        S_INPUT, S_OUTPUT,
        S_FUNC, S_RET,
        S_SEMICOLON, S_COMMA,
        S_CLASS_ID, S_ID
    }

    private Token token;
    private SymbolType symbolType;
    private String value;
    private String type;
    private int col;
    private int row;
    private int block;

    public SymbolNode(String value, Token token) {
        setValue(value);
        setType(type);
        setToken(token);
    }

    public SymbolNode(String value, String type, Token token) {
        setValue(value);
        setType(type);
        setToken(token);
    }

    public SymbolNode(SymbolType symbolType, String value, int col, int row, int block) {
        setSymbolType(symbolType);
        setValue(value);
        setCol(col);
        setRow(row);
        setBlock(block);
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SymbolType getSymbolType() {
        return symbolType;
    }

    public void setSymbolType(SymbolType symbolType) {
        this.symbolType = symbolType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    @Override
    public String toString() {
       if (value.contains("<missing")) {
            value = "missing " + extractText(token.getText())
                    + " at line = " + token.getLine()
                    /*+ ", column = " + token.getCharPositionInLine()*/ + '\n';
            return value;
        }

        return "Token = [" +
                "token = " + token +
                ", value='" + value + '\'' +
                ", at line = " + token.getLine() +
                ']' + '\n';
    }

    public String extractText(String s) {
        return s.substring(s.indexOf('\''), s.lastIndexOf('\'') + 1);
    }
}
