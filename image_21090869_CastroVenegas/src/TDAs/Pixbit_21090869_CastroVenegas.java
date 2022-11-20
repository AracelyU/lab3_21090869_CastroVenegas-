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
    
    // método que recibe un bit y modifica al bit opuesto
    public void invertBit(int bit){
        if(bit == 0){
            setBit(1);
        } else{
            setBit(0);
        }
    }
    
    // método que compara si un bit es igual
    public boolean igualColorBit(Pixbit_21090869_CastroVenegas pixel, int bit){
        return pixel.getBit() == bit;
    }
    
    // metódo que suma la cantidad de veces que se repite un bit en una lista de objetos
    public int sumaColorBit(ArrayList pixeles, int bit){
        int suma = 0;
        for(int i =0; i < pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixel = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
            if (igualColorBit(pixel, bit)){
                suma++;
            }
        }
        return suma;
    }
    
        // método que eliminar pixeles que sean iguales a un color
    public ArrayList eliminarColorBit(ArrayList pixeles, int bit){
        ArrayList pixelesTemporal = new ArrayList();
        for(int i=0; i < pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixelRecogido = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
            if(!igualColorBit(pixelRecogido, bit)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }
    
    
    
    // mostrar información del pixbit
    public void mostrarPixbit(){
        System.out.println();
        System.out.print("CoordX: "+ this.coordX + " ");
        System.out.print("CoordY: "+ this.coordY + " ");
        System.out.print("Bit: "+ this.bit + " ");
        System.out.print("Profundidad: "+ this.profundidad);
    }
}
