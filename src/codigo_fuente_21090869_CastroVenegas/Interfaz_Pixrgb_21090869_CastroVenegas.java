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
public interface Interfaz_Pixrgb_21090869_CastroVenegas {

    /**
     * Descripción: Método para elimina los pixrgb con mismo color rgb ingresado
     * @param colorR: entero entre 0 y 255
     * @param colorG: entero entre 0 y 255
     * @param colorB: entero entre 0 y 255
     * @param pixeles: lista de objetos
     * @return devuelve una lista de objetos
     * @author aracely castro
     */
    ArrayList eliminarColorRGB(ArrayList<Object> pixeles, int colorR, int colorG, int colorB);

    /**
     * Descripción: Método para elimina los pixrgb con misma profundidad a la ingresada
     * @param profundidad: entero positivo
     * @param pixeles: lista de objetos
     * @return devuelve una lista de objetos
     * @author aracely castro
     */
    ArrayList eliminarProfundidad(ArrayList<Object> pixeles, int profundidad);

    /**
     * Descripción: Método para obtener el valor color azul de un pixrgb
     * @return devuelve un entero entre 0 y 255
     * @author aracely castro
     */
    int getColorB();

    /**
     * Descripción: Método para obtener el valor color verde de un pixrgb
     * @return devuelve un entero entre 0 y 255
     * @author aracely castro
     */
    int getColorG();

    /**
     * Descripción: Método para obtener el valor color rojo de un pixrgb
     * @return devuelve un entero entre 0 y 255
     * @author aracely castro
     */
    int getColorR();

    /**
     * Descripción: Método para compara si se tiene el mismo color rgb ingresado
     * @param colorR: entero entre 0 y 255
     * @param colorG: entero entre 0 y 255
     * @param colorB: entero entre 0 y 255
     * @return devuelve un boleano
     * @author aracely castro
     */
    boolean igualColorRGB(int colorR, int colorG, int colorB);

    /**
     * Descripción: Método para invierte el color rgb recibido
     * @param colorR: entero entre 0 y 255
     * @param colorG: entero entre 0 y 255
     * @param colorB: entero entre 0 y 255
     * @author aracely castro
     */
    void invertRGB(int colorR, int colorG, int colorB);

    /**
     * Descripción: Método para imprimir el pixrgb
     * @author aracely castro
     * @return devuelve un String
     */
    String mostrarPixrgb();

    /**
     * Descripción: Método que crea un pixrgb blanco con profundidad ingresada
     * @param profundidad: entero positivo
     * @return devuelve un pixrgb
     * @author aracely castro
     */
    Pixrgb_21090869_CastroVenegas pixelBlancoRGB(int profundidad);

    /**
     * Descripción: Método para suma los pixrgb con mismo color rgb
     * @param colorR: entero entre 0 y 255
     * @param colorG: entero entre 0 y 255
     * @param colorB: entero entre 0 y 255
     * @param pixeles: lista de objetos
     * @return devuelve un entero
     * @author aracely castro
     */
    int sumaColorRGB(ArrayList<Object> pixeles, int colorR, int colorG, int colorB);
    
}
