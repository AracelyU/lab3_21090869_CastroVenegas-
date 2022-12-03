/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package codigo_fuente_21090869_CastroVenegas;

/**
 *
 * @author arace
 */
public interface InterfazPixel_21090869_CastroVenegas {

    /**
     * Descripción: Método para obtener el valor coordX de un pixel
     * @return devuelve un entero positivo
     * @author aracely castro
     */
    int getCoordX();

    /**
     * Descripción: Método para obtener el valor coordY de un pixel
     * @return devuelve un entero positivo
     * @author aracely castro
     */
    int getCoordY();

    /**
     * Descripción: Método para obtener el valor profundidad de un pixel
     * @return devuelve un entero positivo
     * @author aracely castro
     */
    int getProfundidad();

    /**
     * Descripción: Método para que verifica si tiene igual coordenada x e y
     * @param coordX: entero positivo
     * @param coordY: entero positivo
     * @return devuelve un boleano
     * @author aracely castro
     */
    boolean igualCoordXY(int coordX, int coordY);

    /**
     * Descripción: Método para que verifica si tiene igual profundidad
     * @param profundidad: entero positivo
     * @return devuelve un boleano
     * @author aracely castro
     */
    boolean igualProfundidad(int profundidad);

    /**
     * Descripción: Método para cambiar el valor coordX de un pixel
     * @param coordX: entero positivo
     * @author aracely castro
     */
    void setCoordX(int coordX);

    /**
     * Descripción: Método para cambiar el valor coordY de un pixel
     * @param coordY: entero positivo
     * @author aracely castro
     */
    void setCoordY(int coordY);

    /**
     * Descripción: Método para cambiar el valor profundidad de un pixel
     * @param profundidad: entero positivo
     * @author aracely castro
     */
    void setProfundidad(int profundidad);
    
}
