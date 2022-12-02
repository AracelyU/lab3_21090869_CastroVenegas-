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
public class Pixhex_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas implements Interfaz_Pixhex_21090869_CastroVenegas {
    // atributos de un pixhex
    private String hex;

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
    
    /**
    * Descripción: Método para obtener el string hex de un pixhex
    * @return devuelve un string
    * @author aracely castro
    */
    @Override
    public String getHex(){
        return hex;
    }
    
    /**
    * Descripción: Método para cambiar el string hex de un pixhex
    * @param hex: string
    * @author aracely castro
    */
    private void setHex(String hex){
        if (hex.length() == 7){
            this.hex = hex;
        }
    }
    
    /**
    * Descripción: Método para verificar si tienen mismo string hex
    * @param hex: string
    * @param pixel: pixhex
    * @return devuelve un boleano
    * @author aracely castro
    */
    @Override
    public boolean igualColorHex(Pixhex_21090869_CastroVenegas pixel, String hex){
        return (pixel.getHex() == hex);
    }
    
    /**
    * Descripción: Método que suma los pixhex con string hex igual al ingresado
    * @param hex: string
    * @param pixeles: lista de objetos
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    @Override
    public int sumaColorHex(ArrayList<Object> pixeles, String hex){
        int suma = 0;
        for(int i =0; i < pixeles.size(); i++){
            Pixhex_21090869_CastroVenegas pixel = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
            if(igualColorHex(pixel, hex)){
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
    @Override
    public ArrayList eliminarColorHex(ArrayList<Object> pixeles, String hex){
        ArrayList<Object> pixelesTemporal = new ArrayList<>();
        for(int i=0; i < pixeles.size(); i++){
            Pixhex_21090869_CastroVenegas pixelRecogido = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
            if(!igualColorHex(pixelRecogido, hex)){
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
    @Override
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
    
    /**
    * Descripción: Método que crea un pixhex blanco con profundidad ingresada
    * @param profundidad: entero positivo
    * @return devuelve un pixhex
    * @author aracely castro
    */
    @Override
    public Pixhex_21090869_CastroVenegas pixelBlancoHex(int profundidad){
        Pixhex_21090869_CastroVenegas pixel = new Pixhex_21090869_CastroVenegas(getCoordX(), getCoordY(), "#FFFFFF", profundidad);
        return pixel;
    }
    
    /**
    * Descripción: Método para imprimir el pixhex
    * @author aracely castro
    * @return devuelve un String
    */ 
    @Override
    public String mostrarPixhex(){
        return "[" + String.valueOf(coordX) + "," + String.valueOf(coordY) + ","+ getHex() +","+ String.valueOf(profundidad) + "] ";
    }
}
