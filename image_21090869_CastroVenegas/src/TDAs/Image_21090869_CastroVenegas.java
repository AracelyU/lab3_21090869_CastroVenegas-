package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author aracelyCastro
 */
public class Image_21090869_CastroVenegas {
    
    // definiendo las variables de una imagen
    private int ancho, largo;
    private ArrayList pixelesImage = new ArrayList(); // la lista de pixeles de la imagen
    
    // definiendo otras variables
    private ArrayList imageLista = new ArrayList();
    
    // definiendo el constructor de una imagen
    public Image_21090869_CastroVenegas(int ancho, int largo, ArrayList pixeles){
        this.ancho = ancho;
        this.largo = largo;
        this.pixelesImage = pixeles;
    }
    
    
    // guardar la imagen en la lista
    public void GuardarImage(ArrayList img, int ID){
        ArrayList imagenGuardada = new ArrayList();
        imagenGuardada.add(ID); // ID para identificar la imagen guardada
        imagenGuardada.add(img); // la imagen guardada
        this.imageLista.add(imagenGuardada); 
    }
    
    // método para imprimir información de la imagen
    public void InfoImagen(){  
        System.out.println("El ancho de la imagen es: " + ancho);
        System.out.println("El largo de la imagen es: " + largo);
        System.out.println("Los pixeles de la imagen son: " + pixelesImage);
    }
    
    public void InfoImagenes(){  
        System.out.println("Imagenes son: " + imageLista);
    }
    
}
