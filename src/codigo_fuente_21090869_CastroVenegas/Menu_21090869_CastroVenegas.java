/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Contiene el programa que se ejecuta por main
 * @author aracely castro
 */
public class Menu_21090869_CastroVenegas {
    private boolean salirMenu; // boleano para controlar la salida del programa
    private Image_21090869_CastroVenegas image; // una sola imagen para modificar durante todo el programa
    
    /**
     * Descripción: Constructor de menu
     * @author aracely castro
     */
    public Menu_21090869_CastroVenegas(){
        this.salirMenu = false; 
        this.image = new Image_21090869_CastroVenegas(0,0,null);
    }
    
    /**
     * Descripción: Obtiene el boleano de salirMenu
     * @return devuelve un boleano
     * @author aracely castro
     */
    public boolean getSalirMenu(){
        return salirMenu;
    }
    
    
    /**
     * Descripción: Método para ejecutar los método principales para ejecutar el programa
     * @author aracely castro
     */
    public void EjecutarMenu(){
        MenuPrincipal();
        ScannerOpcion();
    }
    
    /**
     * Descripción: Método que muestra las imagenes del menu
     * @author aracely castro
     */
    private void MenuPrincipal(){
        System.out.println("### Manipulador de imagenes ###");
        System.out.println("Escoja su opcion: ");
        System.out.println("1. Crear una imagen");
        System.out.println("2. Modificar una imagen");
        System.out.println("3. Visualizar imagen"); 
        System.out.println("4. Salir"); 
    }
    
    /**
     * Descripción: Método que escanea la opciones del menu
     * @author aracely castro
     */
    private void ScannerOpcion(){
        Scanner entrada = new Scanner(System.in);
        try {
            
            System.out.print("Ingrese su opcion: ");
            int eleccion = entrada.nextInt();
            switch(eleccion){
                case 1: 
                    mensajesOpcion1();
                    ScannerOpcion1();
                    break;
                case 2:
                    if((image.getAncho() == 0) && (image.getLargo() == 0) && (image.getPixeles() == null)){
                        System.out.println("Para modificar una imagen debe de tener una imagen creada");
                        break;
                    }
                    mensajesOpcion2();
                    ScannerOpcion2();
                    break;
                case 3:
                    if((image.getAncho() == 0) && (image.getLargo() == 0) && (image.getPixeles() == null)){
                        System.out.println("No hay imagen para visualizar");
                        break;
                    }
                    mostrarImage();
                    break;
                case 4:
                    System.out.println("El programa ha terminado. Se espera que la experiencia hay sido de su agrado");
                    salirMenu = true;
                    break;
                default:
                    System.out.println("Esa opción no existe");
                    break;
            }   
        } catch (InputMismatchException e) {
                    System.out.println("El menu solo admite como entrada numeros y alguna de las opciones anteriores");
                    entrada.next();
        } 
    }
    
    /**
     * Descripción: Método para mostrar las opciones en crear una imagen
     * @author aracely castro
     */
    private void mensajesOpcion1(){
        System.out.println("### Crear una imagen ###");
        System.out.println("Escoja su opcion: ");
        System.out.println("1. Crear bitmap");
        System.out.println("2. Crear pixmap");
        System.out.println("3. Crear hexmap");
        System.out.println("4. Volver");  
    }
    
    /**
     * Descripción: Método que modifica la imagen por la que se quiere
     * @author aracely castro
     */
    private void ScannerOpcion1(){
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Ingrese su opcion: ");
            int eleccion = entrada.nextInt();
            switch(eleccion){
                case 1: // crear imagen bitmap
                    image.crearBitmap();
                    System.out.println();
                    mostrarImage();
            
                    break;
                case 2: // crear imagen pixmap
                    image.crearPixmap();
                    System.out.println();
                    mostrarImage();
                    
                    break;
                case 3: // crear imagen hexmap
                    image.crearHexmap();
                    System.out.println();
                    mostrarImage();
                    break;
                case 4:
                    System.out.println("Volver al menu principal");
                    salirMenu = true;
                    break;
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }   
        } catch (InputMismatchException e) {
                    System.out.println("El menu solo admite como entrada numeros y alguna de las opciones anteriores");
                    entrada.next();
        } 
    }
    
    /**
     * Descripción: Método que muestra los mensajes de la opción modificar imagen
     * @author aracely castro
     */
    private void mensajesOpcion2(){
        System.out.println("### Modificar una imagen ###");
        System.out.println("1. isBitmap");
        System.out.println("2. isPixmap");
        System.out.println("3. isHexmap");
        System.out.println("4. isCompressed");
        System.out.println("5. flipH");
        System.out.println("6. flipV");
        System.out.println("7. crop");
        System.out.println("8. imgRGBToHex");
        System.out.println("9. histogram");
        System.out.println("10. rotate90");
        System.out.println("11. compress");
        System.out.println("12. changePixel");
        System.out.println("13. invertColorBit");
        System.out.println("14. invertColorRGB");
        System.out.println("15. imageString");
        System.out.println("16. depthLayers");
        System.out.println("17. decompress");
    }
    
    /**
     * Descripción: Método que aplica la modificación elegida para la imagen
     * @author aracely castro
     */
    private void ScannerOpcion2(){
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Ingrese su opcion: ");
            int eleccion = entrada.nextInt();
            
            if((image.getAncho() == 0) && (image.getLargo() == 0) && (image.getPixeles() == null)){
                System.out.println("Para modificar una imagen debe de tener una imagen creada");
               
            }
            
            switch(eleccion){
                case 1:
                    System.out.println("Has seleccionado isBitmap");
                    System.out.println("La respuesta es: " + image.isBitmap());
                    break;
                case 2:
                    System.out.println("Has seleccionado isPixmap");
                    System.out.println("La respuesta es: " + image.isPixmap());
                    break;
                case 3:
                    System.out.println("Has seleccionado isHexmap");
                    System.out.println("La respuesta es: " + image.isHexmap());
                    break;
                case 4:
                    System.out.println("Has seleccionado isCompressed");
                    System.out.println("La respuesta es: " + image.isCompressed());
                    break;
                case 5: 
                    System.out.println("Has seleccionado flipH");
                    image.flipH();
                    System.out.println("Se ha aplicado flipH a la imagen.\n");
                    break;
                
                case 6:
                    System.out.println("Has seleccionado flipV");
                    image.flipV();
                    System.out.println("Se ha aplicado flipV a la imagen.\n");
                    break;
                
                case 7:
                    System.out.println("Has seleccionado crop");
                    System.out.println("Ingrese X1: ");
                    int x1 = entrada.nextInt();
                    System.out.println("Ingrese Y1: ");
                    int y1 = entrada.nextInt();
                    System.out.println("Ingrese X2: ");
                    int x2 = entrada.nextInt();
                    System.out.println("Ingrese Y2: ");
                    int y2 = entrada.nextInt();
                    image.crop(x1, y1, x2, y2);
                    System.out.println("Se ha aplicado crop a la imagen.\n");
                    break;
                
                case 8:
                    System.out.println("Has seleccionado imgRGBToHex");
                    if(!image.isPixmap()){
                        System.out.println("No puedes aplicar este metodo a una imagen que no sea Pixmap");
                        break;
                    }
                
                    image.imgRGBToHex();
                    System.out.println("Se ha aplicado imgRGBToHex a la imagen.\n");
                    break;
                
                case 9:
                    System.out.println("Has seleccionado histogram");
                    System.out.println("Se ha aplicado histogram a la imagen.\n");
                    System.out.println("Histograma de la imagen: " + image.mostrarHistogram(image.histogram()));
                    break;
                
                case 10:
                    System.out.println("Has seleccionado rotate90");
                    image.rotate90();
                    System.out.println("Se ha aplicado rotate90 a la imagen.\n");
                    break;
            
                case 11:
                    System.out.println("Has seleccionado compressed");
                    image.compress();
                    System.out.println("Imagen comprimida");
                    image.mostrarImage();
                    System.out.println("Se ha aplicado compress la imagen.\n");
                    break;
                
                case 12:
                    System.out.println("Has seleccionado changePixel");
                    System.out.println("Crear pixel a reemplazar");
                
                    if(image.isCompressed()){
                        image.decompress();
                    }
                
                    if(image.isBitmap()){ 
                        Pixbit_21090869_CastroVenegas pixel = image.crearPixbit("nuevo");
                        image.changePixel(pixel);
                    }
                
                    if(image.isPixmap()){
                        Pixrgb_21090869_CastroVenegas pixel = image.crearPixrgb("nuevo");
                        image.changePixel(pixel);
                    }
                
                    if(image.isHexmap()){
                        Pixhex_21090869_CastroVenegas pixel = image.crearPixhex("nuevo");
                        image.changePixel(pixel);
                    }

                    System.out.println("Se ha aplicado changePixel la imagen.\n");
                    break;
                
                case 13:
                    System.out.println("Has seleccionado invertColorBit");
                    if(!image.isBitmap()){
                        System.out.println("No puedes aplicar este metodo a una imagen que no sea Bitmap");
                        break;
                    }
                
                    image.invertColorBit();
                    System.out.println("Se ha aplicado invertColorBit a la imagen.\n");
                    break;
                
                case 14:
                    System.out.println("Has seleccionado invertColorRGB");
                    if(!image.isPixmap()){
                        System.out.println("No puedes aplicar este metodo a una imagen que no sea Pixmap");
                        break;
                    }

                    image.invertColorRGB();
                    System.out.println("Se ha aplicado invertColorRGB a la imagen.\n");
                    break;

                case 15:
                    System.out.println("Has seleccionado imageString");   
                    System.out.println("-----------------------------");
                    System.out.println("Imagen resultante: ");
                    System.out.println(image.imageString());
                    System.out.println("-----------------------------");
                    System.out.println("Se ha aplicado invertColorRGB a la imagen.\n");
                    break;
                
                case 16:
                    System.out.println("Has seleccionado depthLayers");   
                    ArrayList<Image_21090869_CastroVenegas> imagenes  = image.detpLayers();
                    System.out.println("Se ha aplicado depthLayers la imagen.\n");
                    System.out.println("-----------------------------");
                    System.out.println("Imagenes resultantes");
                    for(int i=0; i< imagenes.size(); i++){
                        System.out.println("Imagen " + (i+1));
                        Image_21090869_CastroVenegas imagen = (Image_21090869_CastroVenegas) imagenes.get(i);
                        System.out.println(imagen.imageString());
                        System.out.println();
                    }
                    System.out.println("-----------------------------");
                    break;                
                        
                case 17:
                    System.out.println("Has seleccionado decompress");
                    if (!image.isCompressed()){
                        System.out.println("Solo se puede descomprimir una imagen comprimida");
                        break;
                    }
                    image.decompress();
                    System.out.println("Se ha aplicado decompress la imagen.\n");
                    break;
                
                
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }   
        } catch (InputMismatchException e) {
                    System.out.println("El menu solo admite como entrada numeros y alguna de las opciones anteriores");
                    entrada.next();
        } 
    
    
    }    
    
    
    /**
     * Descripción: Método para visualizar la imagen actual
     * @author aracely castro
     */
    private void mostrarImage(){
        System.out.println("Ancho: " + image.getAncho() + " Largo: " + image.getLargo());
        if (image.isBitmap()){
            System.out.println("Bitmap creado");
            
        } else if(image.isPixmap()){
            System.out.println("Pixmap creado");
        
        } else if(image.isHexmap()){
            System.out.println("Hexmap creado");
        }
        
        if (image.isBitmapComprimido()){
            System.out.println("Bitmap creado");
            
        } else if(image.isPixmapComprimido()){
            System.out.println("Pixmap creado");
        
        } else if(image.isHexmapComprimido()){
            System.out.println("Hexmap creado");
        }
        
        String cadena = image.imageString();
        System.out.println(cadena);
        
    }
    
}
