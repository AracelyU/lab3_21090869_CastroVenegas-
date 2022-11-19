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
        
        // crear pixeles bit
        Pixbit_21090869_CastroVenegas p1 = new Pixbit_21090869_CastroVenegas(0,0,0,10);
        Pixbit_21090869_CastroVenegas p2 = new Pixbit_21090869_CastroVenegas(0,1,1,20);
        Pixbit_21090869_CastroVenegas p3 = new Pixbit_21090869_CastroVenegas(0,2,0,30);
        
        ArrayList pixeles = new ArrayList();
        pixeles.add(p1);
        pixeles.add(p2);
        pixeles.add(p3);
        
        // crear imagen
        Image_21090869_CastroVenegas image = new Image_21090869_CastroVenegas(1,3, pixeles);
        
        // mostrar datos de la imagen creada
        image.mostrarImage();
        
        /*
        // comprobar si es isBitmap
        System.out.println("isBitmap: " +image.isBitmap());
        System.out.println("isPixmap: " +image.isPixmap());
        System.out.println("isHexmap: " +image.isHexmap());
        */
        
        // hacer flip
        image.flipH();
        
        // mostrar nuevos datos tras flipH
        image.mostrarImage();
        
        
        /*
        // creando pixeles pixrgb
        Pixrgb_21090869_CastroVenegas p1A = new Pixrgb_21090869_CastroVenegas(0,0,10,10,10,10);
        Pixrgb_21090869_CastroVenegas p2A = new Pixrgb_21090869_CastroVenegas(0,1,20,20,20,20);
        Pixrgb_21090869_CastroVenegas p3A = new Pixrgb_21090869_CastroVenegas(0,2,30,30,30,30);
    
        // creando su lista de pixeles
        ArrayList pixelesA = new ArrayList();
        pixelesA.add(p1A);
        pixelesA.add(p2A);
        pixelesA.add(p3A);
        
        // crear otra imagen
        Image_21090869_CastroVenegas imageA = new Image_21090869_CastroVenegas(1,3,pixelesA);
        
        System.out.println("ImagenA");
        System.out.println("Ancho: " +imageA.getAncho());
        System.out.println("Largo: "+imageA.getLargo());
        System.out.println("Pixeles: "+imageA.getPixeles());
        
        // comprobar pertenencia
        System.out.println("isBitmap: " +imageA.isBitmap());
        System.out.println("isPixmap: " +imageA.isPixmap());
        System.out.println("isHexmap: " +imageA.isHexmap());
        
        // crear pixeles hexmap
        Pixhex_21090869_CastroVenegas p1B = new Pixhex_21090869_CastroVenegas(0,0,"#FFFFFF",10);
        Pixhex_21090869_CastroVenegas p2B = new Pixhex_21090869_CastroVenegas(0,1,"#00FFFF",20);
        Pixhex_21090869_CastroVenegas p3B = new Pixhex_21090869_CastroVenegas(0,2,"#000000",30);
        
        // creando los pixeles
        ArrayList pixelesB = new ArrayList();
        pixelesB.add(p1B);
        pixelesB.add(p2B);
        pixelesB.add(p3B);
        
        
        // creando la imagen 
        Image_21090869_CastroVenegas imageB = new Image_21090869_CastroVenegas(1,3, pixelesB);
        
        System.out.println("ImagenB");
        System.out.println("Ancho: "+imageB.getAncho());
        System.out.println("Largo: "+imageB.getLargo());
        System.out.println("Pixeles: "+imageB.getPixeles());
        
        // comprobar is es isBitmap
        System.out.println("isBitmap: " +imageB.isBitmap());
        System.out.println("isPixmap: " +imageB.isPixmap());
        System.out.println("isHexmap: " +imageB.isHexmap());
        
        */
        
    }

}
