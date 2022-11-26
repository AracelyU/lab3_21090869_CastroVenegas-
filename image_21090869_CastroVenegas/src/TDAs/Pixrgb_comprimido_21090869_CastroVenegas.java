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
public class Pixrgb_comprimido_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    
    
    private int colorRGuardado;
    private int colorGGuardado;
    private int colorBGuardado;
    private int colorRComprimido;
    private int colorGComprimido;
    private int colorBComprimido;
    
    
    public Pixrgb_comprimido_21090869_CastroVenegas( int coordX, int coordY, ArrayList colorRGB, int profundidad){
        super(coordX, coordY, profundidad);
        this.colorRComprimido = -1;
        this.colorGComprimido = -1;
        this.colorBComprimido = -1;
        setColorRG((int) colorRGB.get(0));
        setColorGG((int) colorRGB.get(1));
        setColorBG((int) colorRGB.get(2));
    }

    public void setColorRG(int colorRGuardado){
        if(colorRGuardado >= 0 && colorRGuardado <= 255){
            this.colorRGuardado = colorRGuardado;
        }
    }
        
    public void setColorGG(int colorGGuardado){
        if(colorGGuardado >= 0 && colorGGuardado <= 255){
            this.colorGGuardado = colorGGuardado;
        }
    }
        
    public void setColorBG(int colorBGuardado){
        if(colorGGuardado >= 0 && colorBGuardado <= 255){
            this.colorBGuardado = colorBGuardado;
        }      
    }
    
    public void mostrarPixrgbC(){
        System.out.println();
        System.out.print("CoordX: "+ this.coordX + " ");
        System.out.print("CoordY: "+ this.coordY + " ");
        System.out.print("ColorR: "+ this.colorRComprimido + " ");
        System.out.print("ColorG: "+ this.colorGComprimido + " ");
        System.out.print("ColorB: "+ this.colorBComprimido + " ");
        System.out.print("Profundidad: "+ this.profundidad);
    }
    
}
