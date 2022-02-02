module ir.ac.kntu.khalili.javapluspluscompiler {
    requires javafx.controls;
    requires javafx.fxml;
    requires antlr;


    opens ir.ac.kntu.khalili.javapluspluscompiler to javafx.fxml;
    exports ir.ac.kntu.khalili.javapluspluscompiler;
}