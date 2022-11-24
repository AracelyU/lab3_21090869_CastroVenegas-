/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import TDAs.*;
import java.util.Scanner;
import java.util.ArrayList;
        
/**
 *
 * @author arace
 */
public class Menu{
    
    private boolean salirMenu;
    private ArrayList listaImagenes;
    
    public Menu(){
        this.salirMenu = false;
        this.listaImagenes = new ArrayList();
    }
    
    
    public boolean getSalirMenu(){
        return salirMenu;
    }
    
    public void MenuPrincipal(){
        System.out.println("### Manipulador de imágenes ###");
        System.out.println("Escoja su opción: ");
        System.out.println("1. Crear una imagen");
        System.out.println("2. Modificar una imagen");
        System.out.println("3. Visualizar imagen");
        System.out.println("4. Salir");
    }
    
    public void ScannerOpcion(){
        Scanner entrada = new Scanner(System.in);
        int eleccion = entrada.nextInt();
        
        switch(eleccion){
            
            case 1: 
                OpcionCrearImage();
                break;
                
            case 2:
                //Opcion2();
                break;
            
            case 3:
                //Opcion3();
                break;
                
            case 4:
                System.out.println("El programa ha terminado. Se espera que la experiencia hay sido de su agrado");
                salirMenu = true;
                break;
        
        }
    
    }
    
    private void OpcionCrearImage(){
        MostrarOpcion1();
        ScannerOpcion1();
    }
    
    private void MostrarOpcion1(){
        System.out.println("### Manipulador de imágenes ###");
        System.out.println("Escoja su opción: ");
        System.out.println("1. Crear bitmap");
        System.out.println("2. Crear pixmap");
        System.out.println("3. Crear hexmap");
        System.out.println("4. Volver");
    }
    
    private void ScannerOpcion1(){
        Scanner entrada = new Scanner(System.in);
        int eleccion = entrada.nextInt();
        
        switch(eleccion){
            
            case 1: 
                crearBitmap();
                break;
                
            case 2:
                //crearPixmap();
                break;
            
            case 3:
                //crearHexmap();
                break;
                
            case 4: 
                // volver
                break;
        
        }
    }
    
    private void crearBitmap(){
        Scanner entrada = new Scanner(System.in);
        int ancho = -1;
        int largo = -1;
        
        while(ancho<0){ // pedir ancho
            System.out.println("Ingrese un ancho: ");
            ancho = entrada.nextInt();
        }
        
        while(largo<0){ // pedir largo
            System.out.println("Ingrese un largo: ");
            largo = entrada.nextInt();
        }
        
        ArrayList pixeles = new ArrayList();
        int coordX = -1;
        int coordY = -1;
        int bit = -1;
        int profundidad = -1;
        
        System.out.println("Largo * Ancho: " +(ancho*largo));
        
        for(int i=0; i< (ancho*largo); i++){
            System.out.println("Pixbit " + (i+1));
            
            while(coordX<0){ // pedir coordX
                System.out.println("Ingrese coordX: ");
                coordX = entrada.nextInt();
            }
            
            while(coordY<0){ // pedir coordY
                System.out.println("Ingrese coordY: ");
                coordY = entrada.nextInt();
            }
            
            while( (bit != 0) && (bit != 1)){ // pedir bit
                System.out.println("Ingrese bit: ");
                bit = entrada.nextInt();
            }
            
            while(profundidad<0){
                System.out.println("Ingrese profundidad: ");
                profundidad = entrada.nextInt();
            }
            
            // crear pixbit
            Pixbit_21090869_CastroVenegas pixel = new Pixbit_21090869_CastroVenegas(coordX, coordY, bit, profundidad);
            pixeles.add(pixel);
            coordX = -1;
            coordY = -1;
            bit = -1;
            profundidad = -1;
            
        }
        
        // crear la imagen:
        Image_21090869_CastroVenegas imagen = new Image_21090869_CastroVenegas(ancho, largo, pixeles);
        
        System.out.println("La imagen Bitmap se creo correctamente. "
                + "Si considera que la imagen "
                + "esta correctamente definida, ingrese 1 para guardar "
                + "la imagen y volver al Menu, caso contrario "
                + "ingrese 2 para volver al Menu sin guardar la imagen");
        
        int opcion = 0;
        while(opcion != 1 && opcion != 2){
            System.out.println("Ingrese opción: ");
            opcion = entrada.nextInt();
        }
        
        imagen.mostrarImage();
        
        switch(opcion){
            case 1: // guardar imagen y volver al menu
                System.out.println("\nLa imagen se ha guardado correctamente");
                listaImagenes.add(imagen);
                break;
                
            case 2:
                System.out.println("\nLa imagen no se ha guardado");
                break;

        }

    }



    
    
      
}
        
        
