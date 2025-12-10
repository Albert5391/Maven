package com.andresdelgado;

/**
 * Clase Persona
 */

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

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
    
}
