module org.agprojeto.bibliotecaescolar {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.agprojeto.bibliotecaescolar to javafx.fxml;
    exports org.agprojeto.bibliotecaescolar.model.entities;
    exports org.agprojeto.bibliotecaescolar;
    exports org.agprojeto.bibliotecaescolar.dto;
    exports org.agprojeto.bibliotecaescolar.view;
    exports org.agprojeto.bibliotecaescolar.view.controller;
    exports org.agprojeto.bibliotecaescolar.controller to javafx.fxml;
    opens org.agprojeto.bibliotecaescolar.view to javafx.fxml;
}