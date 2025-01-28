package org.agprojeto.bibliotecaescolar.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.agprojeto.bibliotecaescolar.view.App;

import java.io.IOException;
import java.util.function.Consumer;

public class Viewer {

    public static <T> void loadView(String caminho, Consumer<T> configuracaoController) {
        try {
            Stage mainStage = App.getMainStage();
            Stage newStage = new Stage();

            FXMLLoader loader = new FXMLLoader(Viewer.class.getResource(caminho));
            Parent novaTela = loader.load();

            Object controller = loader.getController();
            if (configuracaoController != null) {
                try {
                    T castedController = (T) controller;
                    configuracaoController.accept(castedController);
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException("O controlador carregado não corresponde ao tipo esperado.");
                }
            }

            Scene cenaTela = new Scene(novaTela);
            newStage.setResizable(false);
            newStage.setTitle("Gerenciamento Estoque");
            newStage.setScene(cenaTela);
            newStage.initOwner(mainStage);
            newStage.initModality(Modality.WINDOW_MODAL);
            newStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
            Alertas.mostrarAlerta("Erro", "Não foi possível carregar a tela.", Alert.AlertType.ERROR);
        }
    }
}