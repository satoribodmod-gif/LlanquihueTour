package model;

import exception.RutInvalidoException;

/**
 * Representa a una persona relacionada con Llanquihue Tour.
 */

public class Persona {

    private String nombres;
    private String apellidos;
    private Rut rut;
    private Direccion direccion;

    /**
     * Crea una persona con sus datos y una dirección
     *
     */


    public Persona(String nombres, String apellidos, String rut, Direccion direccion)
            throws RutInvalidoException {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = new Rut (rut);
        this.direccion = direccion;
    }

    /**
     * Devuelve los nombres de la persona.
     *
     */

    public String getNombres() {
        return nombres;
    }

    /**
     * Actualiza los nombres de la persona.
     *
     */

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(String rut) throws RutInvalidoException {
        this.rut = new Rut(rut);
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve los datos de la persona en un formato legible.
     * @return descripción de la persona
     */

    @Override
    public String toString() {
        return
                "Nombres='" + nombres + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", Rut='" + rut + '\'' +
                ", Direccion=" + direccion +
                '.';
    }
}
