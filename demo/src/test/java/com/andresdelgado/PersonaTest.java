package com.andresdelgado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    void testFactoryMethod() {

        // AAA (Arrange, Act, Assert)
// Arrange
String input = "Juan,Garcia,25,juan@email.com";
// Act
Persona persona = Persona.fromString(input);
// Assert
assertNotNull(persona);
assertEquals("Juan", persona.getNombre());
assertEquals("Garcia", persona.getApellidos());
assertEquals(25, persona.getEdad());
assertEquals("juan@email.com", persona.getEmail());
}

        
    }
    
