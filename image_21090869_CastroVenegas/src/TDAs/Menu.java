/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.util.InputMismatchException;
import java.util.Scanner;
        
/**
 *
 * @author arace
 */
public class Menu {
    
    
    public void ejecutarMenu() {
            
        Scanner input = new Scanner(System.in);
        boolean salirMenu = false;
        int eleccion;        
        while (!salirMenu){
            
            System.out.println("### Manipulador de imágenes ###");
            System.out.println("Escoja su opción: ");
            System.out.println("1. Crear una imagen");
            System.out.println("2. Modificar una imagen");
            System.out.println("3. Visualizar imagen");
            System.out.println("4. Salir");
                try {
                    System.out.println("INTRODUZCA SU OPCIÓN: ");
                    eleccion = input.nextInt();
                    switch (eleccion) {

                        case 1: // CREAR IMAGEN
                            System.out.println("### Manipulador de imágenes ###");
                            System.out.println("Escoja su opción: ");
                            System.out.println("1. Crear bitmap");
                            System.out.println("2. Crear pixmap");
                            System.out.println("3. Crear hexmap");
                            System.out.println("4. Volver");
                            eleccion = input.nextInt(); 
                            switch (eleccion) {
                                
                                
                                
                            }

                            break;

                        case 2: // MODIFICAR IMAGEN
                             
                            
                            
                            break;

                        case 3: // VISUALIZAR IMAGEN
                             
                            break;

                        case 4: // CERRAR PROGRAMA
                            System.out.println("Se cierra el programa");
                            salirMenu = true;
                            input.close();
                            break;
                            
                        default:
                            System.out.println("Seleccione nuevamente una de las opciones anteriores");
                            break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("El menu solo admite como entrada numeros y alguna de las opciones anteriores");
                    input.next();
                }
    
        }
    }
}
        
        
