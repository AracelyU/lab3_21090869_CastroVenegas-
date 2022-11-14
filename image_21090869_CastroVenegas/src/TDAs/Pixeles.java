package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author arace
 */
public class Pixeles{

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
    
    
}
