package estacionamiento.model;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estacionamiento {
    public int [] lugares;
    public int contVehiculos;
    public int lugarEntrada=0;
    int contEsperaAux = 0;
    Color ocupado = Color.GREEN;
    Color vacio = Color.GRAY;
    boolean vaciar = false;
    int n=1;
    int position = 0;
    @FXML
    private Rectangle r1;
    
    
    public Estacionamiento(int size){
        lugares = new int[size];
    }//Recibimos tamaño
    
    public synchronized void push(Rectangle rectangle_1, Rectangle rectangle_2, Rectangle rectangle_3, Rectangle rectangle_4,
                                  Rectangle rectangle_5, Rectangle rectangle_6, Rectangle rectangle_7, Rectangle rectangle_8,
                                  Rectangle rectangle_9, Rectangle rectangle_10, Rectangle rectangle_11, Rectangle rectangle_12,
                                  Rectangle rectangle_13, Rectangle rectangle_14, Rectangle rectangle_15, Rectangle rectangle_16,
                                  Rectangle rectangle_17, Rectangle rectangle_18, Rectangle rectangle_19, Rectangle rectangle_20, Rectangle index){
        while(contVehiculos == lugares.length){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Estacionamiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        contVehiculos++;
        position = buscarLugar();
        lugares[position] = 1;
        
        pintar(position,rectangle_1, rectangle_2, rectangle_3, rectangle_4, rectangle_5, rectangle_6, rectangle_7, rectangle_8, rectangle_9, rectangle_10, rectangle_11, rectangle_12, rectangle_13, rectangle_14, rectangle_15, rectangle_16, rectangle_17, rectangle_18, rectangle_19, rectangle_20,ocupado);
    }
    
    public synchronized void pull(Rectangle rectangle_1, Rectangle rectangle_2, Rectangle rectangle_3, Rectangle rectangle_4,
                                  Rectangle rectangle_5, Rectangle rectangle_6, Rectangle rectangle_7, Rectangle rectangle_8,
                                  Rectangle rectangle_9, Rectangle rectangle_10, Rectangle rectangle_11, Rectangle rectangle_12,
                                  Rectangle rectangle_13, Rectangle rectangle_14, Rectangle rectangle_15, Rectangle rectangle_16,
                                  Rectangle rectangle_17, Rectangle rectangle_18, Rectangle rectangle_19, Rectangle rectangle_20,
                                  Rectangle index, int p){
        pintar(p,rectangle_1, rectangle_2, rectangle_3, rectangle_4, rectangle_5, rectangle_6, rectangle_7, rectangle_8, rectangle_9, rectangle_10, rectangle_11, rectangle_12, rectangle_13, rectangle_14, rectangle_15, rectangle_16, rectangle_17, rectangle_18, rectangle_19, rectangle_20,vacio);
        lugares[p]=0;
        contVehiculos--;
        notifyAll();
    }
    
    public int getPosition(){
        return position;
    }
    
    public void print(){
        for(int y=0; y<lugares.length; y++){
            System.out.println(lugares[y]);
        }
    }
    
    public int buscarLugar(){
        for(int y=0; y<lugares.length; y++){
            if(lugares[y]==0){
                return y;
            }
        }
        return 0;
    }
    
    public void pintar(int pos, Rectangle r1, Rectangle r2, Rectangle r3, Rectangle r4, Rectangle r5, Rectangle r6, Rectangle r7, Rectangle r8, Rectangle r9, Rectangle r10, Rectangle r11, Rectangle r12, Rectangle r13, Rectangle r14, Rectangle r15, Rectangle r16, Rectangle r17, Rectangle r18, Rectangle r19, Rectangle r20, Color color){
        try {
            Thread.currentThread().sleep(310);
        } catch (InterruptedException ex) {
            Logger.getLogger(Estacionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        switch(pos){
                case 0:{
                    r1.setFill(color);
                    break;
                }
                case 1:{
                    r2.setFill(color);
                    break;
                }
                case 2:{
                    r3.setFill(color);
                    break;
                }
                case 3:{
                    r4.setFill(color);
                    break;
                }
                case 4:{
                    r5.setFill(color);
                    break;
                }
                case 5:{
                    r6.setFill(color);
                    break;
                }
                case 6:{
                    r7.setFill(color);
                    break;
                }
                case 7:{
                    r8.setFill(color);
                    break;
                }
                case 8:{
                    r9.setFill(color);
                    break;
                }
                case 9:{
                    r10.setFill(color);
                    break;
                }
                case 10:{
                    r11.setFill(color);
                    break;
                }
                case 11:{
                    r12.setFill(color);
                    break;
                }
                case 12:{
                    r13.setFill(color);
                    break;
                }
                case 13:{
                    r14.setFill(color);
                    break;
                }
                case 14:{
                    r15.setFill(color);
                    break;
                }
                case 15:{
                    r16.setFill(color);
                    break;
                }
                case 16:{
                    r17.setFill(color);
                    break;
                }
                case 17:{
                    r18.setFill(color);
                    break;
                }
                case 18:{
                    r19.setFill(color);
                    break;
                }
                case 19:{
                    r20.setFill(color);
                    break;
                }
            }
    }
}