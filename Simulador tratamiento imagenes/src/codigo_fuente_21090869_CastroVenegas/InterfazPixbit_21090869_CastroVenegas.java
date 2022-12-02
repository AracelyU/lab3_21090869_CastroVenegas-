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
public interface InterfazPixbit_21090869_CastroVenegas {

    /**
     * Descripción: Método que elimina los pixbit con igual bit al ingresado
     * @param bit: entero 0 | 1
     * @param pixeles: lista de objetos
     * @return devuelve una lista de objetos
     * @author aracely castro
     */
    ArrayList eliminarColorBit(ArrayList<Object> pixeles, int bit);

    /**
     * Descripción: Método que elimina los pixbit con igual profundidad ingresada
     * @param profundidad: entero positivo
     * @param pixeles: lista de objetos
     * @return devuelve una lista de objetos
     * @author aracely castro
     */
    ArrayList eliminarProfundidad(ArrayList<Object> pixeles, int profundidad);

    /**
     * Descripción: Método para obtener el valor bit de un pixbit
     * @return devuelve un entero positivo
     * @author aracely castro
     */
    int getBit();

    /**
     * Descripción: Método que ve si se tiene igual bit al ingresado
     * @param bit: entero 0 | 1
     * @param pixel: pixbit
     * @return devuelve un boleano
     * @author aracely castro
     */
    boolean igualColorBit(Pixbit_21090869_CastroVenegas pixel, int bit);

    /**
     * Descripción: Método para cambiar el valor bit de un pixbit por su opuesto
     * @param bit: entero 0 | 1
     * @author aracely castro
     */
    void invertBit(int bit);

    /**
     * Descripción: Método para imprimir el pixbits
     * @author aracely castro
     * @return devuelve un string
     */
    String mostrarPixbit();

    /**
     * Descripción: Método que crea un pixbit blanco con profundidad ingresada
     * @param profundidad: entero positivo
     * @return devuelve un pixbit
     * @author aracely castro
     */
    Pixbit_21090869_CastroVenegas pixelBlancoBit(int profundidad);

    /**
     * Descripción: Método para cambiar el valor bit de un pixbit
     * @param bit: entero 0 | 1
     * @author aracely castro
     */
    void setBit(int bit);

    /**
     * Descripción: Método que suma los pixbit con igual bit al ingresado
     * @param bit: entero 0 | 1
     * @param pixeles: lista de objetos
     * @return devuelve un entero
     * @author aracely castro
     */
    int sumaColorBit(ArrayList<Object> pixeles, int bit);
    
}
