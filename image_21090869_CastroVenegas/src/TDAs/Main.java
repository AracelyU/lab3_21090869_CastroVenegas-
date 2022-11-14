package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
import TDAs.Pixbit;
import java.util.ArrayList;

/**
 *
 * @author arace
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        
        // crear objeto image
        Image mensajeroImg = new Image();
        ArrayList image = mensajeroImg.CrearImage(); // crea la imagen
        ArrayList listaImagenes = new ArrayList(); // crea la lista para guardar las imagenes
        mensajeroImg.GuardarImage(image, listaImagenes); // guarda la imagen en la lista
        
        /*
        // como guardar otra imagen
        ArrayList image2 = mensajeroImg.CrearImage();
        mensajeroImg.GuardarImage(image2, listaImagenes);
        System.out.println("Lista: " + listaImagenes);
        */
        
        // boleano
        mensajeroImg.IsBitmap();
        
        
     

        //Pixeles mensajeroPix = new Pixeles(vCoordX, vCoordY, vProfundidad)
    }
}
