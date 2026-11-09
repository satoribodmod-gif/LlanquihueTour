package model;

/**
 *  Representa una dirección asociada a una persona.
 */

public class Direccion {

    private String calle;
    private String numero;
    private String comuna;
    private String region;

    /**
     *
     * Crea una dirección con sus datos correspondientes
     *
     * @param calle nombre de la calle
     * @param numero número de la dirección
     * @param comuna comuna donde se encuentra
     * @param region región donde se encuentra
     */

    public Direccion(String calle, String numero, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Devuelta la dirección en un formato legible.
     * @return
     */

    @Override
    public String toString() {
        return "Direccion" +
                "calle='" + calle + '\'' +
                ", número='" + numero + '\'' +
                ", comuna='" + comuna + '\'' +
                ", region='" + region + '\'' +
                '.';
    }
}
