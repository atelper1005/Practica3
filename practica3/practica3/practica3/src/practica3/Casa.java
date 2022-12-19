package practica3;

public class Casa {

    private Integer precio;
    private char energia;
    private String terreno;
    private final Integer IVA = 21;
    private final Integer IVA_reducido = 16;
    private Direccion direccion;

    public Casa(Integer precio, char energia, String terreno, Direccion direccion) {
        this.precio = precio;
        this.energia = energia;
        this.terreno = terreno;
        this.direccion = direccion;
    }

    Integer precioIva() {
        Integer resultado = (precio * IVA / 100) + precio;
        return resultado;
    }

    Integer precioIvaReducido() {
        Integer resultadoReduc = (precio * IVA_reducido / 100) + precio;
        return resultadoReduc;
    }

    void Imprimir() {
        System.out.println("Referencia catastral: " + terreno);
        System.out.println("Precio sin IVA:" + precio);
        System.out.println("Precio con IVA: " + precioIva());
        System.out.println("Precio con IVA reducido: " + precioIvaReducido());
    }
}
