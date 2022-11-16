/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arace
 */
public class Pixrgb_21090869_CastroVenegas extends Pixeles_21090869_CastroVenegas{
   
    // variables del pixrgb
    private final int colorR;
    private final int colorG;
    private final int colorB;
    
    public ArrayList pixelesRGB = new ArrayList(); // lista de pixeles pixrgb
    
    // constructor de un pixrgb
    public Pixrgb_21090869_CastroVenegas(int vCoordX, int vCoordY, int vColorR, int vColorG, int vColorB, int vProfundidad){
        this.colorR = vColorR;
        this.colorG = vColorG;
        this.colorB = vColorB;
        this.coordX = vCoordX;
        this.coordY = vCoordY;
        this.profundidad = vProfundidad;
        
        // crea el pixrgb [coordX, coordY, colorR, colorG, colorB, profundidad]
        pixel.add(coordX);
        pixel.add(coordY);
        pixel.add(colorR);
        pixel.add(colorG);
        pixel.add(colorB);
        pixel.add(profundidad);
    
    }
    
    // pertenencia de pixrgb
    public boolean esPixrgb(int vCoordX, int vCoordY, int vColorR, int vColorG, int vColorB, int vProfundidad){
        return vCoordX >= 0 && vCoordY >= 0 && vProfundidad >= 0 && vColorR >= 0 && vColorR <= 255 && vColorG >= 0 && vColorG <= 255 && vColorB >= 0 && vColorB <= 255;
    }
   
    // pedir datos de un Pixrgb
    public int PedirPixrgb(int numeroPixel){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pixrgb " + numeroPixel);
        
        System.out.print("Ingresar x: ");
        int vCoordX = entrada.nextInt();
        
        System.out.print("Ingresar y: ");
        int vCoordY = entrada.nextInt();
        
        System.out.print("Ingresar colorR: ");
        int vColorR = entrada.nextInt();
        
        System.out.print("Ingresar colorG: ");
        int vColorG = entrada.nextInt(); 
        
        System.out.print("Ingresar colorB: ");
        int vColorB = entrada.nextInt();
        
        System.out.print("Ingresar profundidad: ");
        int vProfundidad = entrada.nextInt();
        
        // crea el objeto pixrgb
        Pixrgb_21090869_CastroVenegas pixelRGB = new Pixrgb_21090869_CastroVenegas(vCoordX, vCoordY, vColorR, vColorG, vColorB, vProfundidad);
        
        // si es un pixrgb
        if (pixelRGB.esPixrgb(vCoordX, vCoordY, vColorR, vColorG, vColorB, vProfundidad)){
            
            // se añade a los pixeles y se añade a la lista de pixeles pixrgb
            this.pixel = pixelRGB.pixel;           
            pixelesRGB.add(pixel);
            return 0;
            
        } else{
            System.out.println("El pixel pixrgb esta mal ingresado, intentelo de nuevo");
            return 1;
        }
    }
    
    
    // crear la lista de pixrgb
    public ArrayList ImagePixrgb(int cantidadPixeles, int ancho, int largo){
        
        // crea un objeto pixrgb
        Pixrgb_21090869_CastroVenegas pixelRGB = new Pixrgb_21090869_CastroVenegas(0,0,0,0,0,0);
        
        int i = 1;
        while (cantidadPixeles != (i - 1)){
            int error = pixelRGB.PedirPixrgb(i); // crea el pixel y retorna si es correcto
            if (error != 1){
                i = i +1;
            } else{
                error--;
            }
        }
        
        this.pixeles = pixelRGB.pixelesRGB; // pasa los pixeles pixrgb a pixeles
        return pixeles;
    }
    
    
}
