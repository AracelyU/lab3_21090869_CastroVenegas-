/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

/**
 *
 * @author arace
 */
public class Pixhex_21090869_CastroVenegas extends Pixel_21090869_CastroVenegas {
    
    private String stringHex;

    public Pixhex_21090869_CastroVenegas(int vCoordX, int vCoordY, String vHex, int vProfundidad){
        super(vCoordX, vCoordY, vProfundidad);
       
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
    
    // mostrar información del pixhex
    public void mostrarPixhex(){
        System.out.println();
        System.out.print("CoordX: "+ this.coordX + " ");
        System.out.print("CoordY: "+ this.coordY + " ");
        System.out.print("Hex: "+ this.stringHex + " ");
        System.out.print("Profundidad: "+ this.profundidad);
    }
    
}

