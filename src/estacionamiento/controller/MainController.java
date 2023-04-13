
package estacionamiento.controller;

import estacionamiento.component.Run;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable{
    
    @FXML
    private Rectangle r1;
    @FXML
    private Rectangle r2;
    @FXML
    private Rectangle r3;
    @FXML
    private Rectangle r4;
    @FXML
    private Rectangle r5;
    @FXML
    private Rectangle r6;
    @FXML
    private Rectangle r7;
    @FXML
    private Rectangle r8;
    @FXML
    private Rectangle r9;
    @FXML
    private Rectangle r10;
    @FXML
    private Rectangle r11;
    @FXML
    private Rectangle r12;
    @FXML
    private Rectangle r13;
    @FXML
    private Rectangle r14;
    @FXML
    private Rectangle r15;
    @FXML
    private Rectangle r16;
    @FXML
    private Rectangle r17;
    @FXML
    private Rectangle r18;
    @FXML
    private Rectangle r19;
    @FXML
    private Rectangle r20;
    @FXML
    private Rectangle index;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Run run = new Run(r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,index);
       run.start();
    }
    
}
