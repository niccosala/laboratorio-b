package com.uninsubria.clientCV.centrivaccinali;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

/**
 * JavaFX App
 */
public class CentriVaccinali extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(CentriVaccinali.class.getClassLoader().getResource(
                        "com/uninsubria/layout/HomeOperatore.fxml")));

        Scene scene = new Scene(root, 900, 600);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Centri Vaccinali");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}