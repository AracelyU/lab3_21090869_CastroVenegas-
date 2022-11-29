/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.util.ArrayList;

/**
 * Clase para definir el objeto Pixbit_comprimido
 * @author aracely castro
 */
public class Pixbit_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    
    // atributos de pixbit_comprimido
    private int bitGuardado;
    private int bitComprimido;
    
    /**
    * Descripción: Constructor de pixbit_comprimido
    * @param coordX: entero positivo. 
    * @param coordY: entero positivo
    * @param bitGuardado: entero 0 | 1
    * @param profundidad: entero positivo
    * @author aracely castro
    */
    public Pixbit_comprimido_21090869_CastroVenegas( int coordX, int coordY, int bitGuardado, int profundidad){
        super(coordX, coordY, profundidad);
        this.bitComprimido = -1;
        setBitGuardado(bitGuardado);
    }
    
    /**
    * Descripción: Método para cambiar el valor bitGuardado de un pixbit_comprimido
    * @param bitGuardado: entero 0 | 1
    * @author aracely castro
    */
    private void setBitGuardado(int bitGuardado){
        if(bitGuardado == 0 | bitGuardado ==1){
            this.bitGuardado = bitGuardado;
        }
    }
    
    /**
    * Descripción: Método para obtener el valor bitGuardado de un pixbit_comprimido
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    public int getBitGuardado(){
        return bitGuardado;
    }
    
    /**
    * Descripción: Método para imprimir el pixbit_comprimido
    * @author aracely castro
    */ 
    public void mostrarPixbitC(){
        ArrayList pixel = new ArrayList();
        pixel.add(getCoordX());
        pixel.add(getCoordY());
        pixel.add(-1);
        pixel.add(getProfundidad());
        System.out.print(pixel + " ");
    }
    
    
}
