/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopcenso;

/**
 *
 * @author oscar
 */
public class App {

    public static void main(String[] args) {
        // Crear viviendas
        Vivienda vivienda1 = new Vivienda("casa", "concreto", "alcantarillado", true, true, true, "propia", "Calle Falsa 123", 3, 2, "urbana");
        Vivienda vivienda2 = new Vivienda("departamento", "adobe", "alcantarillado", true, false, true, "rentada", "Calle Falsa 956", 1, 1, "urbana");
        // Agregar habitantes a las viviendas
        // Creamos un objeto Habitante para representar a la persona con la primera ocupación
        Habitante habitante1 = new Habitante("Juan", 30, 'M', "Soltero", "Licenciatura", "Programador", 2000, "Mexicano");

// Creamos un objeto Habitante para representar a la misma persona con la segunda ocupación
        Habitante habitante2 = new Habitante("Juan", 30, 'M', "Soltero", "Licenciatura", "Diseñador", 1500, "Mexicano");

// Mostramos los datos de ambos objetos
        System.out.println("Datos de la persona con la ocupación de programador:");
        habitante1.mostrarDatos();

        System.out.println("Datos de la persona con la ocupación de diseñador:");
        habitante2.mostrarDatos();

        Habitante habitante3 = new Habitante("Carlos", 40, 'M', "Casado", "Universidad", "Ingeniero", 10000, "Española");

        vivienda1.agregarHabitante(habitante1);
        vivienda1.agregarHabitante(habitante2);
        vivienda2.agregarHabitante(habitante3);

        vivienda1.mostrarInformacion();
        habitante1.mostrarDatos();
        habitante2.mostrarDatos();

        System.out.println("---------------");
        vivienda2.mostrarInformacion();
        habitante3.mostrarDatos();

    }
}
