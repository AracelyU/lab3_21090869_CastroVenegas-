package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
import TDAs.Pixbit_21090869_CastroVenegas;
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
        
        Scanner entrada = new Scanner(System.in);  
        System.out.print("Ingresar ancho: ");
        int ancho = entrada.nextInt();
        System.out.print("Ingresar largo: ");
        int largo = entrada.nextInt();
        
        // TODO code application logic here
        Pixeles_21090869_CastroVenegas pixeles = new Pixeles_21090869_CastroVenegas();
        ArrayList pixelesC = pixeles.CrearPixeles(1, ancho, largo);
        
        // crear la imagen
        Image_21090869_CastroVenegas imagen = new Image_21090869_CastroVenegas(ancho, largo, pixelesC);
        imagen.InfoImagen();
        imagen.InfoImagenes();
        
        
        
        
        
        /*
        // crear objeto image
        Image_21090869_CastroVenegas image = new Image_21090869_CastroVenegas();
        ArrayList imageC = image.CrearImage(); // crea la imagen
        ArrayList listaImagenes = new ArrayList(); // crea la lista para guardar las imagenes
        image.GuardarImage(imageC, listaImagenes); // guarda la imagen en la lista
        
        System.out.println(imageC); 
        image.Imprimir(); // mostrar los datos de la clase image
        
        ArrayList imageC2 = image.CrearImage(); // crea la imagen
        image.GuardarImage(imageC2, listaImagenes); // guarda la imagen en la lista
        System.out.println(imageC2); 
        image.Imprimir(); // mostrar los datos de la clase image
        
        
        // como guardar otra imagen
        ArrayList image2 = mensajeroImg.CrearImage();
        mensajeroImg.GuardarImage(image2, listaImagenes);
        System.out.println("Lista: " + listaImagenes);
        
        
        // boleano
        image.IsBitmap();
        */
        
     

        //Pixeles mensajeroPix = new Pixeles(vCoordX, vCoordY, vProfundidad)
    }

}
