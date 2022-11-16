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
public class Pixeles_21090869_CastroVenegas{

    /**
     * @param args the command line arguments
     */
    
    // Definiendo variables comunes de los pixeles
    protected int coordX, coordY, profundidad; 
    protected ArrayList pixel = new ArrayList();
    protected ArrayList pixeles = new ArrayList();
    
    
    // retonar coordX del pixel
    public int obtCoordX(){
        return coordX;
    }
    
    // retornar coordY del pixel
    public int obtCoordY(){
        return coordY;
    }
    
    // retornar profundidad del pixel
    public int obtProfundidad(){
        return profundidad;
    }
    
    // retornar pixeles
    public ArrayList obtPixeles(){
        return pixeles;
    }
    
    // imprimir el pixel creado
    public void ImprimirPixel(){
        System.out.println("El pixel creado es: " + pixel);
    }   
    
    // crea los pixeles de la imagen según su tipo
    public ArrayList CrearPixeles(int eleccion, int ancho, int largo){
        if (eleccion == 1){ // pixeles bitmap
            int cantidadPixeles = ancho * largo;
            Pixbit_21090869_CastroVenegas pixBitLista = new Pixbit_21090869_CastroVenegas(0,0,0,0);
            this.pixeles = pixBitLista.ImagePixbit(cantidadPixeles, ancho, largo);
            return pixeles;
            
        } if (eleccion == 2){ // pixeles pixmap
            int cantidadPixeles = ancho * largo;
            Pixrgb_21090869_CastroVenegas pixRGBLista = new Pixrgb_21090869_CastroVenegas(0,0,0,0,0,0);
            this.pixeles = pixRGBLista.ImagePixrgb(cantidadPixeles, ancho, largo);
            return pixeles;
        
        } else { // pixeles hexmap
            return pixeles;
        }
    }
    
    
}
