package ir.ac.kntu.khalili.javapluspluscompiler;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;

import java.io.*;
import java.util.Stack;

public class CompilerController {

    private String code;
    private static String fileName = "3AddressCode.txt";
    private static String errorText = "";
    private static boolean error = false;
    private static int tempLblCounter = 0, tempVarCounter = 0;

    protected static SymbolTable symbolTable = new SymbolTable();
    protected static Stack<String> compilerStack = new Stack<>();
    protected static Stack<String> compilerTempStack = new Stack<>();

    protected static void pushTokenValue(String value) {
        compilerStack.push(value);
    }

    protected static String popTokenValue () {
        return compilerStack.pop();
    }

    protected static String peekTokenValue() {
        return compilerStack.peek();
    }

    protected static boolean containsSymbol(String value) {
        return symbolTable.containsSymbol(value);
    }

    protected static void pushTempValue(String value) {
        compilerTempStack.push(value);
    }

    protected static String popTempValue () {
        return compilerTempStack.pop();
    }

    protected static String getTempVar() {
        return "$T" + (++tempVarCounter);
    }

    protected static void removeTempVar() {
        tempVarCounter--;
    }

    protected static String getTempLbl() {
        return "L" + (++tempLblCounter);
    }

    protected static boolean isTemp(String var){
        return var.startsWith("$T");
    }

    protected static void init() {
        tempVarCounter = 0;
        tempLblCounter = 0;
        remove3AddrOutput();
    }

    protected static void remove3AddrOutput() {
        File file = new File(fileName);
        file.delete();
    }

    protected static void emit(String str) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter fw;
        try {
            fw = new FileWriter(file, true);
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.err.println("Here1");
        }
    }

    protected static void emitln(String str) {
        emit(str + "\n");
    }

    protected static void showVarAlreadyDefinedError(String value) {
        errorText = errorText + "variable \"" + value + "\" is already defined.\n";
        error = true;
    }

    protected static void showTypeMismatchError(String type1, String type2) {
        errorText = errorText + "Type mismatch. Operation is invalid. Cannot cast " + type2 + " to " + type1 + ".\n";
        error = true;
    }

    protected static void showVarNotDefinedError(String value) {
        errorText = errorText + "variable \"" + value + "\" is not defined.\n";
        error = true;
    }

    @FXML
    private TextArea codeText;

    @FXML
    private TextArea compilationResultText;

    @FXML
    protected void onCompileButtonClick() throws IOException {
        compilationResultText.clear();
        symbolTable.clearTable();
        compilerStack.clear();
        errorText = "";
        code = codeText.getText();
        init();

        InputStream codeStream = new ByteArrayInputStream(code.getBytes());
        JavaPlusPlusLexer jppLexer = new JavaPlusPlusLexer(new ANTLRInputStream(codeStream));
        JavaPlusPlusParser jppParser = new JavaPlusPlusParser(new BufferedTokenStream(jppLexer));
        jppParser.s();
        if (!error)
            compilationResultText.setText("Compiled successfully.");
        else {
            compilationResultText.setText(symbolTable.toString() + errorText);
            error = false;
        }
    }
}
/*
Use this code as an example:
class Test{
	main(){
		int a;
		a = 2;
		int b;
		float b;
		input(b);
		a = a + b;
		output(a);
	}
}

class Test{
	main(){
		int a;
		a = 2;
		int b;
		input(b);
		a = a + b;
		int c;
		c = a * 5;
	}
};

class Test{
	main(){
		int a;
		a = 2;
		int b;
		int c;
		input(b);
		a = a + b;
		if (a > 4) {
			c = a * 6;
		} else {
		    c = 55;
		}
	}
};
*/
