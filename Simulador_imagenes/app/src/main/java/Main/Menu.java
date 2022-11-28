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
    private ArrayList listaImagenes = new ArrayList();
    
    public Menu(){
        this.salirMenu = false; 
    }
    
    public void ejecutarMenu(){
        MenuPrincipal();
        ScannerOpcion();
    }
    
    private ArrayList getImagenes(){
        return listaImagenes;
    }
    
    private void setImagenes(ArrayList imagenes){
        this.listaImagenes = imagenes;
    }
    
    
    public boolean getSalirMenu(){
        return salirMenu;
    }
    
    private void MenuPrincipal(){
        System.out.println("### Manipulador de imágenes ###");
        System.out.println("Escoja su opción: ");
        System.out.println("1. Crear una imagen");
        System.out.println("2. Modificar una imagen");
        System.out.println("3. Visualizar imagen");
        
        if(getImagenes().size() >= 4){
            System.out.println("4. Eliminar imagen");
            System.out.println("5. Salir");
        } else{
            System.out.println("4. Salir");
        }
        
        
    }
    
    private void ScannerOpcion(){
        Scanner entrada = new Scanner(System.in);
        int eleccion = entrada.nextInt();
        
        if(getImagenes().size() < 4){
            switch(eleccion){
                case 1: 
                    opcionCrearImage();
                    break;
                case 2:
                    opcionModificarImage();
                    break;
                case 3:
                    opcionVisualizarImage();
                    break;
                case 4:
                    System.out.println("El programa ha terminado. Se espera que la experiencia hay sido de su agrado");
                    salirMenu = true;
                    break;
                default:
                    System.out.println("Ha ingresado incorrectamente, vuelva a intentarlo");
                    break;
            }
        } else{
            switch(eleccion){
                case 1: 
                    opcionCrearImage();
                    break;
                case 2:
                    opcionModificarImage();
                    break;
                case 3:
                    opcionVisualizarImage();
                    break;
                case 4:
                    opcionEliminarImage();
                    break;
                case 5:
                    System.out.println("El programa ha terminado. Se espera que la experiencia hay sido de su agrado");
                    salirMenu = true;
                    break;
                default:
                    System.out.println("Ha ingresado incorrectamente, vuelva a intentarlo");
                    break;
            }       
        }
    }
    
    private void opcionEliminarImage(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Lista de imagenes:");
        mostrarImagenes(getImagenes());
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Ingrese el número asociado de la imagen que quiere eliminar."
                + "\nIngrese 0 para volver");
        int eleccion = entrada.nextInt();    
        switch(eleccion){
            case 0:
                System.out.println("Has seleccionado la opción: Volver");
                break;
                
            default:
                if(eleccion <= getImagenes().size()){
                    ArrayList imagenesN = new ArrayList();
                    for(int i=0; i < getImagenes().size(); i++){
                        if(i != eleccion-1){
                            imagenesN.add(getImagenes().get(i));
                        }
                    }
                    setImagenes(imagenesN);
                    
                    break;
                    
                } else{
                    System.out.println("No existe una imagen " + eleccion);
                    break;
                }
        }
    }
    
    // crear imagen 
    private void opcionCrearImage(){
        System.out.println("### Manipulador de imágenes ###");
        System.out.println("Escoja su opción: ");
        System.out.println("1. Crear bitmap");
        System.out.println("2. Crear pixmap");
        System.out.println("3. Crear hexmap");
        System.out.println("4. Volver");
        Scanner entrada = new Scanner(System.in);
        int eleccion = entrada.nextInt();
        
        switch(eleccion){  
            case 1: 
                System.out.println("Ha seleccionado la opción: Crear Bitmap");
                crearImageBitmap();
                break;
                
            case 2:
                System.out.println("Ha seleccionado la opción: Crear Pixmap");
                crearImagePixmap();
                break;
            
            case 3:
                System.out.println("Ha seleccionado la opción: Crear Hexmap");
                crearImageHexmap();
                break;
                
            case 4: 
                System.out.println("Ha seleccionado la opción: Volver");
                break;
                
            default:
                System.out.println("Ha ingresado incorrectamente, vuelva a intentarlo");
                break;
        } 
    }
    
    // crear imagen bitmap
    private void crearImageBitmap(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un ancho: ");
        int ancho = entrada.nextInt();
        System.out.println("Ingrese un largo: ");
        int largo = entrada.nextInt();
        ArrayList pixeles = new ArrayList();

        for(int i=0; i< (ancho*largo); i++){
            System.out.println("Pixbit " + (i+1));
            System.out.println("Ingresar x: ");
            int coordX = entrada.nextInt();
            System.out.println("Ingresar y: ");
            int coordY = entrada.nextInt();
            System.out.println("Ingresar bit: ");
            int bit = entrada.nextInt();
            System.out.println("Ingresar profundidad: ");
            int profundidad = entrada.nextInt();

            // crear pixbit
            Pixbit_21090869_CastroVenegas pixel = new Pixbit_21090869_CastroVenegas(coordX, coordY, bit, profundidad);
            pixeles.add(pixel);    
        }
        
        // crear la imagen:
        Image_21090869_CastroVenegas imagen = new Image_21090869_CastroVenegas(ancho, largo, pixeles);
        
        System.out.println("La imagen Bitmap se creo correctamente.\n "
                + "Ingrese 1 para guardar la imagen y volver a Menu.\n"
                + "Ingrese 2 para volver a Menu sin guardarlo");
        
        int opcion = 0;
        while(opcion != 1 && opcion != 2){
            System.out.println("Ingrese opción: ");
            opcion = entrada.nextInt();
        }
        
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

    // crear imagen hexmap
    private void crearImageHexmap(){
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese un ancho: ");
        int ancho = entrada.nextInt();
        System.out.println("Ingrese un largo: ");
        int largo = entrada.nextInt();
        ArrayList pixeles = new ArrayList();
        
        for(int i=0; i< (ancho*largo); i++){
            System.out.println("Pixhex " + (i+1));
            System.out.println("Ingresar x: ");
            int coordX = entrada.nextInt();
            System.out.println("Ingresar y: ");
            int coordY = entrada.nextInt();
            System.out.println("Ingresar hex (#RRGGBB): ");
            entrada.nextLine();
            String hex = entrada.nextLine();
            System.out.println("Ingresar profundidad: ");
            int profundidad = entrada.nextInt();
            
            // crear pixhex
            Pixhex_21090869_CastroVenegas pixel = new Pixhex_21090869_CastroVenegas(coordX, coordY, hex, profundidad);
            pixeles.add(pixel); 
        }
        
        // crear la imagen:
        Image_21090869_CastroVenegas imagen = new Image_21090869_CastroVenegas(ancho, largo, pixeles);
        
        System.out.println("\nLa imagen Hexmap se creo correctamente. "
                + "\nIngrese 1 para guardar la imagen y volver a Menu."
                + "\nIngrese 2 para volver a Menu sin guardarlo");
        
        int opcion = 0;
        while(opcion != 1 && opcion != 2){
            System.out.println("Ingrese opción: ");
            opcion = entrada.nextInt();
        }
        
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
        
    // crear imagen pixmap
    private void crearImagePixmap(){
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese un ancho: ");
        int ancho = entrada.nextInt();
        System.out.println("Ingrese un largo: ");
        int largo = entrada.nextInt();
        ArrayList pixeles = new ArrayList();
        
        for(int i=0; i< (ancho*largo); i++){
            System.out.println("Pixrgb " + (i+1));
            System.out.println("Ingresar x: ");
            int coordX = entrada.nextInt();
            System.out.println("Ingresar y: ");
            int coordY = entrada.nextInt();
            System.out.println("Ingresar colorR: ");
            int colorR = entrada.nextInt();
            System.out.println("Ingresar colorG: ");
            int colorG = entrada.nextInt();
            System.out.println("Ingresar colorB: ");
            int colorB = entrada.nextInt();
            System.out.println("Ingresar profundidad: ");
            int profundidad = entrada.nextInt();
            
            // crear pixrgb
            Pixrgb_21090869_CastroVenegas pixel = new Pixrgb_21090869_CastroVenegas(coordX, coordY, colorR, colorG, colorB, profundidad);
            pixeles.add(pixel); 
        }
        
        // crear la imagen:
        Image_21090869_CastroVenegas imagen = new Image_21090869_CastroVenegas(ancho, largo, pixeles);
        
        System.out.println("La imagen Pixmap se creo correctamente.\n "
                + "Ingrese 1 para guardar la imagen y volver a Menu.\n"
                + "Ingrese 2 para volver a Menu sin guardarlo");
        
        int opcion = 0;
        while(opcion != 1 && opcion != 2){
            System.out.println("Ingrese opción: ");
            opcion = entrada.nextInt();
        }
        
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
 
    // mostrar la información de la lista de imagenes
    private void mostrarImagenes(ArrayList imagenes){
        for(int i=0; i < imagenes.size(); i++){
            Image_21090869_CastroVenegas image = (Image_21090869_CastroVenegas) imagenes.get(i);
            System.out.print(i+1 + ". ");
            image.mostrarImage();
            System.out.println();
        }
    }
    
    // encontrar imagen
    private Image_21090869_CastroVenegas buscarImagen(int valor, ArrayList imagenes){
        Image_21090869_CastroVenegas imagen = null;
        for(int i=0; i < imagenes.size(); i++){
            if( i == valor-1){
                imagen = (Image_21090869_CastroVenegas) imagenes.get(i);
            }
        }
        return imagen;
    }
    
    private void sobreescribirImagen(int valor, ArrayList imagenes, Image_21090869_CastroVenegas image){
        ArrayList imagenesNuevas = new ArrayList();
        for(int i=0; i < imagenes.size(); i++){
            if( i != valor-1){
                imagenesNuevas.add(imagenes.get(i));
            } else{
                imagenesNuevas.add(image);
            }
        }
        setImagenes(imagenesNuevas);
    }

    // visualizar imagenes
    private void opcionVisualizarImage() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Lista de imagenes:");
        mostrarImagenes(getImagenes());
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Ingrese el número asociado de la imagen que quiere visualizar."
                + "\nIngrese 0 para volver");
        int eleccion = entrada.nextInt();    
        switch(eleccion){
            case 0:
                System.out.println("Has seleccionado la opción: Volver");
                break;
                
            default:
                if(eleccion <= getImagenes().size()){
                    System.out.println("Has seleccionado la opción: Mostrar imagen " + eleccion);
                    System.out.println("--------------------------------------------------------");
                    Image_21090869_CastroVenegas imagen = buscarImagen(eleccion, getImagenes());
                    Image_21090869_CastroVenegas imageN = new Image_21090869_CastroVenegas(imagen.getAncho(), imagen.getLargo(), imagen.getPixeles());
                    sobreescribirImagen(eleccion, getImagenes(), imageN);
                    System.out.println(imagen.imageString());
                    System.out.println("\n--------------------------------------------------------");
                    System.out.println("Imagen visualizada correctamente");
                    break;
                    
                } else{
                    System.out.println("No existe una imagen " + eleccion);
                    break;
                }
        }
        
        
    }

    private void opcionModificarImage(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Lista de imagenes:");
        mostrarImagenes(getImagenes());
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Ingrese el número asociado de la imagen que quiere modificar."
                + "\nIngrese 0 para volver");
        int eleccion = entrada.nextInt();
        switch(eleccion){
            case 0:
                System.out.println("Has seleccionado la opción: Volver");
                break;
                
            default:
                if(eleccion <= getImagenes().size()){
                    System.out.println("Has seleccionado la opción: Mostrar imagen " + eleccion);
                    System.out.println("--------------------------------------------------------");
                    Image_21090869_CastroVenegas imagen = buscarImagen(eleccion, getImagenes());
                    mostrarModificaciones();
                    int opcion = entrada.nextInt();
                    aplicarModificaciones(eleccion, opcion, imagen);
                    break;
                    
                } else{
                    System.out.println("No existe una imagen " + eleccion);
                    break;
                }
    
        }
      
    }
    
    private void mostrarModificaciones(){
        System.out.println("### Modificador de imágenes ###");
        System.out.println("Escoja su opción: ");
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
        System.out.println("12. depthLayers");
        System.out.println("13. decompress");
        
    }
   
    private void aplicarModificaciones(int opcionImage, int opcion, Image_21090869_CastroVenegas image){
        Scanner entrada = new Scanner(System.in);
        Image_21090869_CastroVenegas imagenN;
        switch(opcion){
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
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.flipH();
                System.out.println("Se ha aplicado flipH a la imagen.\n");
                estadoImage(image, opcionImage);
                break;
                
            case 6:
                System.out.println("Has seleccionado flipV");
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.flipV();
                System.out.println("Se ha aplicado flipV a la imagen.\n");
                estadoImage(image, opcionImage);   
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
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.crop(x1, y1, x2, y2);
                System.out.println("Se ha aplicado crop a la imagen.\n");
                estadoImage(image, opcionImage); 
                break;
                
            case 8:
                System.out.println("Has seleccionado imgRGBToHex");
                if(!image.isPixmap()){
                    System.out.println("No puedes aplicar esta función a una imagen que no sea Pixmap");
                    break;
                }
                
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.imgRGBToHex();
                System.out.println("Se ha aplicado imgRGBToHex a la imagen.\n");
                estadoImage(image, opcionImage);
                break;
                
            case 9:
                System.out.println("Has seleccionado histogram");
                System.out.println("Se ha aplicado histogram a la imagen.\n");
                System.out.println("Histograma de la imagen: " + image.histogram());
                break;
                
            case 10:
                System.out.println("Has seleccionado rotate90");
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.rotate90();
                System.out.println("Se ha aplicado rotate90 a la imagen.\n");
                estadoImage(image, opcionImage); 
                break;
            
            case 11:
                System.out.println("Has seleccionado compressed");
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.compress();
                System.out.println("Se ha aplicado compress la imagen.\n");
                estadoImage(image, opcionImage); 
                break;
                
            case 12:
                System.out.println("Has seleccionado changePixel");
                System.out.println("Crear pixel a reemplazar");
                
                if(image.isCompressed()){
                    image.decompress();
                }
                
                if(image.isBitmap()){
                    System.out.println("Pixbit nuevo ");
                    System.out.println("Ingresar x: ");
                    int coordX = entrada.nextInt();
                    System.out.println("Ingresar y: ");
                    int coordY = entrada.nextInt();
                    System.out.println("Ingresar bit: ");
                    int bit = entrada.nextInt();
                    System.out.println("Ingresar profundidad: ");
                    int profundidad = entrada.nextInt();
                    Pixbit_21090869_CastroVenegas pixel = new Pixbit_21090869_CastroVenegas(coordX, coordY, bit, profundidad);
                    imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                    sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                    image.changePixel(pixel);
                }
                
                if(image.isPixmap()){
                    System.out.println("Pixrgb nuevo ");
                    System.out.println("Ingresar x: ");
                    int coordX = entrada.nextInt();
                    System.out.println("Ingresar y: ");
                    int coordY = entrada.nextInt();
                    System.out.println("Ingresar colorR: ");
                    int colorR = entrada.nextInt();
                    System.out.println("Ingresar colorG: ");
                    int colorG = entrada.nextInt();
                    System.out.println("Ingresar colorB: ");
                    int colorB = entrada.nextInt();
                    System.out.println("Ingresar profundidad: ");
                    int profundidad = entrada.nextInt();
                    Pixrgb_21090869_CastroVenegas pixel = new Pixrgb_21090869_CastroVenegas(coordX, coordY, colorR, colorG, colorB, profundidad);
                    imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                    sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                    image.changePixel(pixel);
                }
                
                if(image.isHexmap()){
                    System.out.println("Pixhex nuevo ");
                    System.out.println("Ingresar x: ");
                    int coordX = entrada.nextInt();
                    System.out.println("Ingresar y: ");
                    int coordY = entrada.nextInt();
                    System.out.println("Ingresar hex RRGGBB: ");
                    entrada.nextLine();
                    String hex = entrada.nextLine();
                    System.out.println("Ingresar profundidad: ");
                    int profundidad = entrada.nextInt();
                    Pixhex_21090869_CastroVenegas pixel = new Pixhex_21090869_CastroVenegas(coordX, coordY, hex, profundidad);
                    imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                    sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                    image.changePixel(pixel);
                }

                System.out.println("Se ha aplicado changePixel la imagen.\n");
                estadoImage(image, opcionImage); 
                break;
                
            case 13:
                System.out.println("Has seleccionado invertColorBit");
                if(!image.isBitmap()){
                    System.out.println("No puedes aplicar esta función a una imagen que no sea Bitmap");
                    break;
                }
                
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.invertColorBit();
                System.out.println("Se ha aplicado invertColorBit a la imagen.\n");
                estadoImage(image, opcionImage); 
                break;
                
            case 14:
                System.out.println("Has seleccionado invertColorRGB");
                if(!image.isPixmap()){
                    System.out.println("No puedes aplicar esta función a una imagen que no sea Pixmap");
                    break;
                }
                
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.invertColorRGB();
                System.out.println("Se ha aplicado invertColorRGB a la imagen.\n");
                estadoImage(image, opcionImage); 
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
                ArrayList imagenes  = image.detpLayers();
                System.out.println("Se ha aplicado depthLayers la imagen.\n");
                System.out.println("-----------------------------");
                System.out.println("Imagenes resultantes");
                for(int i=0; i< imagenes.size(); i++){
                    Image_21090869_CastroVenegas imagen = (Image_21090869_CastroVenegas) imagenes.get(i);
                    imagen.mostrarImage();
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
                imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                image.decompress();
                System.out.println("Se ha aplicado decompress la imagen.\n");
                estadoImage(image, opcionImage);
                break;
                
           
            default:
               System.out.println("Esa opción no existe");
               break;
       }
   }
   
    private void estadoImage(Image_21090869_CastroVenegas image, int opcionImage){
        Image_21090869_CastroVenegas imagenN;
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Ingrese 1 si desea guardar la imagen modificada.\n"
                        + "Ingrese 2 si desea sobreescribir la imagen original por la modificada.\n"
                        + "Ingrese 3 si desea no guardar la imagen");
        while(opcion != 1 && opcion != 2 && opcion != 3){
            System.out.println("Ingrese opción: ");
            opcion = entrada.nextInt();
            }
        switch(opcion){
            case 1: // guardar imagen y volver al menu
                System.out.println("\nLa imagen se ha guardado correctamente");
                listaImagenes.add(image);
                break;
            case 2:
                    System.out.println("\nLa imagen se ha sobreescribido correctamente");
                    imagenN =  new Image_21090869_CastroVenegas(image.getAncho(), image.getLargo(), image.getPixeles());
                    sobreescribirImagen(opcionImage, getImagenes(), imagenN);
                    sobreescribirImagen(opcionImage, getImagenes(), image);
                    break;
            case 3:
                    System.out.println("\nLa imagen no se ha guardado");
                    break;
        }
   }
    
}
        
        
