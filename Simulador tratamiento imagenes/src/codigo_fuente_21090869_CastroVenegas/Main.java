package codigo_fuente_21090869_CastroVenegas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * Contiene el programa que se ejecuta por main
 * 
 * Representación: Solo tiene el método para ejecutar el programa
 * 
 * Relaciones
 * 
 * Tiene relación de composición con Menu_21090869_CastroVenegas, siendo
 * esta la clase contenedora
 * 
 * @author aracely castro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Menu_21090869_CastroVenegas menu = new Menu_21090869_CastroVenegas();
        while(!menu.getSalirMenu()){
            menu.ejecutarMenu();
        
        }     
    } 
}
