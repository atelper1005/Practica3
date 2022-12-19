package practica3;

public class Alumno {

    static protected String nombre;
    static protected String apellidos;
    static protected Integer edad;
    static protected boolean repetidor;
    static protected float nota_media;
    static protected String email;

    protected Alumno() {}

    protected Alumno(String nombre, String apellidos, Integer edad) {

    }

    static void nota_media() {

    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Alumno.nombre = nombre;
    }

    public static String getApellidos() {
        return apellidos;
    }

    public static void setApellidos(String apellidos) {
        Alumno.apellidos = apellidos;
    }

    public static Integer getEdad() {
        return edad;
    }

    public static void setEdad(Integer edad) {
        Alumno.edad = edad;
    }

    public static boolean isRepetidor() {
        return repetidor;
    }

    public static void setRepetidor(boolean repetidor) {
        Alumno.repetidor = repetidor;
    }

    public static float getNota_media() {
        return nota_media;
    }

    public static void setNota_media(float nota_media) {
        Alumno.nota_media = nota_media;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Alumno.email = email;
    }
}
