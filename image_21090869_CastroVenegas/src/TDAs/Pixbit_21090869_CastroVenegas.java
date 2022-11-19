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
    
    // mostrar información del pixbit
    public void mostrarPixbit(){
        System.out.println();
        System.out.print("CoordX: "+ this.coordX + " ");
        System.out.print("CoordY: "+ this.coordY + " ");
        System.out.print("Bit: "+ this.bit + " ");
        System.out.print("Profundidad: "+ this.profundidad);
    }
}
