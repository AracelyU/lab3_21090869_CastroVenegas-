package TDAs;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.ArrayList;
/**
 * Clase para definir el objeto Pixbit
 * @author aracely castro
 */
public class Pixbit_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas{
    
    // atributos de un pixbit
    private int bit;
    
    /**
    * Descripción: Constructor de pixbit
    * @param coordX: entero positivo. 
    * @param coordY: entero positivo
    * @param bit: entero 0 | 1 
    * @param profundidad: entero positivo
    * @author aracely castro
    */
    public Pixbit_21090869_CastroVenegas(int coordX, int coordY, int bit, int profundidad){
        super(coordX, coordY, profundidad);
        this.bit = bit;
        
    }
    
    /**
    * Descripción: Método para obtener el valor bit de un pixbit
    * @return devuelve un entero positivo
    * @author aracely castro
    */
    public int getBit(){
        return bit;
    }
    
    /**
    * Descripción: Método para cambiar el valor bit de un pixbit
    * @param bit: entero 0 | 1
    * @author aracely castro
    */
    public void setBit(int bit){
        if (bit == 0 || bit == 1){
            this.bit = bit;
        }
    }
    
    /**
    * Descripción: Método para cambiar el valor bit de un pixbit por su opuesto
    * @param bit: entero 0 | 1
    * @author aracely castro
    */
    public void invertBit(int bit){
        if(bit == 0){
            setBit(1);
        } else{
            setBit(0);
        }
    }
    
    /**
    * Descripción: Método que ve si se tiene igual bit al ingresado
    * @param bit: entero 0 | 1
    * @param pixel: pixbit
    * @return devuelve un boleano
    * @author aracely castro
    */
    public boolean igualColorBit(Pixbit_21090869_CastroVenegas pixel, int bit){
        return pixel.getBit() == bit;
    }
    
    /**
    * Descripción: Método que suma los pixbit con igual bit al ingresado
    * @param bit: entero 0 | 1
    * @param pixeles: lista de objetos
    * @return devuelve un entero
    * @author aracely castro
    */
    public int sumaColorBit(ArrayList pixeles, int bit){
        int suma = 0;
        for(int i =0; i < pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixel = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
            if (igualColorBit(pixel, bit)){
                suma++;
            }
        }
        return suma;
    }
    
    /**
    * Descripción: Método que elimina los pixbit con igual bit al ingresado
    * @param bit: entero 0 | 1
    * @param pixeles: lista de objetos
    * @return devuelve una lista de objetos
    * @author aracely castro
    */
    public ArrayList eliminarColorBit(ArrayList pixeles, int bit){
        ArrayList pixelesTemporal = new ArrayList();
        for(int i=0; i < pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixelRecogido = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
            if(!igualColorBit(pixelRecogido, bit)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }
    
    /**
    * Descripción: Método que elimina los pixbit con igual profundidad ingresada
    * @param profundidad: entero positivo
    * @param pixeles: lista de objetos
    * @return devuelve una lista de objetos
    * @author aracely castro
    */
    public ArrayList eliminarProfundidad(ArrayList pixeles, int profundidad){
        ArrayList pixelesTemporal = new ArrayList();
        for(int i=0; i < pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixelRecogido = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
            if(!pixelRecogido.igualProfundidad(profundidad)){
                pixelesTemporal.add(pixelRecogido);
            }
        }
        return pixelesTemporal;
    }
    
    /**
    * Descripción: Método que crea un pixbit blanco con profundidad ingresada
    * @param profundidad: entero positivo
    * @return devuelve un pixbit
    * @author aracely castro
    */
    public Pixbit_21090869_CastroVenegas pixelBlancoBit(int profundidad){
        Pixbit_21090869_CastroVenegas pixel = new Pixbit_21090869_CastroVenegas(getCoordX(), getCoordY(), 1, profundidad);
        return pixel;
    }
    
    /**
    * Descripción: Método para imprimir el pixbits
    * @author aracely castro
    */ 
    public void mostrarPixbit(){
        ArrayList pixel = new ArrayList();
        pixel.add(getCoordX());
        pixel.add(getCoordY());
        pixel.add(getBit());
        pixel.add(getProfundidad());
        System.out.print(pixel + " ");
    }
}
