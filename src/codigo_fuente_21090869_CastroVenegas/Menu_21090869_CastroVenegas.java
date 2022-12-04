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
 * 
 * Representación: Se considera un objeto menu con dos atributos, un boleano
 * para indicar el termino del programa y una imagen para utilizar durante 
 * la ejecución del programa
 * 
 * Relaciones
 * 
 * Tiene relación de composición con Image_21090869_CastroVenegas, siendo
 * esta la clase contenedora
 * 
 * Tiene relación de composición con Main, siendo esta la clase miembro
 * 
 * @author aracely castro
 */
public class Menu_21090869_CastroVenegas{
    private boolean salirMenu; // boleano para controlar la salida del programa
    private Image_21090869_CastroVenegas image; // una sola imagen para modificar durante todo el programa
    
    //################################ CONSTRUCTOR ######################################
    /**
     * Descripción: Constructor de menu
     * @author aracely castro
     */
    public Menu_21090869_CastroVenegas(){
        this.salirMenu = false; 
        this.image = new Image_21090869_CastroVenegas(0,0,null);
        image.cargarBitmap(); // inicialmente el programa tendrá cargado una imagen Bitmap de 2x3
    }
    
    //################################ SELECTORES ######################################
    /**
     * Descripción: Obtiene el boleano de salirMenu
     * @return devuelve un boleano
     * @author aracely castro
     */
    public boolean getSalirMenu(){
        return salirMenu;
    }
    
    //################################ MODIFICADORES Y OTROS MÉTODOS ######################################
    /**
     * Descripción: Método para ejecutar los método principales para ejecutar el programa
     * @author aracely castro
     */
    public void ejecutarMenu(){
        menuPrincipal();
        scannerOpcion();
    }
    
    /**
     * Descripción: Método que muestra opciones principales del menu
     * @author aracely castro
     */
    private void menuPrincipal(){
        System.out.println("### Manipulador de imagenes ###");
        System.out.println("Escoja su opcion: ");
        System.out.println("1. Crear una imagen");
        System.out.println("2. Modificar una imagen");
        System.out.println("3. Visualizar imagen"); 
        System.out.println("4. Cargar una imagen de prueba");
        System.out.println("5. Salir"); 
    }
    
    /**
     * Descripción: Método que escanea la opciones del menu
     * @author aracely castro
     */
    private void scannerOpcion(){
        Scanner entrada = new Scanner(System.in);
        try {
            
            System.out.print("Ingrese su opcion: ");
            int eleccion = entrada.nextInt();
            switch(eleccion){
                case 1: 
                    mensajesOpcion1();
                    scannerOpcion1();
                    break;
                case 2:
                    mensajesOpcion2();
                    scannerOpcion2();
                    break;
                case 3:
                    System.out.println("\nHas seleccionado visualizar imagen");
                    System.out.println("Imagen resultante");
                    System.out.print("Ancho:" + image.getAncho() + " Largo: " + image.getLargo() + "\n");
                    System.out.println(image.imageString());
                    break;
                    
                case 4:
                    mensajesCargarImage();
                    cargarImage();
                    break;
                case 5:
                    System.out.println("\nEl programa ha terminado. Se espera que la experiencia hay sido de su agrado");
                    salirMenu = true;
                    break;
                default:
                    System.out.println("\nEsa opción no existe");
                    break;
            }   
        } catch (InputMismatchException e) {
                    System.out.println("\nSolo se admite de entrada enteros positivos");
                    entrada.next();
        } 
    }
    
    /**
     * Descripción: Método para mostrar las opciones en crear una imagen
     * @author aracely castro
     */
    private void mensajesOpcion1(){
        System.out.println("\n### Crear una imagen ###");
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
    private void scannerOpcion1(){
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Ingrese su opcion: ");
            int eleccion = entrada.nextInt();
            switch(eleccion){
                case 1: // crear imagen bitmap por consola
                    System.out.print("\nHas seleccionado crear bitmap\n");
                    image.crearBitmap();
                    System.out.println();
            
                    break;
                case 2: // crear imagen pixmap por consola
                    System.out.print("\nHas seleccionado crear pixmap\n");
                    image.crearPixmap();
                    System.out.println();
                    
                    break;
                case 3: // crear imagen hexmap por consola
                    System.out.print("\nHas seleccionado crear hexmap\n");
                    image.crearHexmap();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\nHas seleccionado volver");
                    break;
                default:
                    System.out.println("\nEsa opcion no existe");
                    break;
            }   
        } catch (InputMismatchException e) {
                    System.out.println("\nSolo se admite de entrada enteros positivos");
                    entrada.next();
        } 
    }
    
    /**
     * Descripción: Método que muestra los mensajes de la opción modificar imagen
     * @author aracely castro
     */
    private void mensajesOpcion2(){
        System.out.println("\n### Modificar una imagen ###");
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
        System.out.print("18. Volver\n");
    }
    
    /**
     * Descripción: Método que aplica la modificación elegida para la imagen
     * @author aracely castro
     */
    private void scannerOpcion2(){
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Ingrese su opcion: ");
            int eleccion = entrada.nextInt();
            
            switch(eleccion){
                case 1:
                    System.out.println("\nHas seleccionado isBitmap");
                    System.out.println("La consulta es: " + image.isBitmap());
                    break;
                case 2:
                    System.out.println("\nHas seleccionado isPixmap");
                    System.out.println("La consulta es: " + image.isPixmap());
                    break;
                case 3:
                    System.out.println("\nHas seleccionado isHexmap");
                    System.out.println("La consulta es: " + image.isHexmap());
                    break;
                case 4:
                    System.out.println("\nHas seleccionado isCompressed");
                    System.out.println("La consulta es: " + image.isCompressed());
                    break;
                case 5: 
                    System.out.println("\nHas seleccionado flipH");
                    image.flipH();
                    System.out.println("Se ha aplicado flipH a la imagen.\n");
                    break;
                
                case 6:
                    System.out.println("\nHas seleccionado flipV");
                    image.flipV();
                    System.out.println("Se ha aplicado flipV a la imagen.\n");
                    break;
                
                case 7:
                    System.out.println("\nHas seleccionado crop");
                    System.out.println("Ingresar coordenadas para el crop\n");
                    System.out.print("Ingrese X1: ");
                    int x1 = entrada.nextInt();
                    System.out.print("Ingrese Y1: ");
                    int y1 = entrada.nextInt();
                    System.out.print("Ingrese X2: ");
                    int x2 = entrada.nextInt();
                    System.out.print("Ingrese Y2: ");
                    int y2 = entrada.nextInt();
                    image.crop(x1, y1, x2, y2);
                    System.out.print("Se ha aplicado crop a la imagen.\n");
                    break;
                
                case 8:
                    System.out.println("\nHas seleccionado imgRGBToHex");
                    if(!image.isPixmap()){
                        System.out.println("No puedes aplicar este metodo a una imagen que no sea Pixmap\n");
                        break;
                    }
                
                    image.imgRGBToHex();
                    System.out.println("Se ha aplicado imgRGBToHex a la imagen.\n");
                    break;
                
                case 9:
                    System.out.println("\nHas seleccionado histogram");
                    System.out.println("Se ha aplicado histogram a la imagen.\n");
                    System.out.println("Histograma de la imagen: " + image.mostrarHistogram(image.histogram())+"\n");
                 
                    break;
                
                case 10:
                    System.out.println("\nHas seleccionado rotate90");
                    image.rotate90();
                    System.out.println("Se ha aplicado rotate90 a la imagen.\n");
                    break;
            
                case 11:
                    System.out.println("\nHas seleccionado compressed");
                    image.compress();
                    System.out.println("\nImagen comprimida");
                    System.out.println(image.imageStringComprimido());
                    System.out.println("Se ha aplicado compress la imagen.\n");
                    break;
                
                case 12:
                    System.out.println("\nHas seleccionado changePixel");
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
                    System.out.println("\nHas seleccionado invertColorBit");
                    if(!image.isBitmap()){
                        System.out.println("No puedes aplicar este metodo a una imagen que no sea Bitmap\n");
                        break;
                    }
                
                    image.invertColorBit();
                    System.out.println("Se ha aplicado invertColorBit a la imagen.\n");
                    break;
                
                case 14:
                    System.out.println("\nHas seleccionado invertColorRGB");
                    if(!image.isPixmap()){
                        System.out.println("No puedes aplicar este metodo a una imagen que no sea Pixmap\n");
                        break;
                    }

                    image.invertColorRGB();
                    System.out.println("Se ha aplicado invertColorRGB a la imagen.\n");
                    break;

                case 15:
                    System.out.println("\nHas seleccionado imageString");  
                    String cadena = image.imageString();
                    System.out.println("Se ha aplicado imageString a la imagen.\n");
                    System.out.println("-----------------------------");
                    System.out.println("Imagen resultante: ");
                    System.out.println(cadena);
                    System.out.println("-----------------------------\n");
                    break;
                
                case 16:
                    System.out.println("\nHas seleccionado depthLayers");   
                    ArrayList<Image_21090869_CastroVenegas> imagenes  = image.detpLayers();
                    System.out.println("Se ha aplicado depthLayers la imagen.\n");
                    System.out.println("-----------------------------");
                    System.out.println("Imagenes resultantes");
                    for(int i=0; i< imagenes.size(); i++){
                        System.out.println("Imagen " + (i+1));
                        Image_21090869_CastroVenegas imagen = (Image_21090869_CastroVenegas) imagenes.get(i);
                        System.out.println("Ancho: " + imagen.getAncho() + " Largo: " + imagen.getLargo() + "\n");
                        System.out.println(imagen.imageString());
                        System.out.println();
                    }
                    System.out.println("-----------------------------\n");
                    break;                
                        
                case 17:
                    System.out.println("\nHas seleccionado decompress");
                    if (!image.isCompressed()){
                        System.out.println("Solo se puede descomprimir una imagen comprimida\n");
                        break;
                    }
                    image.decompress();
                    System.out.println("Se ha aplicado decompress la imagen.\n");
                    break;
                    
                case 18:
                    System.out.println("\nHas seleccionado volver");
                    break;
                
                
                default:
                    System.out.println("\nEsa opcion no existe");
                    break;
            }   
        } catch (InputMismatchException e) {
                    System.out.println("\nSolo se admite de entrada enteros positivos");
                    entrada.next();
        } 
    
    
    }    
    
    /**
     * Descripción: Método para mostrar mensajes para cargar una imagen predeterminada 
     * @author aracely castro
     */
    private void mensajesCargarImage(){
        System.out.println("### Cargar imagen predeterminada ###");
        System.out.println("Eliga un tipo de imagen");
        System.out.println("1. Cargar Bitmap 2 x 3");
        System.out.println("2. Cargar Pixmap 6 x 2");
        System.out.println("3. Cargar Hexmap 4 x 4");
        System.out.println("4. Volver");
    }
    
    /**
     * Descripción: Método para cargar una imagen predeterminada 
     * @author aracely castro
     */
    private void cargarImage(){
        Scanner entrada = new Scanner(System.in);
        try {
            
            System.out.print("Ingrese su opcion: ");
            int eleccion = entrada.nextInt();
            switch(eleccion){
                case 1: 
                    System.out.println("\nHas seleccionado cargar Bitmap");
                    image.cargarBitmap();
                    System.out.println("Se ha cargado la imagen Bitmap\n");
                    break;
                case 2:
                    System.out.println("\nHas seleccionado cargar Pixmap");
                    image.cargarPixmap();
                    System.out.println("Se ha cargado la imagen Pixmap\n");
                    break;
                case 3:
                    System.out.println("\nHas seleccionado cargar Hexmap");
                    image.cargarHexmap();
                    System.out.println("Se ha cargado la imagen Hexmap\n");
                    break;
                    
                case 4:
                    System.out.println("\nHas seleccionado volver");
                    break;

                default:
                    System.out.println("\nEsa opción no existe");
                    break;
            }   
        } catch (InputMismatchException e) {
                    System.out.println("\nSolo se admite de entrada enteros positivos");
                    entrada.next();
        } 
    
    }
    
}
