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
public class Loro extends Animal implements MetoAnimal{
    
    private String nombre;

    public Loro(String nombre, String nombre_comun, String habitat, String familia, String sexo) {
        super(nombre_comun, habitat, familia, sexo);
        this.nombre = nombre;
    }
    
    public String Hablar(){
        return "Lorito quiere galleta,raa";
        
    }


    @Override
    public String Moverse() {
        return "El"+" "+super.getNombre_comun()+" "+"camina sobre la rama";
    }

    @Override
    public String Jugar() {
        return "El"+" "+super.getNombre_comun()+" "+"intenta picar tu dedo";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
