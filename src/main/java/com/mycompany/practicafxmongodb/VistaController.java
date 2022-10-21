/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.practicafxmongodb;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author furu9
 */
public class VistaController implements Initializable {

    //Vamos a declarar las variables FXML
    //Etiquetas
    @FXML
    private Label labelNombre;
    @FXML
    private Label precio;
    @FXML
    private Label tipo;
    @FXML
    private Label sabor;

    //Cuadros de texto
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtPrecio;
    @FXML
    private TextField txtSabor;

    //Botones
    @FXML
    private Button botonSalir;
    @FXML
    private Button botonNuevo;
    @FXML
    private Button botonGuardar;
    @FXML
    private Button botonModificar;
    @FXML
    private Button botonEliminar;

    
    //Cerramos el programa
    @FXML
    private void botonSalirHandler(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
