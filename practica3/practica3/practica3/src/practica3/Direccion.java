package practica3;

public class Direccion {

    String calle;
    int numero;
    String puerta;
    Integer codPostal;
    String ciudad;
    String provincia;

    public Direccion(String calle, int numero, String puerta, Integer codPostal, String ciudad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Integer getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
