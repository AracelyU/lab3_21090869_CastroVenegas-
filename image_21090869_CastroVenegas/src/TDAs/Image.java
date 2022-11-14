package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author aracelyCastro
 */
public class Image {
    
    // definiendo las variables de una imagen
    private int ancho, largo;
    private ArrayList pixelesImage = new ArrayList(); // la lista de pixeles de la imagen
    
    // definiendo el constructor de una imagen, inicializa una imagen vacia
    public Image(){
        this.ancho = 0;
        this.largo = 0;
    }
    
    // pedir ancho y largo por consola
    private void PedirDimensiones(){
        Scanner entrada = new Scanner(System.in);  
        System.out.print("Ingresar ancho: ");
        this.ancho = entrada.nextInt();
        System.out.print("Ingresar largo: ");
        this.largo = entrada.nextInt();
    }
    
    // pedir los pixeles de la imagen por consola
    private void CrearPixeles(){
        int cantidadPixeles = ancho * largo;
        Pixbit pixBitLista = new Pixbit(0,0,0,0);
        this.pixelesImage = pixBitLista.ImagePixbit(cantidadPixeles, ancho, largo);
    }
    
    // crear una imagen
    public ArrayList CrearImage(){
        PedirDimensiones(); // pedir el ancho y largo por consola
        CrearPixeles(); // pedir la lista de pixeles por consola
        ArrayList image = new ArrayList(); // crear una lista
        image.add(ancho);
        image.add(largo);
        image.add(pixelesImage);
        return image; // retornar imagen
    }
    
    // guardar la imagen
    public void GuardarImage(ArrayList img, ArrayList imageLista){
        imageLista.add(img);
    }
    
    // método para imprimir información de la imagen
    public void Imprimir(){  
        System.out.println("El ancho de la imagen es: " + ancho);
        System.out.println("El largo de la imagen es: " + largo);
        System.out.println("Los pixeles de la imagen son: " + pixelesImage);
    }
    
    
    // imageIsBitmap método
    public boolean IsBitmap(){
        Pixbit pixelBit = new Pixbit(0,0,0,0);
        
        for(int i = 0;i < pixelesImage.size();i++){
            ArrayList pixel = (ArrayList) pixelesImage.get(i);
            
            if (pixel.size() != 4){ // si un pixel no tiene largo 4 directamente no es image Bitmap
                return false;
            }
            
            // obteniendo los valores del pixel
            int coordX = (int) pixel.get(0);
            int coordY = (int) pixel.get(1);
            int bit = (int) pixel.get(2);
            int profundidad = (int) pixel.get(3);   
            
            // si el pixel no es pixbit la imagen ya no es Bitmap
            if (!pixelBit.esPixbit(coordX, coordY, bit, profundidad)){
                return false;
            }      
        }
        return true;
    }
    
    
    
  
    /*
    // método para experimentar con listas
    public void Lista(){
    ArrayList lista = new ArrayList();
    lista.add(ancho);
    lista.add(largo);
    System.out.println(lista);
    ArrayList lista2 = new ArrayList();
    lista2.add(lista);
    lista2.add(ancho);
    System.out.println(lista2);
    }
     */
}


 