package com.andresdelgado;

import com.google.gson.Gson;

public class Main {
    public static void main (String[] args) {

        Persona persona = new Persona("Paco", "Pérez", 90, "paco@gmail.com");

        Gson gson = new Gson();
        String json = gson.toJson(persona);

        System.out.println(json);

    }

}