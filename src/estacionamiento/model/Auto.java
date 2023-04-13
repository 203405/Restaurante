package estacionamiento.model;

import estacionamiento.component.Recurso;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Auto extends Thread{
    
    Estacionamiento estacionamiento;
    private Rectangle rectangle_1;
    private Rectangle rectangle_2;
    private Rectangle rectangle_3;
    private Rectangle rectangle_4;
    private Rectangle rectangle_5;
    private Rectangle rectangle_6;
    private Rectangle rectangle_7;
    private Rectangle rectangle_8;
    private Rectangle rectangle_9;
    private Rectangle rectangle_10;
    private Rectangle rectangle_11;
    private Rectangle rectangle_12;
    private Rectangle rectangle_13;
    private Rectangle rectangle_14;
    private Rectangle rectangle_15;
    private Rectangle rectangle_16;
    private Rectangle rectangle_17;
    private Rectangle rectangle_18;
    private Rectangle rectangle_19;
    private Rectangle rectangle_20;
    private Rectangle index;
    private Recurso recurso;
    private Semaphore semaphore;
    private Tiempo timer;
    private int temp;
    public Auto(Estacionamiento estacionamiento, Rectangle rectangle_1, Rectangle rectangle_2, Rectangle rectangle_3, Rectangle rectangle_4, Rectangle rectangle_5,
                Rectangle rectangle_6, Rectangle rectangle_7, Rectangle rectangle_8, Rectangle rectangle_9, Rectangle rectangle_10,
                Rectangle rectangle_11, Rectangle rectangle_12, Rectangle rectangle_13, Rectangle rectangle_14, Rectangle rectangle_15,
                Rectangle rectangle_16, Rectangle rectangle_17, Rectangle rectangle_18, Rectangle rectangle_19, Rectangle rectangle_20,
                Rectangle index, Semaphore semaphore) {
        this.estacionamiento = estacionamiento;
        this.semaphore = semaphore;
        this.rectangle_1 = rectangle_1;
        this.rectangle_2 = rectangle_2;
        this.rectangle_3 = rectangle_3;
        this.rectangle_4 = rectangle_4;
        this.rectangle_5 = rectangle_5;
        this.rectangle_6 = rectangle_6;
        this.rectangle_7 = rectangle_7;
        this.rectangle_8 = rectangle_8;
        this.rectangle_9 = rectangle_9;
        this.rectangle_10 = rectangle_10;
        this.rectangle_11 = rectangle_11;
        this.rectangle_12 = rectangle_12;
        this.rectangle_13 = rectangle_13;
        this.rectangle_14 = rectangle_14;
        this.rectangle_15 = rectangle_15;
        this.rectangle_16 = rectangle_16;
        this.rectangle_17 = rectangle_17;
        this.rectangle_18 = rectangle_18;
        this.rectangle_19 = rectangle_19;
        this.rectangle_20 = rectangle_20;
        this.index = index;
    }

    //Constructor Vacio
    public Auto(){

    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            index.setFill(Color.GREEN);
            Thread.currentThread().sleep(100);//Espera para entrar
            estacionamiento.push(rectangle_1, rectangle_2, rectangle_3, rectangle_4, rectangle_5, rectangle_6, rectangle_7, rectangle_8, rectangle_9, rectangle_10, rectangle_11, rectangle_12, rectangle_13, rectangle_14, rectangle_15, rectangle_16, rectangle_17, rectangle_18, rectangle_19, rectangle_20, index);
            temp = estacionamiento.getPosition();
            semaphore.release();

            semaphore.acquire();
            timer = new Tiempo(rectangle_1, rectangle_2, rectangle_3, rectangle_4, rectangle_5, rectangle_6, rectangle_7, rectangle_8, rectangle_9, rectangle_10, rectangle_11, rectangle_12, rectangle_13, rectangle_14, rectangle_15, rectangle_16, rectangle_17, rectangle_18, rectangle_19, rectangle_20, index, semaphore, estacionamiento, temp);
            timer.start();
            Thread.currentThread().sleep(100);//Tiempo que se genera un vehiculo
            semaphore.release();

        } catch (InterruptedException ex) {
            Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}