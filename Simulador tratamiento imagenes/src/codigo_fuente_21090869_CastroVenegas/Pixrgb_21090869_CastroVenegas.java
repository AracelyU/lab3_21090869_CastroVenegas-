/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

import java.util.ArrayList;

/**
 * Implementa el objeto pixrgb. Es una clase hija de Pixel_21090869_CastroVenegas 
 * 
 * Representación: Se considera un objeto pixrgb con tres atributos, todos enteros
 * para indicar los valores de su color en RGB. 
 * 
 * Relaciones
 * 
 * Tiene relación de composición con Image_21090869_CastroVenegas, siento esta
 * la clase miembro
 * 
 * @author aracely castro
 */
public class Pixrgb_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    // atributos del pixrgb
    private int colorR;
    private int colorG;
    private int colorB;
    
    //################################ CONSTRUCTOR ######################################
    /**
    * Descripción: Constructor de pixrgb_comprimido
    * @param coordX: entero positivo. 
    * @param coordY: entero positivo
    * @param colorR: entero entre 0 y 255
    * @param colorG: entero entre 0 y 255
    * @param colorB: entero entre 0 y 255
    * @param profundidad: entero positivo
    * @author aracely castro
    *
    */
    public Pixrgb_21090869_CastroVenegas(int coordX, int coordY, int colorR, int colorG, int colorB, int profundidad){
        super(coordX, coordY, profundidad);
        setColorR(colorR);
        setColorG(colorG);
        setColorB(colorB);
    }
    
     //################################ SELECTORES ######################################
    /**
    * Descripción: Método para obtener el valor color rojo de un pixrgb
    * @return devuelve un entero entre 0 y 255
    * @author aracely castro
    */
    public int getColorR(){
        return this.colorR;
    }
    
    /**
    * Descripción: Método para obtener el valor color verde de un pixrgb
    * @return devuelve un entero entre 0 y 255
    * @author aracely castro
    */
    public int getColorG(){
        return this.colorG;
    }
        
    /**
    * Descripción: Método para obtener el valor color azul de un pixrgb
    * @return devuelve un entero entre 0 y 255
    * @author aracely castro
    */
    public int getColorB(){
        return this.colorB;
    }
    
    //################################ MODIFICADORES ######################################
    /**
    * Descripción: Método para cambiar el valor color rojo de un pixrgb
    * @param colorR: entero entre 0 y 255
    * @author aracely castro
    */
    private void setColorR(int colorR){
        if (colorR >= 0 && colorR <= 255){
            this.colorR = colorR;
        }
    }
    
    /**
    * Descripción: Método para cambiar el valor color verde de un pixrgb
    * @param colorG: entero entre 0 y 255
    * @author aracely castro
    */
    private void setColorG(int colorG){
        if (colorG >= 0 && colorG <= 255){
            this.colorG = colorG;
        }
    }
    
    /**
    * Descripción: Método para cambiar el valor color azul de un pixrgb
    * @param colorB: entero entre 0 y 255
    * @author aracely castro
    */
    private void setColorB(int colorB){
        if (colorB >= 0 && colorB <= 255){
            this.colorB = colorB;
        }
    }
    
    /**
    * Descripción: Método para invierte el color rgb recibido
    * @param colorR: entero entre 0 y 255
    * @param colorG: entero entre 0 y 255
    * @param colorB: entero entre 0 y 255
    * @author aracely castro
    */
    public void invertRGB(int colorR, int colorG, int colorB){
        setColorR(255- colorR);
        setColorG(255- colorG);
        setColorB(255- colorB);
    }
   
    /**
    * Descripción: Método que crea un pixrgb blanco con profundidad ingresada
    * @param profundidad: entero positivo
    * @return devuelve un pixrgb
    * @author aracely castro
    */
    public Pixrgb_21090869_CastroVenegas pixelBlanco(int profundidad){
        Pixrgb_21090869_CastroVenegas pixel = new Pixrgb_21090869_CastroVenegas(getCoordX(), getCoordY(), 255, 255, 255, profundidad);
        return pixel;
    }
    
    
    //################################ PERTENENCIA ######################################
    /**
    * Descripción: Método para compara si se tiene el mismo color rgb ingresado
    * @param colorR: entero entre 0 y 255
    * @param colorG: entero entre 0 y 255
    * @param colorB: entero entre 0 y 255
    * @return devuelve un boleano
    * @author aracely castro
    */
    public boolean igualColor(int colorR, int colorG, int colorB){
        return ((getColorR() == colorR) && (getColorG() == colorG) && (getColorB() == colorB));
    }
    
    
    //################################ OTROS MÉTODOS ######################################
    /**
    * Descripción: Método para suma los pixrgb con mismo color rgb
    * @param colorR: entero entre 0 y 255
    * @param colorG: entero entre 0 y 255
    * @param colorB: entero entre 0 y 255
    * @param pixeles: lista de objetos
    * @return devuelve un entero
    * @author aracely castro
    */
    public int sumaColor(ArrayList<Object> pixeles, int colorR, int colorG, int colorB){
        int suma = 0;
        for(int i =0; i < pixeles.size(); i++){
            Pixrgb_21090869_CastroVenegas pixel = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
            if(pixel.igualColor(colorR, colorG, colorB)){
                suma++;
            }
        }
        return suma;
    }   
    
    /**
    * Descripción: Método para elimina los pixrgb con mismo color rgb ingresado
    * @param colorR: entero entre 0 y 255
    * @param colorG: entero entre 0 y 255
    * @param colorB: entero entre 0 y 255
    * @param pixeles: lista de objetos
    * @return devuelve una lista de objetos
    * @author aracely castro
    */
    public ArrayList eliminarColor(ArrayList<Object> pixeles, int colorR, int colorG, int colorB){
        ArrayList<Object> pixelesTemporal = new ArrayList<>();
        for(int i=0; i < pixeles.size(); i++){
            Pixrgb_21090869_CastroVenegas pixelRecogido = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
            if(!pixelRecogido.igualColor(colorR, colorG, colorB)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }
    
    /**
    * Descripción: Método para elimina los pixrgb con misma profundidad a la ingresada
    * @param profundidad: entero positivo
    * @param pixeles: lista de objetos
    * @return devuelve una lista de objetos
    * @author aracely castro
    */
    public ArrayList eliminarProfundidad(ArrayList<Object> pixeles, int profundidad){
        ArrayList<Object> pixelesTemporal = new ArrayList<>();
        for(int i=0; i < pixeles.size(); i++){
            Pixrgb_21090869_CastroVenegas pixelRecogido = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
            if(!pixelRecogido.igualProfundidad(profundidad)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }

}
