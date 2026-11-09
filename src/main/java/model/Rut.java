package model;

import exception.RutInvalidoException;

/**
 * Representa un RUT y valida su formato.
 */

public class Rut {

    private String numero;

    /**
     * Crea un RUT si tiene el formato esperado.
     *
     * @param numero RUT escrito como números, guion y dígito verificador
     * @throws RutInvalidoException si el formato no es válido
     */

    public Rut(String numero) throws RutInvalidoException {
        if (!numero.matches("[0-9]+-[0-9kk]")) {
            throw new RutInvalidoException("El RUT debe tener el formato 12345678-9");
        }
        this.numero = numero;
    }

    /**
     * Devuelve el número de RUT.
     *
     * @return número de RUT validado
     */

    public String getNumero() {
        return numero;
    }

    /**
     * Devuelve el RUT en un formato legible.
     *
     * @return RUT con la etiqueta "RUT"
     */

    @Override
    public String toString() {
        return "Rut: " + numero;
    }
}
