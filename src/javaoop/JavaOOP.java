/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaoop;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Nezuko
 */
public class JavaOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Instanciación utilizando el constructor vacío
        Persona primeraPersona = new Persona();

        //Instanciación utilizando el constructor por parámetro
        Persona segundaPersona = new Persona("Nezuko");

        primeraPersona.setNombre("Tanjiro");

        segundaPersona.getNombre();

        primeraPersona.setApellido("Kamado");

        segundaPersona.setApellido("Kamado");

        //CLASE SERVICIO
        
        //Debemos instanciar un objeto del tipo Servicio
        //para acceder a sus métodos
        PersonaService persServicio = new PersonaService();

        //Alojamos el retorno del método en un objeto tipo Persona
        Persona terceraPersona = persServicio.crearPersona();

        //Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para
        //mostrar sus atributos. Llama ese método desde el main.
        persServicio.mostrarPersona(terceraPersona);
        
        //toString
        
        System.out.println(primeraPersona.toString());
    }

}
