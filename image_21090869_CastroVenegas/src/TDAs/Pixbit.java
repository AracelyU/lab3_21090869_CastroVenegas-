package TDAs;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arace
 */
public class Pixbit extends Pixeles{
    
    // variables del pixbit
    private int bit;
    public ArrayList pixelesBit = new ArrayList();
    
    // constructor de un pixbitd
    public Pixbit(int vCoordX, int vCoordY, int vBit, int vProfundidad){
        this.bit = vBit;
        this.coordX = vCoordX;
        this.coordY = vCoordY;
        this.profundidad = vProfundidad;
        
        // crea el pixbit [coordX, coordY, bit, profundidad]
        pixel.add(coordX);
        pixel.add(coordY);
        pixel.add(bit);
        pixel.add(profundidad);
    
    }
    
    // pertenencia de pixbitd
    public boolean esPixbit(int vCoordX, int vCoordY, int vBit, int vProfundidad){
        if(vCoordX >= 0 && vCoordY >= 0 && (vBit == 1 || vBit == 0) && vProfundidad >= 0){
            return true;
        } else{
            return false;
        }
    }
   
    // pedir datos de un Pixbit
    public int PedirPixbit(int numeroPixel){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pixbit " + numeroPixel);
        
        System.out.print("Ingresar x: ");
        int vCoordX = entrada.nextInt();
        
        System.out.print("Ingresar y: ");
        int vCoordY = entrada.nextInt();
        
        System.out.print("Ingresar bit: ");
        int vBit = entrada.nextInt();      
        
        System.out.print("Ingresar profundidad: ");
        int vProfundidad = entrada.nextInt();
        
        // crea el pixbit
        Pixbit pixelBit = new Pixbit(vCoordX, vCoordY, vBit, vProfundidad);
        
        // si es un pixbit
        if (pixelBit.esPixbit(vCoordX, vCoordY, vBit, vProfundidad)){
            // se añade a los pixeles
            this.pixel = pixelBit.pixel;           
            pixelesBit.add(pixel);
            return 0;
            
        } else{
            System.out.println("El pixel pixbit esta mal ingresado");
            return 1;
        }
    }
    
    
    // crear la lista de pixbit
    public ArrayList ImagePixbit(int cantidadPixeles, int ancho, int largo){
        
        // crea un objeto pixbit
        Pixbit pixelBit = new Pixbit(0,0,0,0);
        
        int i = 1;
        while (cantidadPixeles != (i - 1)){
            int error = pixelBit.PedirPixbit(i); // crea un pixel
            if (error != 1){
                i = i +1;
            } else{
                error = 0;
            }
        }
        
        this.pixeles = pixelBit.pixelesBit; // pasa los pixeles pixbit a pixeles
        return pixeles;
    }
}
