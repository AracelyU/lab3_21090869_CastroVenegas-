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
public class Pixbit_21090869_CastroVenegas extends Pixeles_21090869_CastroVenegas{
    
    // variables del pixbit
    private final int bit;
    
    public ArrayList pixelesBit = new ArrayList(); // lista de pixeles pixbit
    
    // constructor de un pixbitd
    public Pixbit_21090869_CastroVenegas(int vCoordX, int vCoordY, int vBit, int vProfundidad){
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
        return vCoordX >= 0 && vCoordY >= 0 && (vBit == 1 || vBit == 0) && vProfundidad >= 0;
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
        
        // crea el objeto pixbit
        Pixbit_21090869_CastroVenegas pixelBit = new Pixbit_21090869_CastroVenegas(vCoordX, vCoordY, vBit, vProfundidad);
        
        // si es un pixbit
        if (pixelBit.esPixbit(vCoordX, vCoordY, vBit, vProfundidad)){
            
            // se añade a los pixeles y se añade a la lista de pixeles pixbit
            this.pixel = pixelBit.pixel;           
            pixelesBit.add(pixel);
            return 0;
            
        } else{
            System.out.println("El pixel pixbit esta mal ingresado, intentelo de nuevo");
            return 1;
        }
    }
    
    
    // crear la lista de pixbit
    public ArrayList ImagePixbit(int cantidadPixeles, int ancho, int largo){
        
        // crea un objeto pixbit
        Pixbit_21090869_CastroVenegas pixelBit = new Pixbit_21090869_CastroVenegas(0,0,0,0);
        
        int i = 1;
        while (cantidadPixeles != (i - 1)){
            int error = pixelBit.PedirPixbit(i); // crea el pixel y retorna si es correcto
            if (error != 1){
                i = i +1;
            } else{
                error--;
            }
        }
        
        this.pixeles = pixelBit.pixelesBit; // pasa los pixeles pixbit a pixeles
        return pixeles;
    }
}
