package org.agprojeto.bibliotecaescolar.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import org.agprojeto.bibliotecaescolar.utils.Viewer;

import java.io.IOException;

public class App extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        App.stage = stage;

        FXMLLoader loader = new FXMLLoader(Viewer.class.getResource("/org/agprojeto/bibliotecaescolar/view/TelaCadastroUsuario.fxml"));
        ScrollPane scroll = loader.load();

        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);

        Scene scene = new Scene(scroll);
        stage.setTitle("Biblioteca Escolar");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static Stage getMainStage() {
        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}