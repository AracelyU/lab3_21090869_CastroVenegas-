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
public class Pixhex_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    
    private String stringHex;

    public Pixhex_21090869_CastroVenegas(int vCoordX, int vCoordY, String vHex, int vProfundidad){
        super(vCoordX, vCoordY, vProfundidad);
        setHex(vHex);
       
    }
    
    // definiendo getters
    
    // retornar stringHex
    public String getHex(){
        return stringHex;
    }
    
    // definiendo setters
    
    // cambiar stringHex
    public void setHex(String Hex){
        if (Hex.length() == 7){
            this.stringHex = Hex;
        }
    }
    
    // método que compara si un hex es igual
    public boolean igualColorHex(Pixhex_21090869_CastroVenegas pixel, String hex){
        return (pixel.getHex() == hex);
    }
    
    // metódo que suma la cantidad de veces que se repite un hex en una lista de objetos
    public int sumaColorHex(ArrayList pixeles, String hex){
        int suma = 0;
        for(int i =0; i < pixeles.size(); i++){
            Pixhex_21090869_CastroVenegas pixel = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
            if(igualColorHex(pixel, hex)){
                suma++;
            }
        }
        return suma;
    }
    
    // método que eliminar pixeles que sean iguales a un color
    public ArrayList eliminarColorHex(ArrayList pixeles, String hex){
        ArrayList pixelesTemporal = new ArrayList();
        for(int i=0; i < pixeles.size(); i++){
            Pixhex_21090869_CastroVenegas pixelRecogido = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
            if(!igualColorHex(pixelRecogido, hex)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }
    
    // método que elimina los pixeles que tengan una profundidad
    public ArrayList eliminarProfundidad(ArrayList pixeles, int Profundidad){
        ArrayList pixelesTemporal = new ArrayList();
        for(int i=0; i < pixeles.size(); i++){
            Pixhex_21090869_CastroVenegas pixelRecogido = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
            if(!pixelRecogido.igualProfundidad(Profundidad)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }
    
    
    // mostrar información del pixhex
    public void mostrarPixhex(){
        System.out.println();
        System.out.print("CoordX: "+ this.coordX + " ");
        System.out.print("CoordY: "+ this.coordY + " ");
        System.out.print("Hex: "+ this.stringHex + " ");
        System.out.print("Profundidad: "+ this.profundidad);
    }
    
}

