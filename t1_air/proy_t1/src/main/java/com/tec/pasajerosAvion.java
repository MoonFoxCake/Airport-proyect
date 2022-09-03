package com.tec;

import javax.swing.*;

public class pasajerosAvion {
    Avion A = new Avion();
    Pasajero P = new Pasajero();
    Hangar H = new Hangar();

    public void SolicitarDatosAvion(){
        A.setIDAvion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del avion")));
        A.setNombreAvion(JOptionPane.showInputDialog("Ingrese la placa del avion"));
        A.setCapacidadAvion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del avion")));
    }
    public void SolicitarDatosPasajero(){
        P.setNombrePasajero(JOptionPane.showInputDialog("Ingrese el nombre del pasajero"));
        P.setCodigoPasajero(JOptionPane.showInputDialog("Ingrese el codigo del pasajero"));
        P.setNacionalidad(JOptionPane.showInputDialog("Ingrese la nacionalidad del pasajero"));
    }
    public void mostrarDatosAvion(){
        JOptionPane.showMessageDialog(null, "ID del avion: " + A.getIDAvion() + "\nPlaca del avion: " + A.getNombreAvion() + "\nCapacidad del avion: " + A.getCapacidadAvion());
    }

    public void mostrarDatosPasajero(){
        JOptionPane.showMessageDialog(null, "Nombre del pasajero: " + P.getNombrePasajero() + "\nCodigo del pasajero: " + P.getCodigoPasajero() + "\nNacionalidad del pasajero: " + P.getNacionalidad());
    }
    public void mostrarAvionYPasajero(){
        JOptionPane.showMessageDialog(null, "ID del avion: " + A.getIDAvion() + "\nPlaca del avion: " + A.getNombreAvion() + "\nCapacidad del avion: " + A.getCapacidadAvion() + "\nNombre del pasajero: " + P.getNombrePasajero() + "\nCodigo del pasajero: " + P.getCodigoPasajero() + "\nNacionalidad del pasajero: " + P.getNacionalidad());
    }


}
