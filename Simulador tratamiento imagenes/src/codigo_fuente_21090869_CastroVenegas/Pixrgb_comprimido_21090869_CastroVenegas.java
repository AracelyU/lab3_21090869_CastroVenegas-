/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

import java.util.ArrayList;

/**
 * Implementa el objeto pixrgb_comprimido. Es una clase hija de Pixel_21090869_CastroVenegas 
 * 
 * Representación: Se considera un objeto pixrgb_comprimido con tres atributos, todos enteros
 * para indicar los valores del color en RGB antes de ser comprimido. 
 * 
 * Relaciones
 * 
 * Tiene relación de composición con Image_21090869_CastroVenegas, siento esta
 * la clase miembro
 * 
 * @author aracely castro
 */
public class Pixrgb_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    // atributos de pixrgb_comprimido
    private int colorRGuardado;
    private int colorGGuardado;
    private int colorBGuardado;
    
    //################################ CONSTRUCTOR ######################################
    /**
    * Descripción: Constructor de pixrgb_comprimido
    * @param coordX: entero positivo. 
    * @param coordY: entero positivo
    * @param colorRGB: lista con tres valores positivos
    * @param profundidad: entero positivo
    * @author aracely castro
    */
    public Pixrgb_comprimido_21090869_CastroVenegas( int coordX, int coordY, ArrayList<Integer> colorRGB, int profundidad){
        super(coordX, coordY, profundidad);
        setColorRG((int) colorRGB.get(0));
        setColorGG((int) colorRGB.get(1));
        setColorBG((int) colorRGB.get(2));
    }

    //################################ MODIFICADORES ######################################
    /**
    * Descripción: Método para cambiar el valor color rojo guardado de un pixrgb
    * @param colorRGuardado: un número entero positivo entre 0 y 255 
    * @author aracely castro
    */
    private void setColorRG(int colorRGuardado){
        if(colorRGuardado >= 0 && colorRGuardado <= 255){
            this.colorRGuardado = colorRGuardado;
        }
    }
    
    /**
    * Descripción: Método para cambiar el valor color verde guardado de un pixrgb_comprimido
    * @param colorGGuardado: un número entero positivo entre 0 y 255 
    * @author aracely castro
    */       
    private void setColorGG(int colorGGuardado){
        if(colorGGuardado >= 0 && colorGGuardado <= 255){
            this.colorGGuardado = colorGGuardado;
        }
    }
    
    /**
    * Descripción: Método para cambiar el valor color azul guardado de un pixrgb_comprimido
    * @param colorBGuardado: un número entero positivo entre 0 y 255 
    * @author aracely castro
    */        
    private void setColorBG(int colorBGuardado){
        if(colorGGuardado >= 0 && colorBGuardado <= 255){
            this.colorBGuardado = colorBGuardado;
        }      
    }
    
    //################################ SELECTORES ######################################
    /**
    * Descripción: Método para obtener el valor color rojo guardado de un pixrgb_comprimido
    * @return devuelve un valor color rojo guardado en un pixrgb_comprimido
    * @author aracely castro
    */ 
    public int getColorRGuardado(){
        return colorRGuardado;
    }
    
    /**
    * Descripción: Método para obtener el valor color verde guardado de un pixrgb_comprimido
    * @return devuelve un valor color verde guardado en un pixrgb_comprimido
    * @author aracely castro
    */ 
    public int getColorGGuardado(){
        return colorGGuardado;
    }
    
    /**
    * Descripción: Método para obtener el valor color azul guardado de un pixrgb_comprimido
    * @return devuelve un valor color azul guardado en un pixrgb_comprimido
    * @author aracely castro
    */    

    public int getColorBGuardado(){
        return colorBGuardado;
    }    
}
