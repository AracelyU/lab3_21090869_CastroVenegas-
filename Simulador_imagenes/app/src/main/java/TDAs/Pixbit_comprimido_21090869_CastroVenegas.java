/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.util.ArrayList;

/**
 *
 * @author arace
 */
public class Pixbit_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    
    private int bitGuardado;
    private int bitComprimido;
    
    public Pixbit_comprimido_21090869_CastroVenegas( int coordX, int coordY, int bitGuardado, int profundidad){
        super(coordX, coordY, profundidad);
        this.bitComprimido = -1;
        setBitGuardado(bitGuardado);
    }

    
    public void setBitGuardado(int bitGuardado){
        if(bitGuardado == 0 | bitGuardado ==1){
            this.bitGuardado = bitGuardado;
        }
    }
    
    public int getBitGuardado(){
        return bitGuardado;
    }
    
    // mostrar información del pixbit
    public void mostrarPixbitC(){
        ArrayList pixel = new ArrayList();
        pixel.add(getCoordX());
        pixel.add(getCoordY());
        pixel.add(-1);
        pixel.add(getProfundidad());
        System.out.print(pixel + " ");
    }
    
    
}
