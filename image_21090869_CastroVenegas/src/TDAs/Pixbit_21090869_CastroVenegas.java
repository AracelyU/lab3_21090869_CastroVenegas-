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
public class Pixbit_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas{
    
    // variables del pixbit
    private int bit;
    
    // constructor de un pixbitd
    public Pixbit_21090869_CastroVenegas(int vCoordX, int vCoordY, int vBit, int vProfundidad){
        super(vCoordX, vCoordY, vProfundidad);
        this.bit = vBit;
        
        pixeles.add(vCoordX);
        pixeles.add(vCoordY);
        pixeles.add(vBit);
        pixeles.add(vProfundidad);
        
    }
    
    // definiendo getters
    public int getBit(){
        return bit;
    }
    
    // definiendo setters
    public void setBit(int Bit){
        if (Bit == 0 || Bit == 1){
            this.bit = Bit;
        }
    }
    
    // definir pertenencia
    
   
    
    /*
    // definir pertenencia
    public boolean esPixbit(Object pixel){
        int coordX = getCoordX(); // extraigo coord
        int coordY = getCoordY(); // extraigo coordY
        int bit = getBit(); // extraigo bit
        int profundidad = getProfundidad(); // extraigo profundidad
        ArrayList pixel = (ArrayList) pixeles.get(0); // extrae un pixel de la imagen para poder obtener su largo
        return (coordX >= 0 && coordY >= 0 && (bit == 0 || bit == 1) && profundidad >= 0 && pixel.size() == 4);
    }
 */
}
