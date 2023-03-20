/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopcenso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
public class Vivienda {
    private String tipo; // (casa, apartamento, etc.)
    private String material; //(Vivienda de concreto, Vivienda de adobe (antiguo), Vivienda de ladrillo, Vivienda de madera...)
    private String saneamiento; //(alcantarillado, pozo séptico, letrina, etc.)
    private boolean agua;
    private boolean luz;
    private boolean drenaje;
    private String tendencia; //(propia, alquilada, en comodato, etc.)
    private String direccion; //(Dirección de la vivienda)
    private int numHabitaciones;//(Número de habitaciones)
    private int numBanios;//(Número de baños)
    private String ubicacion; //(Rural, urbana)
    private List<Habitante> habitantes; // Agregamos un atributo para almacenar los habitantes

    public Vivienda(String tipo, String material, String saneamiento, boolean agua, boolean luz, boolean drenaje, String tendencia, String direccion, int numHabitaciones, int numBanios, String ubicacion) {
        this.tipo = tipo;
        this.material = material;
        this.saneamiento = saneamiento;
        this.agua = agua;
        this.luz = luz;
        this.drenaje = drenaje;
        this.tendencia = tendencia;
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;
        this.numBanios = numBanios;
        this.ubicacion = ubicacion;
        this.habitantes = new ArrayList<Habitante>(); // Inicializamos la lista de habitantes
    }

    public String getTipo() {
        return tipo;
    }

    public String getMaterial() {
        return material;
    }

    public String getSaneamiento() {
        return saneamiento;
    }

    public boolean getAgua() {
        return agua;
    }

    public boolean getLuz() {
        return luz;
    }

    public boolean getDrenaje() {
        return drenaje;
    }

    public String getTendencia() {
        return tendencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setTipo(String tipo) {
    this.tipo = tipo;
}

public void setMaterial(String material) {
    this.material = material;
}

public void setSaneamiento(String saneamiento) {
    this.saneamiento = saneamiento;
}

public void setAgua(boolean agua) {
    this.agua = agua;
}

public void setLuz(boolean luz) {
    this.luz = luz;
}

public void setDrenaje(boolean drenaje) {
    this.drenaje = drenaje;
}

public void setTendencia(String tendencia) {
    this.tendencia = tendencia;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public void setNumHabitaciones(int numHabitaciones) {
    this.numHabitaciones = numHabitaciones;
}

public void setNumBanios(int numBanios) {
    this.numBanios = numBanios;
}

public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
}

    public void agregarHabitante(Habitante habitante) {
        habitantes.add(habitante);
    }

    public List<Habitante> getHabitantes() {
        return habitantes; // Agregamos un método para acceder a la lista de habitantes
    }
    
    public void mostrarInformacion() {
    System.out.println("Tipo de vivienda: " + tipo);
    System.out.println("Material de construcción: " + material);
    System.out.println("Saneamiento: " + saneamiento);
    System.out.println("¿Tiene agua?: " + (agua ? "Sí" : "No"));
    System.out.println("¿Tiene luz?: " + (luz ? "Sí" : "No"));
    System.out.println("¿Tiene drenaje?: " + (drenaje ? "Sí" : "No"));
    System.out.println("Tendencia: " + tendencia);
    System.out.println("Dirección: " + direccion);
    System.out.println("Número de habitaciones: " + numHabitaciones);
    System.out.println("Número de baños: " + numBanios);
    System.out.println("Ubicación: " + ubicacion);
}
}


