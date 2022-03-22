/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package mx.unam.fi.mpoo;

import controlador.Sumadora;    //IMPORTACIÓN DESDE OTRO PAQUETE

/**
 *Clase principal.
 * @author alumno
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Clase empaquetada.");
        Sumadora sumadora=new Sumadora();//CREAR TIPO DE DATO Sumadora
        double suma=sumadora.sumar(3, 4);
        System.out.println(suma);
        /*PARA LA CREACIÓN DEL ARCHIVO JAR
        1. CLICK DERECHO SOBRE EL NOMBRE DEL PROYECTO.
        2. SEGUIR ESTA LÍNEA DE COMANDOS: PROPERTIES/BUILD/PACKAGING/OK
        3. CLICK EN CLEAN AND BUILD PROJECT.
        EN LA TERMINAL APARECERÁ LA UBICACIÓN DEL ARCHIVO
        */
    }
    
}
