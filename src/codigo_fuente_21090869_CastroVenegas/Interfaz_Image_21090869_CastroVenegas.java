/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

import java.util.ArrayList;

/**
 *
 * @author arace
 */
public interface Interfaz_Image_21090869_CastroVenegas {

    /**
     *  Descripción: Carga una imagen 2 x 3 Bitmap de prueba
     *  @author aracely castro
     */
    void cargarBitmap();

    /**
     *  Descripción: Carga una imagen 4x4 Hexmap de prueba
     *  @author aracely castro
     */
    void cargarHexmap();

    /**
     *  Descripción: Carga una imagen 6 x 2 Pixmap de prueba
     *  @author aracely castro
     */
    void cargarPixmap();

    /**
     * Descripción: Método que cambia un pixel de la imagen
     * @param pixel: objeto
     * @author aracely castro
     */
    void changePixel(Object pixel);

    /*
    /**
     * Descripción: Método que comprime la imagen
     * @author aracely castro
     */
    void compress();

    /**
     *  Descripción: Crea una imagen bitmap
     *  @author aracely castro
     */
    void crearBitmap();

    /**
     *  Descripción: Crea una imagen hexmap
     *  @author aracely castro
     */
    void crearHexmap();

    /**
     * Descripción: Método para crear un pixbit
     * @param tipo: mensaje String para crear el pixbit
     * @return devuelve un pixbit
     */
    Pixbit_21090869_CastroVenegas crearPixbit(String tipo);

    /**
     * Descripción: Método para crear un pixhex
     * @param tipo: mensaje String para crear el pixhex
     * @return devuelve un pixhex
     */
    Pixhex_21090869_CastroVenegas crearPixhex(String tipo);

    /**
     *  Descripción: Crea una imagen pixmap
     *  @author aracely castro
     */
    void crearPixmap();

    /**
     * Descripción: Método para crear un pixrgb
     * @param tipo: mensaje String para crear el pixrgb
     * @return devuelve un pixrgb
     */
    Pixrgb_21090869_CastroVenegas crearPixrgb(String tipo);

    /**
     * Descripción: Método que aplica recorte a la imagen
     * @param X1: entero positivo
     * @param Y1: entero positivo
     * @param X2: entero positivo
     * @param Y2: entero positivo
     * @author aracely castro
     */
    void crop(int X1, int Y1, int X2, int Y2);

    /**
     * Descripción: Método que descomprime la imagen
     * @author aracely castro
     */
    void decompress();

    /**
     * Descripción: Método que obtiene una lista de imagenes separadas por profundidad
     * @return devuelve una lista de imagenes
     * @author aracely castro
     */
    ArrayList detpLayers();

    /**
     * Descripción: Método que invierte la imagen horizontamente
     * @author aracely castro
     */
    void flipH();

    /**
     * Descripción: Método que invierte la imagen verticalmente
     * @author aracely castro
     */
    void flipV();

    /**
     * Descripción: Método para obtener el valor ancho de la imagen
     * @return devuelve un valor entero positivo
     * @author aracely castro
     */
    int getAncho();

    /**
     * Descripción: Método para obtener el valor largo de la imagen
     * @return devuelve un valor entero positivo
     * @author aracely castro
     */
    int getLargo();

    /**
     * Descripción: Método para obtener la lista de pixeles de la imagen
     * @return devuelve una lista
     * @author aracely castro
     */
    ArrayList getPixeles();

    /**
     * Descripción: Método que obtiene el histograma de la imagen
     * @return devuelve una lista de sublistas [Color | Cantidad]
     * @author aracely castro
     */
    ArrayList histogram();

    /**
     * Descripción: Método que obtiene el string de la imagen
     * @return devuelve un string
     * @author aracely castro
     */
    String imageString();

    /**
     * Descripción: Método que obtiene el string de la imagen
     * @return devuelve un string
     * @author aracely castro
     */
    String imageStringComprimido();

    /**
     * Descripción: Método que cambia la imagen pixmap a hexmap
     * @author aracely castro
     */
    void imgRGBToHex();

    /**
     * Descripción: Método que invierte los bits de una imagen bitmap
     * @author aracely castro
     */
    void invertColorBit();

    /**
     * Descripción: Método que invierte los colores rgb de una imagen pixmap
     * @author aracely castro
     */
    void invertColorRGB();

    /**
     * Descripción: Método para determinar si una imagen es bitmap
     * @return devuelve boleano
     * @author aracely castro
     */
    boolean isBitmap();

    /**
     * Descripción: Método para determinar si una imagen fue comprimida
     * @return devuelve boleano
     * @author aracely castro
     */
    boolean isCompressed();

    /**
     * Descripción: Método para determinar si una imagen es hexmap
     * @return devuelve boleano
     * @author aracely castro
     */
    boolean isHexmap();

    /**
     * Descripción: Método para determinar si una imagen es pixmap
     * @return devuelve boleano
     * @author aracely castro
     */
    boolean isPixmap();

    /**
     * Descripción: Método para mostrar el histograma
     * @param histograma: Lista de sublistas que contienen enteros positivos
     * @return devuelve un String
     * @author aracely castro
     */
    String mostrarHistogram(ArrayList<ArrayList> histograma);

    /**
     * Descripción: Método que rota la imagen 90° a la derecha
     * @author aracely castro
     */
    void rotate90();
    
}
