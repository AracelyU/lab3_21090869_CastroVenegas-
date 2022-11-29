package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 * Clase para definir el objeto Pixel
 * @author aracely castro
 */
public abstract class Pixel_21090869_CastroVenegas{

    // atributos de un pixel
    protected int coordX, coordY, profundidad; 
    
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
