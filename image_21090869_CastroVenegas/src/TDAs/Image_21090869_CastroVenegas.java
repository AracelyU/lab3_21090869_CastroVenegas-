package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author aracelyCastro
 */
public class Image_21090869_CastroVenegas{
    
    // definiendo las variables de una imagen
    private int ancho, largo;
    private ArrayList pixeles = new ArrayList<>(); // los pixeles son direcciones de cada objeto pixel
    
    // definiendo el constructor de una imagen
    public Image_21090869_CastroVenegas(int vAncho, int vLargo, ArrayList vPixeles){
        setAncho(vAncho);
        setLargo(vLargo);
        setPixeles(vPixeles);
       
    }
    
    // definiendo getters
    
    // retornar ancho
    public int getAncho(){
        return ancho;
    }
    
    // retornar largo
    public int getLargo(){
        return largo;
    }
    
    // retornar pixeles
    public ArrayList getPixeles(){
        return pixeles;
    }
    
    // definir setters
    
    // cambiar ancho
    public void setAncho(int ancho){
        if (ancho >= 0){
            this.ancho = ancho;
        }
    }
    
    // cambiar largo
    public void setLargo(int largo){
        if (largo >= 0){
            this.largo = largo;
        }
    }
    
    // cambiar pixeles
    public void setPixeles(ArrayList pixeles){
        this.pixeles = pixeles;
    }
    
    // mostrar información de la imagen
    public void mostrarImage(){
        System.out.println();
        System.out.print("Ancho: "+ this.ancho + " ");
        System.out.print("Largo: "+ this.largo + " ");
        System.out.print("Pixeles: " + this.pixeles);
        
        if (isBitmap()){
            for(int i=0; i < pixeles.size(); i++){
                Pixbit_21090869_CastroVenegas pixelBit = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
                pixelBit.mostrarPixbit();
            }
        }
        
        if (isHexmap()){
            for(int i=0; i < pixeles.size(); i++){
                Pixhex_21090869_CastroVenegas pixelHex = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
                pixelHex.mostrarPixhex();
            }
        }
        
        if (isPixmap()){
            for(int i=0; i < pixeles.size(); i++){
                Pixrgb_21090869_CastroVenegas pixelRGB = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
                pixelRGB.mostrarPixrgb();
            }
        }
        
        // listos los cambios de coordenadas, ahora se procede a ordenarlos
    }
    
    // comprobar si es Bitmap
    public boolean isBitmap(){
        Pixbit_21090869_CastroVenegas pixelBit = new Pixbit_21090869_CastroVenegas(0,0,0,0); // crear un objeto Pixbit para comparar
        for(int i=0; i < pixeles.size(); i++){ // mientras queden pixeles en la imagen
            Object pixelRecogido = pixeles.get(i); // para cada pixel
            if (pixelRecogido.getClass() != pixelBit.getClass()){ // si no es pixel de clase Pixbit retorna falso
                return false;
            }      
        }
        return true;
    }
    
    // comprobar si es Pixmap
    public boolean isPixmap(){
        Pixrgb_21090869_CastroVenegas pixelRGB = new Pixrgb_21090869_CastroVenegas(0,0,0,0,0,0); // crear un objeto Pixrgb para comparar
        for(int i=0; i < pixeles.size(); i++){ // mientras queden pixeles en la imagen
            Object pixelRecogido = pixeles.get(i); // para cada pixel
            if (pixelRecogido.getClass() != pixelRGB.getClass()){ // si no es pixel de clase Pixrgb retorna falso
                return false;
            }      
        }
        return true;
    }

    // comprobar si es Hexmap
    public boolean isHexmap(){
        Pixhex_21090869_CastroVenegas pixelHex = new Pixhex_21090869_CastroVenegas(0,0,"#FFFFFF",0); // crear un objeto Pixhex para comparar
        for(int i=0; i < pixeles.size(); i++){ // mientras queden pixeles en la imagen
            Object pixelRecogido = pixeles.get(i); // para cada pixel
            if (pixelRecogido.getClass() != pixelHex.getClass()){ // si no es pixel de clase Pixhex retorna falso
                return false;
            }      
        }
        return true;
    }     
    
    // metodo que retorna el objeto que tiene las coordenadas definidas
    private Object PixelCoordXY(ArrayList pixeles, int CoordX, int CoordY){
        for(int i = 0; i < pixeles.size(); i++){ 
            if (isBitmap()){
                Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(i);
                if (pixelRecogido.igualCoordXY(CoordX, CoordY)){
                    return pixelRecogido;
                }
            }

            if (isHexmap()){
                Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(i);
                if (pixelRecogido.igualCoordXY(CoordX, CoordY)){
                    return pixelRecogido;
                }
            }
            
            if (isPixmap()){
                Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
                if (pixelRecogido.igualCoordXY(CoordX, CoordY)){
                    return pixelRecogido;
                }
            }
        }
        return null;
    }
    
    // metodo para ordenar los pixeles de la imagen según coordenadas
    private void ordenarPixeles(){
        ArrayList pixelesTemporal = new ArrayList();
                
        for(int i = 0; i < this.ancho; i++){
            for(int j = 0; j < this.largo; j++){
                pixelesTemporal.add(PixelCoordXY(this.pixeles, i, j));               
            }
        }
        setPixeles(pixelesTemporal);

    }
    
    
    // método flipH
    public void flipH(){
        int h = 0;
        for(int i=0; i < this.ancho; i++){
            for(int j= this.largo-1; j >= 0; j--){       
                if (isBitmap()){
                    Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordY(j);  
                }
                
                if (isHexmap()){
                    Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordY(j);  
                }
                
                if (isPixmap()){
                    Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordY(j);  
                }
                
                h++;
            }
        }
        ordenarPixeles();
    }
    
    // método flipV
    public void flipV(){
        int h = 0;
        for(int i=this.ancho-1; i >= 0; i--){
            for(int j= 0; j < this.largo; j++){       
                if (isBitmap()){
                    Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordX(i);  
                }
                
                if (isHexmap()){
                    Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordX(i);  
                }
                
                if (isPixmap()){
                    Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordX(i);  
                }
                
                h++;
            }
        }
        ordenarPixeles();
    }
    
    // metodo para cambiar las coordenadas de una lista
    private void cambiarCoordXY(ArrayList pixeles, int ancho, int largo){
        int h = 0;
        for(int i=0; i < ancho; i++){
            for(int j= 0; j < largo; j++){
                
                if (isBitmap()){
                    Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordX(i);
                    pixelRecogido.setCoordY(j);
                }
                
                if (isHexmap()){
                    Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordX(i);  
                    pixelRecogido.setCoordY(j);
                }
                
                if (isPixmap()){
                    Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordX(i);
                    pixelRecogido.setCoordY(j);
                }
                h++;
            }
        }
        
        // cambiar los pixeles de la imagen a los nuevos pixeles
        setPixeles(pixeles);
    }
    
    // metodo crop
    public void crop(int X1, int Y1, int X2, int Y2){
        ArrayList pixelesTemporal = new ArrayList();
        int menorX = Math.min(X1, X2);
        int mayorX = Math.max(X1,X2);
        int menorY = Math.min(Y1, Y2);
        int mayorY = Math.max(Y1, Y2);
        int h = 0;
        for(int i = 0; i < this.ancho; i++){
            for(int j = 0; j < this.largo; j++){ 
               if (isBitmap()){
                    Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(h);
                    if(pixelRecogido.getCoordX() >= menorX && pixelRecogido.getCoordX() <= mayorX && 
                       pixelRecogido.getCoordY() >= menorY && pixelRecogido.getCoordY() <= mayorY){
                        pixelesTemporal.add(pixelRecogido);
                    }
                }
                
                if (isHexmap()){
                    Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(h);
                    if(pixelRecogido.getCoordX() >= menorX && pixelRecogido.getCoordX() <= mayorX && 
                       pixelRecogido.getCoordY() >= menorY && pixelRecogido.getCoordY() <= mayorY){
                        pixelesTemporal.add(pixelRecogido);
                    }
                }
                
                if (isPixmap()){
                    Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(h);
                    if(pixelRecogido.getCoordX() >= menorX && pixelRecogido.getCoordX() <= mayorX && 
                       pixelRecogido.getCoordY() >= menorY && pixelRecogido.getCoordY() <= mayorY){
                        pixelesTemporal.add(pixelRecogido);
                    }
                }
                h++;
            }
        }
        
        // modificar la coordenada ancho
        setAncho(mayorX-menorX+1);
        setLargo(mayorY-menorY+1);        
        
        // termina de filtrar los pixeles, se reordenan
        cambiarCoordXY(pixelesTemporal, this.ancho, this.largo);
    }
    
    // método imgRGBToHex
   //public String colorRGBToHex(int colorR, int colorG, int colorB){
        
    private String NumToString(int numero){
        
        if(numero < 10){
            return Integer.toString(numero);
        } else if (numero == 10){
            return "A";
        } else if (numero == 11){
            return "B";
        } else if (numero == 12){
            return "C";
        } else if (numero == 13){
            return "D";
        } else if (numero == 14){
            return "E";
        } else if (numero == 15){
            return "F";
        }
        return null;
    
    }
    
    public void imgRGBToHex(){
        ArrayList pixelesNuevos = new ArrayList();
        for(int i=0; i < pixeles.size(); i++){
            Pixrgb_21090869_CastroVenegas p = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
            String nuevoHex = (String) "#" + NumToString(p.getColorR()/16) + NumToString(p.getColorR()%16) + 
                                             NumToString(p.getColorG()/16) + NumToString(p.getColorG()%16) + 
                                             NumToString(p.getColorB()/16) + NumToString(p.getColorB()%16);
            
            Pixhex_21090869_CastroVenegas pH = new Pixhex_21090869_CastroVenegas(p.getCoordX(), p.getCoordY(), nuevoHex, p.getProfundidad());
            pixelesNuevos.add(pH);
        }
        
        setPixeles(pixelesNuevos);
    
    }   
    
    
    // metodo histograma
    public ArrayList histogram(){
        ArrayList histograma = new ArrayList();
        ArrayList pixelesTemporal = getPixeles();  
        while(!pixelesTemporal.isEmpty()){
            ArrayList subHistograma = new ArrayList();
            if(isBitmap()){
              Pixbit_21090869_CastroVenegas pixelInicial = (Pixbit_21090869_CastroVenegas) pixelesTemporal.get(0); 
              int colorBit = pixelInicial.getBit();
              int suma = pixelInicial.sumaColorBit(pixelesTemporal, colorBit);
              ArrayList pixelesNuevos = pixelInicial.eliminarColorBit(pixelesTemporal, colorBit);
              // añadir datos a subHistograma
              subHistograma.add(colorBit);
              subHistograma.add(suma);
              pixelesTemporal = pixelesNuevos;
            } else if(isHexmap()){
                Pixhex_21090869_CastroVenegas pixelInicial = (Pixhex_21090869_CastroVenegas) pixelesTemporal.get(0); 
                String colorHex = pixelInicial.getHex();
                int suma = pixelInicial.sumaColorHex(pixelesTemporal, colorHex);
                ArrayList pixelesNuevos = pixelInicial.eliminarColorHex(pixelesTemporal, colorHex);
                // añadir datos a subHistograma
                subHistograma.add(colorHex);
                subHistograma.add(suma);
                pixelesTemporal = pixelesNuevos;           
            } else if(isPixmap()){  
                ArrayList colorRGB = new ArrayList();
                Pixrgb_21090869_CastroVenegas pixelInicial = (Pixrgb_21090869_CastroVenegas) pixelesTemporal.get(0); 
                int colorR = pixelInicial.getColorR();
                int colorG = pixelInicial.getColorG();
                int colorB = pixelInicial.getColorB();
                int suma = pixelInicial.sumaColorRGB(pixelesTemporal, colorR, colorG, colorB);
                ArrayList pixelesNuevos = pixelInicial.eliminarColorRGB(pixelesTemporal, colorR, colorG, colorB);
                // añadir datos a subHistograma
                colorRGB.add(colorR);
                colorRGB.add(colorG);
                colorRGB.add(colorB);
                subHistograma.add(colorRGB);
                subHistograma.add(suma);
                pixelesTemporal = pixelesNuevos;              
            } 
            // añadir datos al histograma 
            histograma.add(subHistograma);     
        } 
        return histograma;
    }
    
    // método para obtener el color más repetido de un histograma
    private int mayorBit(ArrayList histograma){
        int cantidad = -1;
        int valorH = -1;
        for(int i=0; i < histograma.size(); i++){
            ArrayList dato = (ArrayList) histograma.get(i);
            int cantidadH = (Integer) dato.get(1);
            if (cantidadH > cantidad){
                valorH = (Integer) dato.get(0);
                cantidad = cantidadH;
            }
        }
        return valorH;
    }
    
    // método compress(){}
    public void compress(){
        ArrayList histograma = histogram();
        ArrayList pixelesNuevos = new ArrayList();
        ArrayList pixeles = getPixeles();
    
        if(isBitmap()){
            int bitRepetido = mayorBit(histograma);
            for(int i=0; i< pixeles.size(); i++){
                Pixbit_21090869_CastroVenegas pixel = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
                if(pixel.getBit() == bitRepetido){
                    Pixbit_comprimido_21090869_CastroVenegas pixelC;
                    pixelC = new Pixbit_comprimido_21090869_CastroVenegas(pixel.getCoordX(), pixel.getCoordY(), bitRepetido, pixel.getProfundidad());
                    pixelesNuevos.add(pixelC);
                } else{
                    pixelesNuevos.add(pixel);                    
                }
            }
            setPixeles(pixelesNuevos);
            
        
        }
    
    }
    
    
    
    // método rotate90
    public void rotate90(){
        int h = 0;
        for(int i=this.ancho-1; i >= 0; i--){
            for(int j=0; j < this.largo; j++){
                if (isBitmap()){
                    Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordY(i);
                    pixelRecogido.setCoordX(j);
                }
                
                if (isHexmap()){
                    Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordX(i); 
                    pixelRecogido.setCoordX(j);
                }
                
                if (isPixmap()){
                    Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordX(i);  
                    pixelRecogido.setCoordX(j);
                }
                
                h++;    
            
            }
        }
        
        // cambiados las coordenadas se procede a modificar el largo y el ancho antes de ordenar
        int aux = getAncho();
        setAncho(getLargo());
        setLargo(aux);
        ordenarPixeles();
    }
    
    // metodo changePixel
    public void changePixel(Object pixel){
        ArrayList pixelesNuevos = new ArrayList();    
        if (isBitmap()){
            Pixbit_21090869_CastroVenegas pixelB =  (Pixbit_21090869_CastroVenegas) pixeles.get(0);
            if (pixel.getClass() == pixelB.getClass()){ // si es pixbit
                Pixbit_21090869_CastroVenegas pixelBit = (Pixbit_21090869_CastroVenegas) pixel;
                for(int i = 0; i < pixeles.size(); i++){
                    Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(i);
                    if (pixelRecogido.igualCoordXY(pixelBit.getCoordX(), pixelBit.getCoordY())){
                        pixelesNuevos.add(pixelBit);
                    } else{
                        pixelesNuevos.add(pixelRecogido);
                    }  
                }
                
                // modificar pixeles
                setPixeles(pixelesNuevos);
            }
        }

        if (isHexmap()){
            Pixhex_21090869_CastroVenegas pixelH =  (Pixhex_21090869_CastroVenegas) pixeles.get(0);
            if (pixel.getClass() == pixelH.getClass()){ // si es pixhex
                Pixhex_21090869_CastroVenegas pixelHex = (Pixhex_21090869_CastroVenegas) pixel;
                for(int i = 0; i < pixeles.size(); i++){
                    Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(i);
                    if (pixelRecogido.igualCoordXY(pixelHex.getCoordX(), pixelHex.getCoordY())){
                        pixelesNuevos.add(pixelHex);
                    } else{
                        pixelesNuevos.add(pixelRecogido);
                    }  
                }
                
                // modificar pixeles
                setPixeles(pixelesNuevos);
            }
        }
            
        if (isPixmap()){
            Pixrgb_21090869_CastroVenegas pixelPixmap =  (Pixrgb_21090869_CastroVenegas) pixeles.get(0);
            if (pixel.getClass() == pixelPixmap.getClass()){ // si es pixrgb
                Pixrgb_21090869_CastroVenegas pixelRGB = (Pixrgb_21090869_CastroVenegas) pixel;
                for(int i = 0; i < pixeles.size(); i++){
                    Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
                    if (pixelRecogido.igualCoordXY(pixelRGB.getCoordX(), pixelRGB.getCoordY())){
                        pixelesNuevos.add(pixelRGB);
                    } else{
                        pixelesNuevos.add(pixelRecogido);
                    }  
                }
                // modificar pixeles
                setPixeles(pixelesNuevos);
            }
        }
    }
    
    // método invertColorBit, OBS: verificar que la imagen es Bitmap antes de permitirse usar este método
    public void inverColorBit(){
        for(int i=0; i < this.pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixelRecogido = (Pixbit_21090869_CastroVenegas) this.pixeles.get(i);
            pixelRecogido.invertBit(pixelRecogido.getBit());
        }
    }
    
    // método invertColorBit, OBS: verificar que la imagen es Pixmap antes de permitirse usar este método
    public void inverColorRGB(){
        for(int i=0; i < this.pixeles.size(); i++){
            Pixrgb_21090869_CastroVenegas pixelRecogido = (Pixrgb_21090869_CastroVenegas) this.pixeles.get(i);
            pixelRecogido.invertRGB(pixelRecogido.getColorR(), pixelRecogido.getColorG(), pixelRecogido.getColorB());
        }
    }
    
    
    // metodo para recuperar las profundidades de los pixeles de la imagen
    private ArrayList getProfundidades(ArrayList pixeles){
        ArrayList profundidades = new ArrayList<>();
        while(!pixeles.isEmpty()){
        
            if(isBitmap()){
                Pixbit_21090869_CastroVenegas pixelRecogido = (Pixbit_21090869_CastroVenegas) pixeles.get(0);
                profundidades.add(pixelRecogido.getProfundidad());
                ArrayList pixelesNuevos = pixelRecogido.eliminarProfundidad(pixeles, pixelRecogido.getProfundidad());
                pixeles = pixelesNuevos;
            }
        
            if(isHexmap()){
                Pixhex_21090869_CastroVenegas pixelRecogido = (Pixhex_21090869_CastroVenegas) pixeles.get(0);
                profundidades.add(pixelRecogido.getProfundidad());
                ArrayList pixelesNuevos = pixelRecogido.eliminarProfundidad(pixeles, pixelRecogido.getProfundidad());
                pixeles = pixelesNuevos;  
            
            }
            
            if(isPixmap()){
                Pixrgb_21090869_CastroVenegas pixelRecogido = (Pixrgb_21090869_CastroVenegas) pixeles.get(0);
                profundidades.add(pixelRecogido.getProfundidad());
                ArrayList pixelesNuevos = pixelRecogido.eliminarProfundidad(pixeles, pixelRecogido.getProfundidad());
                pixeles = pixelesNuevos;  
            }
        }
        return profundidades;
    }
    
    // metodo depthLayers
    public ArrayList detpLayers(){
            ArrayList<Image_21090869_CastroVenegas> listaImagenes = new ArrayList<>();
            ArrayList profundidades = getProfundidades(getPixeles());
            System.out.println("\n" + profundidades.size());
            
            for(int i=0; i < profundidades.size(); i++){
                ArrayList pixelesNuevos = new ArrayList();
                for(int j=0; j < getPixeles().size(); j++){
                    
                    if(isBitmap()){
                        Pixbit_21090869_CastroVenegas pixel = (Pixbit_21090869_CastroVenegas) getPixeles().get(j);
                        if(pixel.igualProfundidad( (Integer) profundidades.get(i))){
                            pixelesNuevos.add(pixel);
                        } else{
                            Pixbit_21090869_CastroVenegas pixelR = pixel.pixelBlancoBit((Integer) profundidades.get(i));
                            pixelesNuevos.add(pixelR);
                        }             
                    }
                    
                    if(isHexmap()){
                        Pixhex_21090869_CastroVenegas pixel = (Pixhex_21090869_CastroVenegas) getPixeles().get(j);
                        if(pixel.igualProfundidad( (Integer) profundidades.get(i))){
                            pixelesNuevos.add(pixel);
                        } else{
                            Pixhex_21090869_CastroVenegas pixelR = pixel.pixelBlancoHex((Integer) profundidades.get(i));
                            pixelesNuevos.add(pixelR);
                        }   
                    }
                    
                    if(isPixmap()){
                        Pixrgb_21090869_CastroVenegas pixel = (Pixrgb_21090869_CastroVenegas) getPixeles().get(j);
                        if(pixel.igualProfundidad( (Integer) profundidades.get(i))){
                            pixelesNuevos.add(pixel);
                        } else{
                            Pixrgb_21090869_CastroVenegas pixelR = pixel.pixelBlancoRGB((Integer) profundidades.get(i));
                            pixelesNuevos.add(pixelR);
                        }  
                    }
                }
                Image_21090869_CastroVenegas imagen = new Image_21090869_CastroVenegas(getAncho(), getLargo(), pixelesNuevos);
                listaImagenes.add(imagen);
            }
            return listaImagenes;
    }

}
