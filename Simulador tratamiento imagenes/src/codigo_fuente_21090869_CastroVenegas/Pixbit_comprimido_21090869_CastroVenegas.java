/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

/**
 *
 * @author arace
 */
public class Pixbit_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas implements InterfazPixbit_comprimido_21090869_CastroVenegas{
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
    @Override
    public int getBitGuardado(){
        return bitGuardado;
    }
    
    /**
    * Descripción: Método para imprimir el pixbit_comprimido
    * @author aracely castro
    * @return devuelve un String
    */
    @Override
    public String mostrarPixbitC(){
        return "[" + String.valueOf(coordX) + "," + String.valueOf(coordY) + ",-1,"+ String.valueOf(profundidad) + "] ";
    }
}
