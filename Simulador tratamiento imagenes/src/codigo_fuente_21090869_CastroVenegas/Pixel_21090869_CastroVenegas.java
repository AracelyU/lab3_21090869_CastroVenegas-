/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

/**
 * Implementa el objeto pixel. Es una clase padre de Pixbit_21090869_CastroVenegas, Pixhex_21090869_CastroVenegas,
 * Pixrgb_21090869_CastroVenegas, Pixbit_comprimido_21090869_CastroVenegas, Pixhex_comprimido_21090869_CastroVenegas y
 * Pixrgb_comprimido_21090869_CastroVenegas 
 * 
 * Representación: Se considera un objeto pixel con tres atributo, tres entero
 * para indicar su valor de coordX, coordY y profundidad de un pixel. 
 * 
 * Relaciones
 * 
 * 
 * @author aracely castro
 */
public abstract class Pixel_21090869_CastroVenegas{
    
    // atributos de un pixel
    protected int coordX, coordY, profundidad; 
    
    //################################ CONSTRUCTOR ######################################
    /**
    * Descripción: Constructor de pixel
    * @param coordX: entero positivo. 
    * @param coordY: entero positivo
    * @param profundidad: entero positivo
    * @author aracely castro
    */
    public Pixel_21090869_CastroVenegas(int coordX, int coordY, int profundidad){
        this.setCoordX(coordX);
        this.setCoordY(coordY);
        this.setProfundidad(profundidad);
    }
      
   //################################ SELECTORES ######################################
    /**
    * Descripción: Método para obtener el valor coordX de un pixel
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    public int getCoordX(){
        return coordX;
    }
    
    /**
    * Descripción: Método para obtener el valor coordY de un pixel
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    public int getCoordY(){
        return coordY;
    }
    
    /**
    * Descripción: Método para obtener el valor profundidad de un pixel
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    public int getProfundidad(){
        return profundidad;
    }
    
    //################################ MODIFICADORES ######################################
    /**
    * Descripción: Método para cambiar el valor coordX de un pixel
    * @param coordX: entero positivo
    * @author aracely castro
    */
    public void setCoordX(int coordX){
        if (coordX >= 0){
            this.coordX = coordX;
        }
    }    
    
    /**
    * Descripción: Método para cambiar el valor coordY de un pixel
    * @param coordY: entero positivo
    * @author aracely castro
    */
    public void setCoordY(int coordY){
        if (coordY >= 0){
            this.coordY = coordY;
        }
    }
    
    /**
    * Descripción: Método para cambiar el valor profundidad de un pixel
    * @param profundidad: entero positivo
    * @author aracely castro
    */
    public void setProfundidad(int profundidad){
        if (profundidad >= 0){
            this.profundidad = profundidad;
        }
    }
    
    //################################ PERTENENCIA ######################################
    /**
    * Descripción: Método para que verifica si tiene igual coordenada x e y
    * @param coordX: entero positivo
    * @param coordY: entero positivo
    * @return devuelve un boleano
    * @author aracely castro
    */
    public boolean igualCoordXY(int coordX, int coordY){
        return (getCoordX()==coordX && getCoordY()==coordY);
    }
    
    /**
    * Descripción: Método para que verifica si tiene igual profundidad
    * @param profundidad: entero positivo
    * @return devuelve un boleano
    * @author aracely castro
    */
    public boolean igualProfundidad(int profundidad){
        return (getProfundidad() == profundidad);
    }
    
}
