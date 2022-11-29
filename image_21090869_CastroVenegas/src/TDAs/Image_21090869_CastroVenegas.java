package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.ArrayList;

/**
 * Clase para definir el objeto imagen
 * @author aracely castro
 */
public class Image_21090869_CastroVenegas{
    
    // atributos de una imagen
    private int ancho, largo;
    private ArrayList<Object> pixeles; 
    
    /**
    * Descripción: Constructor de la imagen
    * @param ancho: entero positivo. 
    * @param largo: entero positivo
    * @param pixeles: lista con objetos
    * @author aracely castro
    *
    */
    // definiendo el constructor de una imagen
    public Image_21090869_CastroVenegas(int ancho, int largo, ArrayList pixeles){
        this.pixeles = new ArrayList<>();
        setAncho(ancho);
        setLargo(largo);
        setPixeles(pixeles);
       
    }
    
    /**
    * Descripción: Método para obtener el valor ancho de la imagen
    * @return devuelve un valor entero positivo
    * @author aracely castro
    */ 
    public int getAncho(){
        return ancho;
    }
    
    /**
    * Descripción: Método para obtener el valor largo de la imagen
    * @return devuelve un valor entero positivo
    * @author aracely castro
    */ 
    public int getLargo(){
        return largo;
    }
    
    /**
    * Descripción: Método para obtener la lista de pixeles de la imagen
    * @return devuelve una lista
    * @author aracely castro
    */ 
    public ArrayList getPixeles(){
        return pixeles;
    }
    
    /**
    * Descripción: Método para cambiar el valor ancho de la imagen
    * @param ancho: entero positivo
    * @author aracely castro
    */      
    private void setAncho(int ancho){
        if (ancho >= 0){
            this.ancho = ancho;
        }
    }
    
    /**
    * Descripción: Método para cambiar el valor largo de la imagen
    * @param largo: entero positivo
    * @author aracely castro
    */ 
    private void setLargo(int largo){
        if (largo >= 0){
            this.largo = largo;
        }
    }
    
    /**
    * Descripción: Método para cambiar los pixeles de la imagen
    * @param pixeles: lista de objetos
    * @author aracely castro
    */ 
    private void setPixeles(ArrayList pixeles){
        this.pixeles = pixeles;
    }
   
    
    /**
    * Descripción: Método para imprimir en ancho, largo y pixeles de la imagen
    * @author aracely castro
    */ 
    public void mostrarImage(){
        System.out.print("Ancho: "+ this.ancho + " ");
        System.out.print("Largo: "+ this.largo + " ");
        System.out.print("Pixeles: ");
        
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

        if(isBitmapComprimido()){
            Pixbit_21090869_CastroVenegas pB = new Pixbit_21090869_CastroVenegas(0,0,0,0);
            for(int i=0; i < pixeles.size(); i++){
                Object pixelRecogido = pixeles.get(i);
                if(pixelRecogido.getClass() == pB.getClass()){
                    Pixbit_21090869_CastroVenegas pixelBit = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
                    pixelBit.mostrarPixbit();
                } else{
                    Pixbit_comprimido_21090869_CastroVenegas pixelBitC = (Pixbit_comprimido_21090869_CastroVenegas) pixeles.get(i);
                    pixelBitC.mostrarPixbitC();
                }
            }
        }
        
        if(isHexmapComprimido()){
            Pixhex_21090869_CastroVenegas pH = new Pixhex_21090869_CastroVenegas(0,0,"#FFFFFF",0);
            for(int i=0; i < pixeles.size(); i++){
                Object pixelRecogido = pixeles.get(i);
                if(pixelRecogido.getClass() == pH.getClass()){
                    Pixhex_21090869_CastroVenegas pixelHex = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
                    pixelHex.mostrarPixhex();
                } else{
                    Pixhex_comprimido_21090869_CastroVenegas pixelHexC = (Pixhex_comprimido_21090869_CastroVenegas) pixeles.get(i);
                    pixelHexC.mostrarPixhexC();
                }
            }
        }
        
        if(isPixmapComprimido()){
            Pixrgb_21090869_CastroVenegas pRGB = new Pixrgb_21090869_CastroVenegas(0,0,0,0,0,0);
            for(int i=0; i < pixeles.size(); i++){
                Object pixelRecogido = pixeles.get(i);
                if(pixelRecogido.getClass() == pRGB.getClass()){
                    Pixrgb_21090869_CastroVenegas pixelRGB = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
                    pixelRGB.mostrarPixrgb();
                } else{
                    Pixrgb_comprimido_21090869_CastroVenegas pixelRGBC = (Pixrgb_comprimido_21090869_CastroVenegas) pixeles.get(i);
                    pixelRGBC.mostrarPixrgbC();
                }
            }
        }  
    }
     
    /**
    * Descripción: Método para determinar si una imagen es bitmap
    * @return devuelve boleano
    * @author aracely castro
    */ 
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
    
    /**
    * Descripción: Método para determinar si una imagen es pixmap
    * @return devuelve boleano
    * @author aracely castro
    */ 
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

    /**
    * Descripción: Método para determinar si una imagen es hexmap
    * @return devuelve boleano
    * @author aracely castro
    */ 
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
    
    /**
    * Descripción: Método para determinar si una imagen es bitmap comprimido
    * @return devuelve boleano
    * @author aracely castro
    */ 
    public boolean isBitmapComprimido(){
        Pixbit_comprimido_21090869_CastroVenegas pixelBitC = new Pixbit_comprimido_21090869_CastroVenegas(0,0,0,0); // crear un objeto Pixbit comprimido para comparar
        for(int i=0; i < pixeles.size(); i++){ // mientras queden pixeles en la imagen
            Object pixelRecogido = pixeles.get(i); // para cada pixel
            if (pixelRecogido.getClass() == pixelBitC.getClass()){ // si no es pixel de clase Pixrgb retorna falso
                return true;
            }      
        }
        return false;
    }
  
    /**
    * Descripción: Método para determinar si una imagen es hexmap comprimido
    * @return devuelve boleano
    * @author aracely castro
    */ 
    public boolean isHexmapComprimido(){
        Pixhex_comprimido_21090869_CastroVenegas pixelHexC = new Pixhex_comprimido_21090869_CastroVenegas(0,0,"#FFFFFF",0); // crear un objeto Pixhex comprimido para comparar
        for(int i=0; i < pixeles.size(); i++){ // mientras queden pixeles en la imagen
            Object pixelRecogido = pixeles.get(i); // para cada pixel
            if (pixelRecogido.getClass() == pixelHexC.getClass()){ // si no es pixel de clase Pixhex retorna falso
                return true;
            }      
        }
        return false;
    }   
    
    /**
    * Descripción: Método para determinar si una imagen es pixmap comprimido
    * @return devuelve boleano
    * @author aracely castro
    */ 
    public boolean isPixmapComprimido(){
        ArrayList listaRGB = new ArrayList();
        listaRGB.add(0);
        listaRGB.add(0);
        listaRGB.add(0);
        Pixrgb_comprimido_21090869_CastroVenegas pixelRGBC = new Pixrgb_comprimido_21090869_CastroVenegas(0,0,listaRGB,0); // crear un objeto Pixhex comprimido para comparar
        for(int i=0; i < pixeles.size(); i++){ // mientras queden pixeles en la imagen
            Object pixelRecogido = pixeles.get(i); // para cada pixel
            if (pixelRecogido.getClass() == pixelRGBC.getClass()){ // si no es pixel de clase Pixhex retorna falso
                return true;
            }      
        }
        return false;
    }  
    
    
    /**
    * Descripción: Método para determinar si una imagen fue comprimida
    * @return devuelve boleano
    * @author aracely castro
    */ 
    public boolean isCompressed(){
        return (isBitmapComprimido() || isHexmapComprimido() || isPixmapComprimido());
    }
     
    /**
    * Descripción: Método que devuelve el pixel con igual coordenadas x e y
    * @param pixeles: lista de objetos
    * @param coordX: entero positivo
    * @param coordY: entero positivo
    * @return devuelve un objeto
    * @author aracely castro
    */ 
    private Object PixelCoordXY(ArrayList pixeles, int coordX, int coordY){
        for(int i = 0; i < pixeles.size(); i++){ 
            if (isBitmap()){
                Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(i);
                if (pixelRecogido.igualCoordXY(coordX, coordY)){
                    return pixelRecogido;
                }
            }

            if (isHexmap()){
                Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(i);
                if (pixelRecogido.igualCoordXY(coordX, coordY)){
                    return pixelRecogido;
                }
            }
            
            if (isPixmap()){
                Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
                if (pixelRecogido.igualCoordXY(coordX, coordY)){
                    return pixelRecogido;
                }
            }
        }
        return null;
    }
    
    /**
    * Descripción: Método que devuelve los pixeles ordenados por sus coordenadas x e y
    * @author aracely castro
    */ 
    private void ordenarPixeles(){
        ArrayList pixelesTemporal = new ArrayList();       
        for(int i = 0; i < this.ancho; i++){
            for(int j = 0; j < this.largo; j++){
                pixelesTemporal.add(PixelCoordXY(this.pixeles, i, j));               
            }
        }
        setPixeles(pixelesTemporal);
    }
    
    
    /**
    * Descripción: Método que invierte la imagen horizontamente
    * @author aracely castro
    */ 
    public void flipH(){
        if(isCompressed()){
            decompress();
        }
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
    
    /**
    * Descripción: Método que invierte la imagen verticalmente
    * @author aracely castro
    */ 
    public void flipV(){
        if(isCompressed()){
            decompress();
        }
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
    
    /**
    * Descripción: Método que cambiar las coordenadas de los pixeles desde (0,0) a (ancho-1, largo-1)
    * @param pixeles: lista de objetos
    * @param ancho: entero positivo
    * @param largo: entero positivo
    * @author aracely castro
    */ 
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
    
    /**
    * Descripción: Método que aplica recorte a la imagen
    * @param X1: entero positivo
    * @param Y1: entero positivo
    * @param X2: entero positivo
    * @param Y2: entero positivo
    * @author aracely castro
    */ 
    public void crop(int X1, int Y1, int X2, int Y2){
        if(isCompressed()){
            decompress();
        }
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
        cambiarCoordXY(pixelesTemporal, getAncho(), getLargo());
    }
    
    /**
    * Descripción: Método que entrega el equivalente en número a valor hexadecimal
    * @param numero: entero positivo
    * @return devuelve un string
    * @author aracely castro
    */    
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
    
    /**
    * Descripción: Método que cambia la imagen pixmap a hexmap
    * @author aracely castro
    */ 
    public void imgRGBToHex(){
        if(isCompressed()){
            decompress();
        }
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
    
    /**
    * Descripción: Método que obtiene el histograma de la imagen
    * @return devuelve una lista de sublistas [Color | Cantidad]
    * @author aracely castro
    */ 
    public ArrayList histogram(){
        if(isCompressed()){
            decompress();
        }
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
    
    /**
    * Descripción: Método que rota la imagen 90° a la derecha
    * @author aracely castro
    */ 
    public void rotate90(){
        if(isCompressed()){
            decompress();
        }
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
                    pixelRecogido.setCoordY(i); 
                    pixelRecogido.setCoordX(j);  
                }
                
                if (isPixmap()){
                    Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(h);
                    pixelRecogido.setCoordY(i);  
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
    
    
    /**
    * Descripción: Método obtiene el bit más repetido
    * @param histograma: lista con colores y su cantidad
    * @return devuelve un entero 0 | 1
    * @author aracely castro
    */ 
    public int mayorBit(ArrayList histograma){
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
    
    /**
    * Descripción: Método que obtiene el color hex más repetido
    * @param histograma: lista con colores y su cantidad
    * @return devuelve un string
    * @author aracely castro
    */ 
    public String mayorHex(ArrayList histograma){
        int cantidad = -1;
        String valorH = "";
        for(int i=0; i < histograma.size(); i++){
            ArrayList dato = (ArrayList) histograma.get(i);
            int cantidadH = (Integer) dato.get(1);
            if (cantidadH > cantidad){
                valorH = (String) dato.get(0);
                cantidad = cantidadH;
            }
        }
        return valorH;
    }
    
    /**
    * Descripción: Método que obtiene el color rgb más repetido
    * @param histograma: lista con colores y su cantidad
    * @return devuelve una lista con tres valores enteros positivos
    * @author aracely castro
    */ 
    public ArrayList mayorRGB(ArrayList histograma){
        int cantidad = -1;
        ArrayList valorH = new ArrayList();
        for(int i=0; i < histograma.size(); i++){
            ArrayList dato = (ArrayList) histograma.get(i);
            int cantidadH = (Integer) dato.get(1);
            if (cantidadH > cantidad){
                valorH = (ArrayList) dato.get(0);
                cantidad = cantidadH;
            }
        }
        return valorH;
    }
    

    /**
    * Descripción: Método que comprime la imagen
    * @author aracely castro
    */ 
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
        }
        
        if(isHexmap()){
            String hexRepetido = mayorHex(histograma);
            for(int i=0; i< pixeles.size(); i++){
                Pixhex_21090869_CastroVenegas pixel = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
                if(pixel.getHex() == hexRepetido){
                    Pixhex_comprimido_21090869_CastroVenegas pixelC;
                    pixelC = new Pixhex_comprimido_21090869_CastroVenegas(pixel.getCoordX(), pixel.getCoordY(), hexRepetido, pixel.getProfundidad());
                    pixelesNuevos.add(pixelC);
                } else{
                    pixelesNuevos.add(pixel);                    
                }
            }
        } 
        
        if(isPixmap()){
            ArrayList rgbRepetido = mayorRGB(histograma);
            for(int i=0; i< pixeles.size(); i++){
                Pixrgb_21090869_CastroVenegas pixel = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
                if(pixel.igualColorRGB((int) rgbRepetido.get(0), (int) rgbRepetido.get(1), (int) rgbRepetido.get(2))){
                    Pixrgb_comprimido_21090869_CastroVenegas pixelC;
                    pixelC = new Pixrgb_comprimido_21090869_CastroVenegas(pixel.getCoordX(), pixel.getCoordY(), rgbRepetido, pixel.getProfundidad());
                    pixelesNuevos.add(pixelC);
                } else{
                    pixelesNuevos.add(pixel);                    
                }
            }
        } 
        setPixeles(pixelesNuevos);
    }
    
    /**
    * Descripción: Método que cambia un pixel de la imagen
    * @param pixel: objeto
    * @author aracely castro
    */ 
    public void changePixel(Object pixel){
        if(isCompressed()){
            decompress();
        }
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
    
    /**
    * Descripción: Método que invierte los bits de una imagen bitmap
    * @author aracely castro
    */ 
    public void invertColorBit(){
        if(isCompressed()){
            decompress();
        }
        for(int i=0; i < this.pixeles.size(); i++){
            Pixbit_21090869_CastroVenegas pixelRecogido = (Pixbit_21090869_CastroVenegas) this.pixeles.get(i);
            pixelRecogido.invertBit(pixelRecogido.getBit());
        }
    }
    
    /**
    * Descripción: Método que invierte los colores rgb de una imagen pixmap
    * @author aracely castro
    */ 
    public void invertColorRGB(){
        if(isCompressed()){
            decompress();
        }
        for(int i=0; i < this.pixeles.size(); i++){
            Pixrgb_21090869_CastroVenegas pixelRecogido = (Pixrgb_21090869_CastroVenegas) this.pixeles.get(i);
            pixelRecogido.invertRGB(pixelRecogido.getColorR(), pixelRecogido.getColorG(), pixelRecogido.getColorB());
        }
    }
    
    /**
    * Descripción: Método que obtiene el string de la imagen
    * @return devuelve un string
    * @author aracely castro
    */ 
    public String imageString(){
        if(isCompressed()){
            decompress();
        }
        String cadena = "";
        int h = 0;
        for(int i=0; i < this.ancho; i++){
            for(int j = 0; j < this.largo; j++){       
                if (isBitmap()){
                    Pixbit_21090869_CastroVenegas pixelRecogido =  (Pixbit_21090869_CastroVenegas) pixeles.get(h);
                    String bit = String.valueOf( (int) pixelRecogido.getBit() );
                    cadena += bit + "\t";
                }
                
                if (isHexmap()){
                    Pixhex_21090869_CastroVenegas pixelRecogido =  (Pixhex_21090869_CastroVenegas) pixeles.get(h);
                    cadena += pixelRecogido.getHex() + "\t";
                }
                
                if (isPixmap()){
                    Pixrgb_21090869_CastroVenegas pixelRecogido =  (Pixrgb_21090869_CastroVenegas) pixeles.get(h);
                    String colorR = String.valueOf( (int) pixelRecogido.getColorR() );
                    String colorG = String.valueOf( (int) pixelRecogido.getColorG() );
                    String colorB = String.valueOf( (int) pixelRecogido.getColorB() );
                    cadena += "[" + colorR + "," + colorG + "," + colorB + "]" + "\t";
                }
                
                h++;
            }
            cadena += "\n"; 
        }
        return cadena;
    }
    
    /**
    * Descripción: Método que obtiene todas las profundidades de la imagen
    * @param pixeles: lista de objetos
    * @return devuelve una lista de valores enteros positivos
    * @author aracely castro
    */ 
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
    
    /**
    * Descripción: Método que obtiene una lista de imagenes separadas por profundidad
    * @return devuelve una lista de imagenes
    * @author aracely castro
    */ 
    public ArrayList detpLayers(){
        if(isCompressed()){
            decompress();
        }
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
    
    /**
    * Descripción: Método que descomprime la imagen
    * @author aracely castro
    */ 
    public void decompress(){
        ArrayList pixelesNuevos = new ArrayList();
        ArrayList pixeles = getPixeles();
        
        if(isBitmapComprimido()){
            Pixbit_21090869_CastroVenegas pB = new Pixbit_21090869_CastroVenegas(0,0,0,0);
            for(int i=0; i < pixeles.size(); i++){
                Object pixelRecogido = pixeles.get(i);
                if(pixelRecogido.getClass() != pB.getClass()){
                    Pixbit_comprimido_21090869_CastroVenegas pBit = (Pixbit_comprimido_21090869_CastroVenegas) pixeles.get(i);
                    Pixbit_21090869_CastroVenegas nuevoPixelBit;
                    nuevoPixelBit = new Pixbit_21090869_CastroVenegas(pBit.getCoordX(), pBit.getCoordY(), pBit.getBitGuardado(), pBit.getProfundidad());
                    pixelesNuevos.add(nuevoPixelBit);
                } else{
                    Pixbit_21090869_CastroVenegas pixelBit = (Pixbit_21090869_CastroVenegas) pixeles.get(i);
                    pixelesNuevos.add(pixelBit);
                }
            }
        }
        
        // hexmap comprimido
        if(isHexmapComprimido()){
            Pixhex_21090869_CastroVenegas pH = new Pixhex_21090869_CastroVenegas(0,0,"#FFFFFF",0);
            for(int i=0; i < pixeles.size(); i++){
                Object pixelRecogido = pixeles.get(i);
                if(pixelRecogido.getClass() != pH.getClass()){
                    Pixhex_comprimido_21090869_CastroVenegas pHex = (Pixhex_comprimido_21090869_CastroVenegas) pixeles.get(i);
                    Pixhex_21090869_CastroVenegas nuevoPixelHex;
                    nuevoPixelHex = new Pixhex_21090869_CastroVenegas(pHex.getCoordX(), pHex.getCoordY(), pHex.getHexGuardado(), pHex.getProfundidad());
                    pixelesNuevos.add(nuevoPixelHex);
                } else{
                    Pixhex_21090869_CastroVenegas pixelHex = (Pixhex_21090869_CastroVenegas) pixeles.get(i);
                    pixelesNuevos.add(pixelHex);
                }
            }
        }
        
        // pixmap comprimido
        if(isPixmapComprimido()){
            Pixrgb_21090869_CastroVenegas pRGB = new Pixrgb_21090869_CastroVenegas(0,0,0,0,0,0);
            for(int i=0; i < pixeles.size(); i++){
                Object pixelRecogido = pixeles.get(i);
                if(pixelRecogido.getClass() != pRGB.getClass()){
                    Pixrgb_comprimido_21090869_CastroVenegas pixRGB = (Pixrgb_comprimido_21090869_CastroVenegas) pixeles.get(i);                      
                    Pixrgb_21090869_CastroVenegas nuevoPixelRGB;
                    nuevoPixelRGB = new Pixrgb_21090869_CastroVenegas(pixRGB.getCoordX(), pixRGB.getCoordY(), pixRGB.getColorRGuardado(), pixRGB.getColorGGuardado(), pixRGB.getColorBGuardado(), pixRGB.getProfundidad());
                    pixelesNuevos.add(nuevoPixelRGB);
                } else{
                    Pixrgb_21090869_CastroVenegas pixelRGB = (Pixrgb_21090869_CastroVenegas) pixeles.get(i);
                    pixelesNuevos.add(pixelRGB);
                }
            }
        }
        setPixeles(pixelesNuevos);
    }

}
