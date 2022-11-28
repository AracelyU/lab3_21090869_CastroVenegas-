/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.util.ArrayList;

/**
 *
 * @author arace
 */
public class Pixhex_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    
    private String hexGuardado;
    private String hexComprimido;
    
    public Pixhex_comprimido_21090869_CastroVenegas( int coordX, int coordY, String hexGuardado, int profundidad){
        super(coordX, coordY, profundidad);
        this.hexComprimido = "-------";
        setHexGuardado(hexGuardado);
        
    
    }

    
    public void setHexGuardado(String hexGuardado){
        if(hexGuardado.length() == 7){
            this.hexGuardado = hexGuardado;
        }
    }  
    
    public String getHexGuardado(){
        return hexGuardado;
    }
    
    // mostrar información del pixhex
    public void mostrarPixhexC(){
        ArrayList pixel = new ArrayList();
        pixel.add(getCoordX());
        pixel.add(getCoordY());
        pixel.add("-------");
        pixel.add(getProfundidad());
        System.out.print(pixel + " ");
    }
    
    
    
    
}
