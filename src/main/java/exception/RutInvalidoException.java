package exception;

/**
 * Excepción para informar que el RUT ingresado no es válido.
 */

public class RutInvalidoException  extends Exception{

    /**
     * Crea la excepción con una explicación del error.
     *
     * @param mensaje detalle del problema con el RUT
     */

    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}
