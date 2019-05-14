/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

/**
 *
 * @author Dismaelectric
 */
public class Animal {
    private String nombre_comun;
    private String habitat;
    private String familia;
    private String sexo;

    public Animal(String nombre_comun, String habitat, String familia, String sexo) {
        this.nombre_comun = nombre_comun;
        this.habitat = habitat;
        this.familia = familia;
        this.sexo = sexo;
    }
   
    public String Comer(){
        return "Esta comiendo...";
    
    }
    public String Dormir(){
        return "Nuestro amigo se fue a dormir";
        
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
