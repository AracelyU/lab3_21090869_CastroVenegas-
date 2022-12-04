/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

/**
 * Implementa el objeto pixbit_comprimido. Es una clase hija de Pixel_21090869_CastroVenegas 
 * 
 * Representación: Se considera un objeto pixbit_comprimido con un atributo, un entero
 * para indicar el valor de bit antes de ser comprimido. 
 * 
 * Relaciones
 * 
 * Tiene relación de composición con Image_21090869_CastroVenegas, siento esta
 * la clase miembro
 * 
 * @author aracely castro
 */
public class Pixbit_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas{
    // atributos de pixbit_comprimido
    private int bitGuardado;

    //################################ CONSTRUCTOR ######################################
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
        setBitGuardado(bitGuardado);
    }
    
    //################################ MODIFICADORES ######################################
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
    
    //################################ SELECTORES ######################################
    /**
    * Descripción: Método para obtener el valor bitGuardado de un pixbit_comprimido
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    public int getBitGuardado(){
        return bitGuardado;
    }
    
}
