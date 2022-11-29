/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.util.ArrayList;

/**
 * Clase para definir el objeto Pixhex_comprimido
 * @author aracely castro
 */
public class Pixhex_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    
    // atributos de un pixhex_comprimido
    private String hexGuardado;
    private String hexComprimido;
    
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
        this.hexComprimido = "-------";
        setHexGuardado(hexGuardado);
    }

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
    
    /**
    * Descripción: Método para obtener el string hex guardado de un pixhex
    * @return devuelve un string
    * @author aracely castro
    */
    public String getHexGuardado(){
        return hexGuardado;
    }
    
    /**
    * Descripción: Método para imprimir el pixhex_comprimido
    * @author aracely castro
    */ 
    public void mostrarPixhexC(){
        ArrayList pixel = new ArrayList();
        pixel.add(getCoordX());
        pixel.add(getCoordY());
        pixel.add("-------");
        pixel.add(getProfundidad());
        System.out.print(pixel + " ");
    }
 
}
