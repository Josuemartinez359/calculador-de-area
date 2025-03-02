/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Viviana Talaigua
 */
public class area {
    private int ancho;
    private int largo;
    
    public area(int ancho, int largo){
        this.ancho = ancho;
        this.largo = largo;
        
    };
    
    
    public int calcularArea(){
        return this.ancho * this.largo;
    }
}
