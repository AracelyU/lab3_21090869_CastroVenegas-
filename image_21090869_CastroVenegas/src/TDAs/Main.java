package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
import Main.*;
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
        
        
        Menu menu = new Menu();
        
        while(!menu.getSalirMenu()){
            menu.MenuPrincipal();
            menu.ScannerOpcion();
        
        }
        
        /*
        
        // crear pixeles bit
        Pixbit_21090869_CastroVenegas p1 = new Pixbit_21090869_CastroVenegas(0,0,0,10);
        Pixbit_21090869_CastroVenegas p2 = new Pixbit_21090869_CastroVenegas(0,1,0,20);
        Pixbit_21090869_CastroVenegas p3 = new Pixbit_21090869_CastroVenegas(0,2,1,30);
        Pixbit_21090869_CastroVenegas p4 = new Pixbit_21090869_CastroVenegas(1,0,0,40);
        Pixbit_21090869_CastroVenegas p5 = new Pixbit_21090869_CastroVenegas(1,1,0,50);
        Pixbit_21090869_CastroVenegas p6 = new Pixbit_21090869_CastroVenegas(1,2,0,60);
        
        
        ArrayList pixeles = new ArrayList();
        pixeles.add(p1);
        pixeles.add(p2);
        pixeles.add(p3);
        pixeles.add(p4);
        pixeles.add(p5);
        pixeles.add(p6);
        
        // crear imagen
        Image_21090869_CastroVenegas image = new Image_21090869_CastroVenegas(2,3, pixeles);

        Pixrgb_21090869_CastroVenegas p1A = new Pixrgb_21090869_CastroVenegas(0,0,10,10,10,10);
        Pixrgb_21090869_CastroVenegas p2A = new Pixrgb_21090869_CastroVenegas(0,1,20,20,20,20);
        Pixrgb_21090869_CastroVenegas p3A = new Pixrgb_21090869_CastroVenegas(0,2,30,30,30,30);
    
        // creando su lista de pixeles
        ArrayList pixelesA = new ArrayList();
        pixelesA.add(p1A);
        pixelesA.add(p2A);
        pixelesA.add(p3A);
        
        Image_21090869_CastroVenegas imageA = new Image_21090869_CastroVenegas(1,3,pixelesA);     

        // crear pixeles hexmap
        Pixhex_21090869_CastroVenegas p1B = new Pixhex_21090869_CastroVenegas(0,0,"#000000",10);
        Pixhex_21090869_CastroVenegas p2B = new Pixhex_21090869_CastroVenegas(0,1,"#00FFFF",20);
        Pixhex_21090869_CastroVenegas p3B = new Pixhex_21090869_CastroVenegas(0,2,"#000000",30);
        
        // creando los pixeles
        ArrayList pixelesB = new ArrayList();
        pixelesB.add(p1B);
        pixelesB.add(p2B);
        pixelesB.add(p3B);
        
        Image_21090869_CastroVenegas imageB = new Image_21090869_CastroVenegas(1,3, pixelesB);
        
        
        imageA.mostrarImage();
        imageA.compress();
        imageA.mostrarImage();
        
        imageA.flipH();
        imageA.mostrarImage();
        
        System.out.println(imageA.detpLayers());
        String cadena = imageA.imageString();
        System.out.println(cadena);
        */
        
    
        
        
    }
    
    

}
