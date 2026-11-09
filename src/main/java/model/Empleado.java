package model;

import exception.RutInvalidoException;

/**
 * Representa a una persona que trabaja para Llanquihue Tour.
 */

public class Empleado extends Persona {

    private String codigoEmpleado;
    private String cargo;

    /**
     * Crea un empleado con sus datos personales y laborales.
     *
     * @param nombres nombres del empleado
     * @param apellidos apellidos del empleado
     * @param rut RUT del empleado
     * @param direccion dirección del empleado
     * @param codigoEmpleado código interno del empleado
     * @param cargo cargo del empleado
     * @throws RutInvalidoException si el RUT no tiene el formato correcto.
     */

    public Empleado(String nombres, String apellidos, String rut, Direccion direccion, String codigoEmpleado, String cargo) throws RutInvalidoException {
        super(nombres, apellidos, rut, direccion);
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
    }

    /** @return código interno del empleado */

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /** @param codigoEmpleado nuevo código interno del empleado */

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Devuelve los datos personales y laborales del empleado.
     *
     * @return descripción del empleado
     */

    @Override
    public String toString() {
        return "Empleado: " +
                "codigo='" + codigoEmpleado + '\'' +
                ", cargo='" + cargo + '\'' +
                '.';
    }
}
