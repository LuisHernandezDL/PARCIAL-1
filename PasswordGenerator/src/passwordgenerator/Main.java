/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passwordgenerator;

/**
 * Clase principal para probar la generación de contraseñas.
 */
public class Main {
    public static void main(String[] args) {
        // Prueba de la versión 1 (default)
        System.out.println("Contraseña generada (Versión 1 - Default): " + PasswordGenerator.generatePassword(10));

        // Configuración personalizada para la versión 2
        PasswordConfigDTO config = new PasswordConfigDTO(
            8,  // Longitud mínima
            true, 2,  // Restricción de dígitos y cantidad mínima
            true, 2,  // Restricción de mayúsculas y cantidad mínima
            true, 2,  // Restricción de minúsculas y cantidad mínima
            true, 2   // Restricción de caracteres especiales y cantidad mínima
        );

        // Prueba de la versión 2 (configurable)
        System.out.println("Contraseña generada (Versión 2 - Configurable): " + PasswordGenerator.generatePassword(config));
    }
}
