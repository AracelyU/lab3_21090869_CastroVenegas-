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
        this.getColorR(vColorR);
        this.getColorG(vColorG);
        this.getColorB(vColorB);
    }
    
    // definir getters
    
    // retornar colorR
    public int getColorR(){
        return colorR;
    }
    
    // retornar colorG
    public int getColorG(){
        return colorG;
    }
        
    // retornar colorB
    public int getColorB(){
        return colorB;
    }
    
    // definir setters
    
    // cambiar colorR
    public void getColorR(int ColorR){
        if (ColorR >= 0 && ColorR <= 255){
            this.colorR = ColorR;
        }
    }
    
    // cambiar colorG
    public void getColorG(int ColorG){
        if (ColorG >= 0 && ColorG <= 255){
            this.colorG = ColorG;
        }
    }
    
    // cambiar colorB
    public void getColorB(int ColorB){
        if (ColorB >= 0 && ColorB <= 255){
            this.colorB = ColorB;
        }
    }
    
    
}
