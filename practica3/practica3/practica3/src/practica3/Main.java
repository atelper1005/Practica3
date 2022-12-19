package practica3;

public class Main {

    public static void main(String[] args) {

        Direccion b1 = new Direccion("Bombacho", 43, "5A", 11430, "Bornos", "Cádiz");
        Alumno Juan = new Alumno("Juan", "Manin", "Kilombo", 8, false, 7.6f, "junito@email.com", b1);
        Alumno Paco = new Alumno("Francisco", "Gómez", "Pirlo", 14, true, 6.8f, "paco@paquelas.com", b1);

        System.out.println(Alumno.nota_media(Juan.getNota_media(), Paco.getNota_media()));

    }
}
