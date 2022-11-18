package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.ArrayList;


/**
 *
 * @author aracelyCastro
 */
public class Image_21090869_CastroVenegas {
    
    // definiendo las variables de una imagen
    private int ancho, largo;
    private ArrayList <Pixel_21090869_CastroVenegas> pixeles = new ArrayList<>();
    
    // definiendo el constructor de una imagen
    public Image_21090869_CastroVenegas(int vAncho, int vLargo, ArrayList vPixeles){
        this.setAncho(vAncho);
        this.setLargo(vLargo);
        this.setPixeles(vPixeles);
       
    }
    
    // definiendo getters
    
    // retornar ancho
    public int getAncho(){
        return ancho;
    }
    
    // retornar largo
    public int getLargo(){
        return largo;
    }
    
    // retornar pixeles
    public ArrayList getPixeles(){
        return pixeles;
    }
    
    // definir setters
    
    // cambiar ancho
    public void setAncho(int ancho){
        if (ancho >= 0){
            this.ancho = ancho;
        }
    }
    
    // cambiar largo
    public void setLargo(int largo){
        if (largo >= 0){
            this.largo = largo;
        }
    }
    
    // cambiar pixeles
    public void setPixeles(ArrayList pixeles){
        this.pixeles = pixeles;
    }
    
    // añadir pixel a los pixeles
    public void addPixel(Pixel_21090869_CastroVenegas pixel){
        pixeles.add(pixel);
    }
    
    
    /*
    public public ImageIsBitmap(){
        Pixbit_21090869_CastroVenegas pixel = new Pixbit_21090869_CastroVenegas(0,0,0,0);
        
        for(int i=0; i < pixeles.size(); i++){
            Pixel_21090869_CastroVenegas pixelRecogido = pixeles.get(i);
            ArrayList pixelR = (ArrayList) pixelRecogido.pixeles;
            int coordX = pixelR.get(0);
            int coordY = pixelR.get(1);
            int bit = pixelR.get(2);
            int profundidad = pixelR.get(3);
   
                    
            pixel.esPixbit();
      */      
            
            
            
            
      
 
    
    
}
