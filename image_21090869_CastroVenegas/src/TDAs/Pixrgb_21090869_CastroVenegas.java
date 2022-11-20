/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arace
 */
public class Pixrgb_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas{
   
    // variables del pixrgb
    private int colorR;
    private int colorG;
    private int colorB;
    
    // constructor de un pixrgb
    public Pixrgb_21090869_CastroVenegas(int vCoordX, int vCoordY, int vColorR, int vColorG, int vColorB, int vProfundidad){
        super(vCoordX, vCoordY, vProfundidad);
        setColorR(vColorR);
        setColorG(vColorG);
        setColorB(vColorB);
    }
    
    // definir getters
    
    // retornar colorR
    public int getColorR(){
        return this.colorR;
    }
    
    // retornar colorG
    public int getColorG(){
        return this.colorG;
    }
        
    // retornar colorB
    public int getColorB(){
        return this.colorB;
    }
    
    // definir setters
    
    // cambiar colorR
    public void setColorR(int ColorR){
        if (ColorR >= 0 && ColorR <= 255){
            this.colorR = ColorR;
        }
    }
    
    // cambiar colorG
    public void setColorG(int ColorG){
        if (ColorG >= 0 && ColorG <= 255){
            this.colorG = ColorG;
        }
    }
    
    // cambiar colorB
    public void setColorB(int ColorB){
        if (ColorB >= 0 && ColorB <= 255){
            this.colorB = ColorB;
        }
    }
    
    // método que invierte los colores recibidos
    public void invertRGB(int colorR, int colorG, int colorB){
        setColorR(255- colorR);
        setColorG(255- colorG);
        setColorB(255- colorB);
    }
   
    // método que compara si un hex es igual
    public boolean igualColorRGB(Pixrgb_21090869_CastroVenegas pixel, int colorR, int colorG, int colorB){
        return ((pixel.getColorR() == colorR) && (pixel.getColorG() == colorG) && (pixel.getColorB() == colorB));
    }
    
    // metódo que suma la cantidad de veces que se repite un color RGB en una lista de objetos
    public int sumaColorHex(ArrayList pixeles, int colorR, int colorG, int colorB){
        int suma = 0;
        for(int i =0; i < pixeles.size(); i++){
            Pixrgb_21090869_CastroVenegas pixel = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
            if(igualColorRGB(pixel, colorR, colorG, colorB)){
                suma++;
            }
        }
        return suma;
    }   
    
    
    // mostrar información del pixrgb
    public void mostrarPixrgb(){
        System.out.println();
        System.out.print("CoordX: "+ this.coordX + " ");
        System.out.print("CoordY: "+ this.coordY + " ");
        System.out.print("ColorR: "+ this.colorR + " ");
        System.out.print("ColorG: "+ this.colorG + " ");
        System.out.print("ColorB: "+ this.colorB + " ");
        System.out.print("Profundidad: "+ this.profundidad);
    }
    
    
}
