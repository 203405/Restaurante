package estacionamiento.component;

import estacionamiento.model.Estacionamiento;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.concurrent.Semaphore;

public class Recurso{
    Semaphore semaphore;
    Label contEspera;
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
    int contador = 0;

    public Recurso() { }

    public void cajon(Rectangle rectangle_1, Rectangle rectangle_2, Rectangle rectangle_3, Rectangle rectangle_4,
                      Rectangle rectangle_5, Rectangle rectangle_6, Rectangle rectangle_7, Rectangle rectangle_8,
                      Rectangle rectangle_9, Rectangle rectangle_10, Rectangle rectangle_11, Rectangle rectangle_12,
                      Rectangle rectangle_13, Rectangle rectangle_14, Rectangle rectangle_15, Rectangle rectangle_16,
                      Rectangle rectangle_17, Rectangle rectangle_18, Rectangle rectangle_19, Rectangle rectangle_20,
                      Rectangle index, Label contEspera, Semaphore semaphore, int dir, Estacionamiento estacionamiento) throws InterruptedException{
        semaphore.acquire();//Requerimos Semaforo
        index.setFill(Color.GREEN);
        estacionamiento.push(rectangle_1, rectangle_2, rectangle_3, rectangle_4, rectangle_5, rectangle_6, rectangle_7, rectangle_8, rectangle_9, rectangle_10, rectangle_11, rectangle_12, rectangle_13, rectangle_14, rectangle_15, rectangle_16, rectangle_17, rectangle_18, rectangle_19, rectangle_20, index);
        semaphore.release();
    }
}