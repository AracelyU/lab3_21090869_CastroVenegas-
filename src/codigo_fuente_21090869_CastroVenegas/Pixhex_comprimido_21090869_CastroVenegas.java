/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

/**
 * Implementa el objeto pixhex_comprimido. Es una clase hija de Pixel_21090869_CastroVenegas 
 * 
 * Representación: Se considera un objeto pixhex_comprimido con un atributo, un entero
 * para indicar el string hexadecimal antes de ser comprimido. 
 * 
 * Relaciones
 * 
 * Tiene relación de composición con Image_21090869_CastroVenegas, siento esta
 * la clase miembro
 * 
 * @author aracely castro
 */
public class Pixhex_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas{
    // atributos de un pixhex_comprimido
    private String hexGuardado;
    
    
    //################################ CONSTRUCTOR ######################################
    /**
    * Descripción: Constructor de pixhex_comprimido
    * @param coordX: entero positivo. 
    * @param coordY: entero positivo
    * @param hexGuardado: string
    * @param profundidad: entero positivo
    * @author aracely castro
    */
    public Pixhex_comprimido_21090869_CastroVenegas( int coordX, int coordY, String hexGuardado, int profundidad){
        super(coordX, coordY, profundidad);
        setHexGuardado(hexGuardado);
    }

    //################################ MODIFICADORES ######################################
    /**
    * Descripción: Método para cambiar el string hex guardado de un pixhex
    * @param hexGuardado: string
    * @author aracely castro
    */
    private void setHexGuardado(String hexGuardado){
        if(hexGuardado.length() == 7){
            this.hexGuardado = hexGuardado;
        }
    }  
    
    //################################ SELECTORES ######################################
    /**
    * Descripción: Método para obtener el string hex guardado de un pixhex
    * @return devuelve un string
    * @author aracely castro
    */

    public String getHexGuardado(){
        return hexGuardado;
    }
}
