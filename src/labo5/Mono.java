/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

/**
 *
 * @author Mabel
 */
public class Mono extends Animal implements MetoAnimal{

    private String nombre;

    public Mono(String nombre, String nombre_comun, String habitat, String familia, String sexo) {
        super(nombre_comun, habitat, familia, sexo);
        this.nombre = nombre;
    }
    
    public String gritar(){
        return "UHH UHH UHHH UHHH";
        
    }
    @Override
    public String Moverse() {
        return "El"+" "+super.getNombre_comun()+" "+"se balancea en las ramas del árbol";
    }

    @Override
    public String Jugar() {
        return "El"+" "+super.getNombre_comun()+" "+"empieza a seguir a otros";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
