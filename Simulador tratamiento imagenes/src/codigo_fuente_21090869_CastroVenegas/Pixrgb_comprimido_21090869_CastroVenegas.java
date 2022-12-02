/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

import java.util.ArrayList;

/**
 *
 * @author arace
 */
public class Pixrgb_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    // atributos de pixrgb_comprimido
    private int colorRGuardado;
    private int colorGGuardado;
    private int colorBGuardado;
    private int colorRComprimido;
    private int colorGComprimido;
    private int colorBComprimido;
    
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
        this.colorRComprimido = -1;
        this.colorGComprimido = -1;
        this.colorBComprimido = -1;
        setColorRG((int) colorRGB.get(0));
        setColorGG((int) colorRGB.get(1));
        setColorBG((int) colorRGB.get(2));
    }

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
    
    /**
    * Descripción: Método para imprimir el pixrgb_comprimido
    * @author aracely castro
    * @return devuelve un String
    */    
   public String mostrarPixrgbC(){
        return "["+String.valueOf(coordX)+","+String.valueOf(coordY)+",-1,-1,-1,"+String.valueOf(profundidad) +"] ";
    }
}
