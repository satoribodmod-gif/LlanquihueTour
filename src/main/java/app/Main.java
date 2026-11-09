package app;

import exception.RutInvalidoException;
import model.Direccion;
import model.Empleado;
import model.Persona;

/**
 * Ejecuta un ejemplo del modelo de Llanquihue Tour.
 */

public class Main {

    /**
     * Crea personas de ejemplo y muestra sus datos.
     *
     * @param args argumentos de la línea de comandos
     */

    public static void main(String[] args) {


        try {
            Direccion direccionEjemplo = new Direccion(
                    "Av. Rosales", "120", "Llanquihue", "Los Lagos");

            Persona personaUno = new Persona(
                    "Camila Andrea", "Rojas Soto", "52395678-9", direccionEjemplo
            );

            Empleado empleado = new Empleado(
                    "Diego", "Mallado Ruiz", "82751728-9", direccionEjemplo, "EMP-001", "Guía turístico"
            );

            Persona personDos = new Persona(
                    "Valentina", "Muñoz Díaz", "17493723-4", direccionEjemplo
            );

            System.out.println("Personas de Llanquihue Tour:");
            System.out.println(personaUno);
            System.out.println(empleado);
            System.out.println(personDos);

            Persona personaInvalido = new Persona(
                    "Jaime", "NN", "123", direccionEjemplo
            );

        } catch (RutInvalidoException e) {
            System.out.println("No se pudo crear el registro: " + e.getMessage());
        }
    }
}
