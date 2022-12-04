/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

import java.util.ArrayList;

/**
 * Implementa el objeto pixbit. Es una clase hija de Pixel_21090869_CastroVenegas 
 * 
 * Representación: Se considera un objeto pixbit con un atributo, un entero
 * para indicar su valor de bit. 
 * 
 * Relaciones
 * 
 * Tiene relación de composición con Image_21090869_CastroVenegas, siento esta
 * la clase miembro
 * 
 * @author aracely castro
 */
public class Pixbit_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    
    // atributos de un pixbit
    private int bit;
    
    //################################ CONSTRUCTOR ######################################
    /**
    * Descripción: Constructor de pixbit
    * @param coordX: entero positivo. 
    * @param coordY: entero positivo
    * @param bit: entero 0 | 1 
    * @param profundidad: entero positivo
    * @author aracely castro
    */
    public Pixbit_21090869_CastroVenegas(int coordX, int coordY, int bit, int profundidad){
        super(coordX, coordY, profundidad);
        this.bit = bit;
        
    }
    
    //################################ SELECTORES ######################################
    /**
    * Descripción: Método para obtener el valor bit de un pixbit
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    public int getBit(){
        return bit;
    }
    
    //################################ MODIFICADORES ######################################
    /**
    * Descripción: Método para cambiar el valor bit de un pixbit
    * @param bit: entero 0 | 1
    * @author aracely castro
    */
    public void setBit(int bit){
        if (bit == 0 || bit == 1){
            this.bit = bit;
        } else{
            this.bit = 1;
        }
    }
    
    /**
    * Descripción: Método para cambiar el valor bit de un pixbit por su opuesto
    * @param bit: entero 0 | 1
    * @author aracely castro
    */
    public void invertBit(int bit){
        if(bit == 0){
            setBit(1);
        } else{
            setBit(0);
        }
    }
    
    /**
    * Descripción: Método que crea un pixbit blanco con profundidad ingresada
    * @param profundidad: entero positivo
    * @return devuelve un pixbit
    * @author aracely castro
    */
    public Pixbit_21090869_CastroVenegas pixelBlanco(int profundidad){
        Pixbit_21090869_CastroVenegas pixel = new Pixbit_21090869_CastroVenegas(getCoordX(), getCoordY(), 1, profundidad);
        return pixel;
    }
    
    //################################ OTROS MÉTODOS ######################################
    /**
    * Descripción: Método que suma los pixbit con igual bit al ingresado
    * @param bit: entero 0 | 1
    * @param pixeles: lista de objetos
    * @return devuelve un entero
    * @author aracely castro
    */
    public int sumaColor(ArrayList<Object> pixeles, int bit){
        int suma = 0;
        for(int i =0; i < pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixel = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
            if (pixel.getBit() == bit){
                suma++;
            }
        }
        return suma;
    }
    
    /**
    * Descripción: Método que elimina los pixbit con igual bit al ingresado
    * @param bit: entero 0 | 1
    * @param pixeles: lista de objetos
    * @return devuelve una lista de objetos
    * @author aracely castro
    */
    public ArrayList eliminarColor(ArrayList<Object> pixeles, int bit){
        ArrayList<Object> pixelesTemporal = new ArrayList<>();
        for(int i=0; i < pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixelRecogido = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
            if(bit != pixelRecogido.getBit()){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }
    
    /**
    * Descripción: Método que elimina los pixbit con igual profundidad ingresada
    * @param profundidad: entero positivo
    * @param pixeles: lista de objetos
    * @return devuelve una lista de objetos
    * @author aracely castro
    */
    public ArrayList eliminarProfundidad(ArrayList<Object> pixeles, int profundidad){
        ArrayList<Object> pixelesTemporal = new ArrayList<>();
        for(int i=0; i < pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixelRecogido = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
            if(!pixelRecogido.igualProfundidad(profundidad)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    } 
    
}
