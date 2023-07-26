/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Nezuko
 */
public class Persona {
  
    
    //atributos:
    public String nombre;
    
    public String apellido;
    
    public Integer edad;
    
    public float peso;
    
    public float estatura;

    //constructor:
    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido, Integer edad, float peso, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    
    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    //métodos y funciones

    //toString muestra un mensaje predeterminado con todos los datos de los atributos
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
    
}
