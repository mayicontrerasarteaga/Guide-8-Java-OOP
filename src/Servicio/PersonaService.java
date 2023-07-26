/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;
/**
 *
 * @author Nezuko
 */
public class PersonaService {
    
    public Persona crearPersona() {
        
        //Instanciamos un objeto persona con sus atributos vacíos
        Persona personaCompleta = new Persona();
        
        //Pedimos al usuario que ingrese la información
        //que se alojará en el atributo por consola
        System.out.println("Ingrese el nombre de la persona");
        
        Scanner in = new Scanner(System.in);
        
        //Utilizamos el objeto para invocar al método SET
        //Y con el Scanner recibimos la información
        personaCompleta.setNombre(in.next());
        
        //Este método retorna un objeto persona con sus atributos
        //llenos de información
        return personaCompleta;
    }
    
    //Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para
    //mostrar sus atributos. Llama ese método desde el main.
    //Sólo utilizar métodos void para mostrar información.
    
    public void mostrarPersona(Persona personaCompleta) {
        
        System.out.println("Los datos de la persona son:");
        
        System.out.println("Nombre: " + personaCompleta.getNombre());
        System.out.println(personaCompleta.getApellido());
        System.out.println(personaCompleta.getEdad());
        System.out.println(personaCompleta.getPeso());
        System.out.println(personaCompleta.getEstatura());
        
    }
}
