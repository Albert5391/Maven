package com.andresdelgado;

/**
 * Clase Persona
 */

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Constructor con argumentos
     * @param nombre el nombre de la persona 
     * @param apellidos los apellidos de la persona
     * @param edad la edad de la persona
     * @param email el email de la persona
     */

    public Persona (String nombre, String apellidos, int edad, String email) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;

    }

    /**
     * Getter de nombre
     * @return el nombre de la persona
     */

    public String getNombre () {

        return this.nombre;

    }

    public static Persona factoryMethod (String cadena) {

        if (cadena == null) {

            System.err.println("ERROR.");

        }

        String[] partes = cadena.split(",");
        
        if (partes.length != 4) {

            return null;

        }

        try {

            String nombre = partes[0];
            String apellidos = partes[1];

            int edad = Integer.parseInt(partes[2]);

            String email = partes[3];

            return new Persona(partes[0], partes[1], edad, partes[3]);

        }

        catch (Exception e) {



        }

        return new Persona(partes[0], partes[1], edad, partes[3]);



    }
    
}
