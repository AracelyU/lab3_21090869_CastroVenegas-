package TDAs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author arace
 */
public class Main {
    /**
     * Descripción: Método que llama al menú que ejecuta el programa
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        Menu menu = new Menu();
        while(!menu.getSalirMenu()){
            menu.EjecutarMenu();
        
        }   
    }
}
