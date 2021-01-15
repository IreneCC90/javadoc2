/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDoc;

/**
 *
 * @author cheir
 */
/**
 * 
 * @author cheir
 */
public class Persona {
    int edad;
    char sexo;
    String nombre;
 /**
 * Constructor por defecto
 */
    Persona (){
        edad = 10;
        sexo= ' ';
        nombre= "";
    }
/**
 * 
 * @param n
 * @param e
 * @param s 
 */
     Persona (String n, int e, char s ){
        edad = e;
        sexo= s;
        nombre= n;
    }
}
