/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import TDAs.Image_21090869_CastroVenegas;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
        
/**
 *
 * @author arace
 */
public class Menu {
    
    
    public void ejecutarMenu() {
        
        ArrayList <Image_21090869_CastroVenegas> imagenes = new ArrayList(); // lista de imagenes creadas
            
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
                    System.out.println("Introduzca su opción: ");
                    eleccion = input.nextInt();
                    switch (eleccion) {

                        case 1: // CREAR IMAGEN
                            System.out.println("### Manipulador de imágenes ###");
                            System.out.println("Escoja su opción: ");
                            System.out.println("1. Crear bitmap");
                            System.out.println("2. Crear pixmap");
                            System.out.println("3. Crear hexmap");
                            System.out.println("4. Volver");
                            
                            try{
                            
                                eleccion = input.nextInt(); 
                                switch (eleccion) {
                                    case 1: // crear bitmap
                                        break;
                                        
                                    case 2: // crear pixmap
                                        break;
                                        
                                    case 3: // crear hexmap
                                        break;
                                        
                                    case 4: // volver
                                        break;
                                
                                
                                
                                }
                            
                            } catch(Exception e){
                                System.out.println("El menu solo admite como entrada numeros y alguna de las opciones anteriores");
                                input.next();
                            
                            }
                            

                            break;

                        case 2: // MODIFICAR IMAGEN
                            
                            try{
                                
                                System.out.println("Introduzca su opción: ");
                                eleccion = input.nextInt();
                                switch (eleccion) {
                                    
                                    case 1: // enumerar opciones de modificaciones de imagenes
                                        break;
                                
                                }
                                
                            
                            
                            
                            } catch(Exception e){
                                System.out.println("El menu solo admite como entrada numeros y alguna de las opciones anteriores");
                                input.next();
                            
                            }
                          
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
        
        
