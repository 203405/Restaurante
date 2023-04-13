module estacionamiento {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens estacionamiento;
    opens estacionamiento.model;
    opens estacionamiento.component;
    opens estacionamiento.controller;
}