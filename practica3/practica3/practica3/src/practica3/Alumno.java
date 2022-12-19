package practica3;

import Herencia.Practica3.Persona;

public class Alumno extends Persona{
    protected boolean repetidor;
    protected float nota_media;
    protected String email;
    protected Direccion direccion;

    public Alumno(String nombre, String primerApellido, String segundoApellido, Integer edad) {
        super(nombre, primerApellido, segundoApellido, edad);
    }

    public Alumno(String nombre, String primerApellido, String segundoApellido, Integer edad, boolean repetidor, float nota_media, String email, Direccion direccion) {
        super(nombre, primerApellido, segundoApellido, edad);
        this.repetidor = repetidor;
        this.nota_media = nota_media;
        this.email = email;
        this.direccion = direccion;
    }

    static float nota_media(float a, float b) {
        return Math.max(a, b);
    }


    public boolean getRepetidor() {
        return repetidor;
    }

    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

    public float getNota_media() {
        return nota_media;
    }

    public void setNota_media(float nota_media) {
        this.nota_media = nota_media;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
