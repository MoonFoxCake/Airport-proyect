package com.tec;

public class Pasajero {
    protected String NombrePasajero;
    protected String CodigoPasajero;
    protected String Nacionalidad;


    public Pasajero() {
        this.NombrePasajero = "";
        this.CodigoPasajero = "";
        this.Nacionalidad = "";
    }







    public String getNombrePasajero() {
        return NombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        NombrePasajero = nombrePasajero;
    }

    public String getCodigoPasajero() {
        return CodigoPasajero;
    }

    public void setCodigoPasajero(String codigoPasajero) {
        CodigoPasajero = codigoPasajero;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
}



