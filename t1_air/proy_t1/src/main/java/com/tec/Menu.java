package com.tec;

import javax.swing.*;
import java.util.Scanner;

public class Menu implements IMenu{
    Avion a = new Avion();
    Hangar H = new Hangar();
    Pasajero P = new Pasajero();
    pasajerosAvion PA = new pasajerosAvion();
    private int Opcion;
    private int OpcionSub;

    public void menu() {
        try {
        Opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Ingresar Datos\n2. Modificar Asientos\n3. Excluir Avion\n4. Asignar Asiento\n5. Vaciar Asiento\n6. Consultar Avion\n7. Buscar Pasajero\n8. Consultar Asientos\n9. Mostrar Datos\n10. Salir"));
        switch (Opcion) {
            case 1:
                OpcionSub = Integer.parseInt(JOptionPane.showInputDialog("1. Ingresar Datos del Avion\n2. Ingresar Datos del Pasajero"));
                switch (OpcionSub) {
                    case 1:
                        CrearAvion();
                        menu();
                        break;
                    case 2:
                        PA.SolicitarDatosPasajero();
                        menu();
                        break;
                }

                break;
            case 2:
                ModificarAsientos();
                break;
            case 3:
                excluirAvion();
                break;
            case 4:
                AsignarAsiento();
                break;
            case 5:
                VaciarAsiento();
                break;
            case 6:
                ConsultarAvion();
                break;
            case 7:
                BuscarPasajero();
                break;
            case 8:
                ConsultarAsientos();
                break;
            case 9:
                PA.mostrarAvionYPasajero();
                break;
            case 10:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
                menu();
                break;

        }
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
        menu();
    }
    }
    @Override
    public void CrearAvion() {

        String s = "";
        try {


            a.setIDAvion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del avion")));
            a.setNombreAvion(JOptionPane.showInputDialog("Ingrese la placa del avion"));
            if (a.getNombreAvion().length() != 5) {
                JOptionPane.showMessageDialog(null, "La placa del avion debe de ser distinta a 5 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
                menu();
            }
            a.setCapacidadAvion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del avion")));
            if (a.getCapacidadAvion() < 2 || a.getCapacidadAvion() > 142) {
                JOptionPane.showMessageDialog(null, "La capacidad del avion no puede ser menor a 2 ni mayor a 142", "Error", JOptionPane.ERROR_MESSAGE);
                menu();
            }
            JOptionPane.showMessageDialog(null, s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            menu();
        }




    }

    public void MostrarAvion(){
        String s = "";
        s += "El ID del avion es: " + a.getIDAvion() + "\n" + "La placa del avion es: " + a.getNombreAvion() + "\n" + "La capacidad del avion es: " + a.getCapacidadAvion() + "\n";
        JOptionPane.showMessageDialog(null, s);
    }
    @Override
    public void ModificarAsientos() {

    }

    @Override
    public void excluirAvion() {

    }

    @Override
    public void AsignarAsiento() {

    }

    @Override
    public void VaciarAsiento() {

    }

    @Override
    public void ConsultarAvion() {

    }

    @Override
    public void BuscarPasajero() {

    }

    @Override
    public void ConsultarAsientos() {

    }
}
