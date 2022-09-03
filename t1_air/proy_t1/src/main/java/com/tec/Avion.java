package com.tec;

import javax.swing.*;

public class Avion {
    private int IDAvion;

    private String NombreAvion;
    private int CapacidadAvion;
    private int ColumnasEconomicas;
    private int FilasEconomicas;
    private int ColumnasNegocios;
    private int FilasNegocios;

    private static String FilasA[] = new String[6];
    private static String FilasB[] = new String[6];
    private static String FilasC[] = new String[6];
    private static String FilasD[] = new String[6];
    private static String FilasE[] = new String[6];
    private static String FilasF[] = new String[6];
    private static String FilasANegocio[] = new String[4];
    private static String FilasBNegocio[] = new String[4];
    private static String FilasDNegocio[] = new String[4];
    private static String FilasENegocio[] = new String[4];

    public Avion() {
        this.IDAvion = 0;
        this.CapacidadAvion = 0;
        this.ColumnasEconomicas = 0;
        this.FilasEconomicas = 0;
        this.ColumnasNegocios = 0;
        this.FilasNegocios = 0;
        this.NombreAvion = "";
    }

    public void FilasA() {
        FilasA[0] = "A1";
        FilasA[1] = "A2";
        FilasA[2] = "A3";
        FilasA[3] = "A4";
        FilasA[4] = "A5";
        FilasA[5] = "A6";
    }
    public void FilasB() {
        FilasB[0] = "B1";
        FilasB[1] = "B2";
        FilasB[2] = "B3";
        FilasB[3] = "B4";
        FilasB[4] = "B5";
        FilasB[5] = "B6";
    }
    public void FilasC() {
        FilasC[0] = "C1";
        FilasC[1] = "C2";
        FilasC[2] = "C3";
        FilasC[3] = "C4";
        FilasC[4] = "C5";
        FilasC[5] = "C6";
    }
    public void FilasD() {
        FilasD[0] = "D1";
        FilasD[1] = "D2";
        FilasD[2] = "D3";
        FilasD[3] = "D4";
        FilasD[4] = "D5";
        FilasD[5] = "D6";
    }
    public void FilasE() {
        FilasE[0] = "E1";
        FilasE[1] = "E2";
        FilasE[2] = "E3";
        FilasE[3] = "E4";
        FilasE[4] = "E5";
        FilasE[5] = "E6";
    }
    public void FilasF() {
        FilasF[0] = "F1";
        FilasF[1] = "F2";
        FilasF[2] = "F3";
        FilasF[3] = "F4";
        FilasF[4] = "F5";
        FilasF[5] = "F6";
    }
    public void FilasANegocio() {
        FilasANegocio[0] = "A1";
        FilasANegocio[1] = "A2";
        FilasANegocio[2] = "A3";
        FilasANegocio[3] = "A4";
    }
    public void FilasBNegocio() {
        FilasBNegocio[0] = "B1";
        FilasBNegocio[1] = "B2";
        FilasBNegocio[2] = "B3";
        FilasBNegocio[3] = "B4";
    }
    public void FilasDNegocio() {
        FilasDNegocio[0] = "D1";
        FilasDNegocio[1] = "D2";
        FilasDNegocio[2] = "D3";
        FilasDNegocio[3] = "D4";
    }
    public void FilasENegocio() {
        FilasENegocio[0] = "E1";
        FilasENegocio[1] = "E2";
        FilasENegocio[2] = "E3";
        FilasENegocio[3] = "E4";
    }
    public void AsientosEconomicos() {
        FilasA();
        FilasB();
        FilasC();
        FilasD();
        FilasE();
        FilasF();
        String s = "";
        for (int i = 0; i < FilasA.length; i++) {
            s = s + FilasA[i] + "  " + FilasB[i] + "  " + FilasC[i] + "  " + FilasD[i] + "  " + FilasE[i] + "  " + FilasF[i] + "\n" + "\n" + "\n";
        }
        JOptionPane.showMessageDialog(null, s);

    }
    public void AsientosNegocios() {
        FilasANegocio();
        FilasBNegocio();
        FilasDNegocio();
        FilasENegocio();
    }



    public String getNombreAvion() {
        return NombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        NombreAvion = nombreAvion;
    }

    public int getIDAvion() {
        return IDAvion;
    }

    public void setIDAvion(int IDAvion) {
        this.IDAvion = IDAvion;
    }

    public int getCapacidadAvion() {
        return CapacidadAvion;
    }

    public void setCapacidadAvion(int capacidadAvion) {
        CapacidadAvion = capacidadAvion;
    }

    public int getColumnasEconomicas() {
        return ColumnasEconomicas;
    }

    public void setColumnasEconomicas(int columnasEconomicas) {
        ColumnasEconomicas = columnasEconomicas;
    }

    public int getFilasEconomicas() {
        return FilasEconomicas;
    }

    public void setFilasEconomicas(int filasEconomicas) {
        FilasEconomicas = filasEconomicas;
    }

    public int getColumnasNegocios() {
        return ColumnasNegocios;
    }

    public void setColumnasNegocios(int columnasNegocios) {
        ColumnasNegocios = columnasNegocios;
    }

    public int getFilasNegocios() {
        return FilasNegocios;
    }

    public void setFilasNegocios(int filasNegocios) {
        FilasNegocios = filasNegocios;
    }
}
