/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc.proyecto.estructuras;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author crist
 */
public class Menu extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button btn_Crearcontacto= new Button("Crear Contacto");
        Button btn_CerrarSesion= new Button("Cerrar Sesion");
        Button btn_VerContactos=new Button("Ver mis contactos");
        VBox vertical1= new VBox();
        vertical1.getChildren().add(btn_Crearcontacto);
        vertical1.getChildren().add(btn_CerrarSesion);
        vertical1.getChildren().add(btn_VerContactos);
        vertical1.setSpacing(25);
        vertical1.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vertical1, 400, 300);
        stage.setTitle("Inicio de Sesión");
        stage.setScene(scene);
        stage.show();
    }
      public static void main(String[] args) {
        launch(args);
    }
      
}
