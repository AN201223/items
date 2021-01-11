/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import java.util.Random;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.*;
import java.applet.*;

/**
 *
 * @author Alex
 */
public class FXMLDocumentController implements Initializable {

    Random randomGenerate = new Random();
    @FXML
    private Label label;
    @FXML
    private Button random;
    @FXML
    private Label output;
    @FXML
    private TextField nameEnter;
    @FXML
    private ImageView picture;
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void randomPressed(ActionEvent event) {
        
        String name = nameEnter.getText();
        int randomNumber = randomGenerate.nextInt(12);
        Javafx fx = new Javafx();
        Item[] items = fx.getItems();
        Item object = items[randomNumber];
        String objectname = object.getName();
        String objectmaterial = object.getMaterial();
        String objectowner = object.getPrevOwner();
        output.setText(name + ", you have been given " + objectname + "\nwhich is made of " + objectmaterial + "\nwhich was previosly owned by " + objectowner);

    }

}
