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
public abstract class Pixel_21090869_CastroVenegas{

    /**
     * @param args the command line arguments
     */
    
    // Definiendo variables comunes de un pixel
    protected int coordX, coordY, profundidad; 
    
    // constructor de pixeles
    public Pixel_21090869_CastroVenegas(int CoordX, int CoordY, int Profundidad){
        this.setCoordX(CoordX);
        this.setCoordY(CoordY);
        this.setProfundidad(Profundidad);
    }
    
   
    // definiendo getters
    
    // retonar coordX del pixel
    public int getCoordX(){
        return coordX;
    }
    
    // retornar coordY del pixel
    public int getCoordY(){
        return coordY;
    }
    
    // retornar profundidad del pixel
    public int getProfundidad(){
        return profundidad;
    }
    
    // definiendo setters
    
    // cambiar coordX
    public void setCoordX(int CoordX){
        if (CoordX >= 0){
            this.coordX = CoordX;
        }
    }    
    
    // cambiar coordY
    public void setCoordY(int CoordY){
        if (CoordY >= 0){
            this.coordY = CoordY;
        }
    }
    
    // cambiar profundidad
    public void setProfundidad(int Profundidad){
        if (Profundidad >= 0){
            this.profundidad = Profundidad;
        }
    }
    
    
    
}
