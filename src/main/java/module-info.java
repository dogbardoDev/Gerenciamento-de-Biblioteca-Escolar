module org.agprojeto.bibliotecaescolar {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.agprojeto.bibliotecaescolar to javafx.fxml;
    exports org.agprojeto.bibliotecaescolar;
}