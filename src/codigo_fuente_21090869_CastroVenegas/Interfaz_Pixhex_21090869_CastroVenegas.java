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
public interface Interfaz_Pixhex_21090869_CastroVenegas {

    /**
     * Descripción: Método que elimina los pixhex con string hex igual al ingresado
     * @param hex: string
     * @param pixeles: lista de objetos
     * @return devuelve una lista de objetos
     * @author aracely castro
     */
    ArrayList eliminarColorHex(ArrayList<Object> pixeles, String hex);

    /**
     * Descripción: Método que elimina los pixhex con profundidad igual al ingresado
     * @param profundidad: entero positivo
     * @param pixeles: lista de objetos
     * @return devuelve una lista de objetos
     * @author aracely castro
     */
    ArrayList eliminarProfundidad(ArrayList<Object> pixeles, int profundidad);

    /**
     * Descripción: Método para obtener el string hex de un pixhex
     * @return devuelve un string
     * @author aracely castro
     */
    String getHex();

    /**
     * Descripción: Método para verificar si tienen mismo string hex
     * @param hex: string
     * @param pixel: pixhex
     * @return devuelve un boleano
     * @author aracely castro
     */
    boolean igualColorHex(Pixhex_21090869_CastroVenegas pixel, String hex);

    /**
     * Descripción: Método para imprimir el pixhex
     * @author aracely castro
     * @return devuelve un String
     */
    String mostrarPixhex();

    /**
     * Descripción: Método que crea un pixhex blanco con profundidad ingresada
     * @param profundidad: entero positivo
     * @return devuelve un pixhex
     * @author aracely castro
     */
    Pixhex_21090869_CastroVenegas pixelBlancoHex(int profundidad);

    /**
     * Descripción: Método que suma los pixhex con string hex igual al ingresado
     * @param hex: string
     * @param pixeles: lista de objetos
     * @return devuelve un entero positivo
     * @author aracely castro
     */
    int sumaColorHex(ArrayList<Object> pixeles, String hex);
    
}
