/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

import java.util.ArrayList;

/**
 * Implementa el objeto pixhex. Es una clase hija de Pixel_21090869_CastroVenegas 
 * 
 * Representación: Se considera un objeto pixhex con un atributo, un string
 * para indicar su valor hexadecimal de su color. 
 * 
 * Relaciones
 * 
 * Tiene relación de composición con Image_21090869_CastroVenegas, siento esta
 * la clase miembro
 * 
 * @author aracely castro
 */
public class Pixhex_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    // atributos de un pixhex
    private String hex;

    
    //################################ CONSTRUCTOR ######################################
    /**
    * Descripción: Constructor de pixhex_comprimido
    * @param coordX: entero positivo. 
    * @param coordY: entero positivo
    * @param hex: string
    * @param profundidad: entero positivo
    * @author aracely castro
    */
    public Pixhex_21090869_CastroVenegas(int coordX, int coordY, String hex, int profundidad){
        super(coordX, coordY, profundidad);
        setHex(hex);
       
    }
    
    //################################ SELECTORES ######################################
    /**
    * Descripción: Método para obtener el string hex de un pixhex
    * @return devuelve un string
    * @author aracely castro
    */
    public String getHex(){
        return hex;
    }
    
    //################################ MODIFICADORES ######################################
    /**
    * Descripción: Método para cambiar el string hex de un pixhex
    * @param hex: string
    * @author aracely castro
    */
    private void setHex(String hex){
        if (hex.length() == 7){
            this.hex = hex;
        } else{
            this.hex = "#FFFFFF";
        }
    }
    
    /**
    * Descripción: Método que crea un pixhex blanco con profundidad ingresada
    * @param profundidad: entero positivo
    * @return devuelve un pixhex
    * @author aracely castro
    */
    public Pixhex_21090869_CastroVenegas pixelBlanco(int profundidad){
        Pixhex_21090869_CastroVenegas pixel = new Pixhex_21090869_CastroVenegas(getCoordX(), getCoordY(), "#FFFFFF", profundidad);
        return pixel;
    }
    
    //################################ OTROS MÉTODOS ######################################
    /**
    * Descripción: Método que suma los pixhex con string hex igual al ingresado
    * @param hex: string
    * @param pixeles: lista de objetos
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    public int sumaColor(ArrayList<Object> pixeles, String hex){
        int suma = 0;
        for(int i =0; i < pixeles.size(); i++){
            Pixhex_21090869_CastroVenegas pixel = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
            if(pixel.getHex().equals(hex)){
                suma++;
            }
        }
        return suma;
    }
    
    /**
    * Descripción: Método que elimina los pixhex con string hex igual al ingresado
    * @param hex: string
    * @param pixeles: lista de objetos
    * @return devuelve una lista de objetos
    * @author aracely castro
    */
    public ArrayList eliminarColor(ArrayList<Object> pixeles, String hex){
        ArrayList<Object> pixelesTemporal = new ArrayList<>();
        for(int i=0; i < pixeles.size(); i++){
            Pixhex_21090869_CastroVenegas pixelRecogido = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
            if(!pixelRecogido.getHex().equals(hex)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }
    
    /**
    * Descripción: Método que elimina los pixhex con profundidad igual al ingresado
    * @param profundidad: entero positivo
    * @param pixeles: lista de objetos
    * @return devuelve una lista de objetos
    * @author aracely castro
    */
    public ArrayList eliminarProfundidad(ArrayList<Object> pixeles, int profundidad){
        ArrayList<Object> pixelesTemporal = new ArrayList<>();
        for(int i=0; i < pixeles.size(); i++){
            Pixhex_21090869_CastroVenegas pixelRecogido = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
            if(!pixelRecogido.igualProfundidad(profundidad)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }

}
