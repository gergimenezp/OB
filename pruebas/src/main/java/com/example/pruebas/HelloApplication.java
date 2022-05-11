package com.example.pruebas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        int resultado;
        resultado = suma (7, 3, 8);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        System.out.println("Mi coche tiene "+miCoche.puertas+" puertas.");
    }

    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}

class Coche{
    public int puertas = 2;

    public void SumarPuerta() {
        this.puertas++;
    }
}