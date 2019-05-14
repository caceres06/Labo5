/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;
import java.util.Scanner;
/**
 *
 * @author Dismaelectric
 */
public class Labo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Puma p= new Puma("Puma","Selva densa y cañones","Felidae","Macho","Peter");
       Loro l = new Loro("Loro","Selva húmeda tropical","Psittacoidea","Hembra","Lorena");
       Mono m= new Mono("Mono","Selva húmeda tropical","Cebidae","Macho","Maurice");
       Scanner key = new Scanner(System.in);
        boolean flag = true;
        int a;
        System.out.println("BIENVENIDOS AL ZOOLOGICO DE EL SALVADOR");
        do{
            mostrarMenu();
            a= key.nextInt();
            key.nextLine();
            int b,c,d;
            switch(a){
                case 1:
                    System.out.println("Nombre:"+p.getNombre());
                    System.out.println("Nombre comun:"+p.getNombre_comun());
                    System.out.println("Habitat"+p.getHabitat());
                    System.out.println("Famili:"+p.getNombre());
                    System.out.println("Sexo:"+p.getSexo());
                    System.out.println("-----¿Que desea que el animal realice?-----");
                    System.out.println("1.Comer");
                    System.out.println("2.Dormir");
                    System.out.println("3.Rugir");
                    System.out.println("4.Jugar");
                    System.out.println("5.Moverse");
                    b= key.nextInt();
                    key.nextLine();
                        switch(b){
                            case 1:
                                p.Comer();
                                break;
                            case 2:
                                p.Dormir();
                                break;
                            case 3:
                                p.rugir();
                                break;
                            case 4:
                                p.Jugar();
                                break;
                            case 5:
                                p.Moverse();
                                break;
                        }
                        break;
                case 2:
                    System.out.println("Nombre:"+l.getNombre());
                    System.out.println("Nombre comun:"+l.getNombre_comun());
                    System.out.println("Habitat"+l.getHabitat());
                    System.out.println("Famili:"+l.getNombre());
                    System.out.println("Sexo:"+l.getSexo());
                    System.out.println("-----¿Que desea que el animal realice?-----");
                    System.out.println("1.Comer");
                    System.out.println("2.Dormir");
                    System.out.println("3.Hablar");
                    System.out.println("4.Jugar");
                    System.out.println("5.Moverse");
                    System.out.println("6. Volver");
                    c= key.nextInt();
                        switch(c){
                            case 1:
                                l.Comer();
                                break;
                            case 2:
                                l.Dormir();
                                break;
                            case 3:
                                l.Hablar();
                                break;
                            case 4:
                                l.Jugar();
                                break;
                            case 5:
                                l.Moverse();
                                break;
                        }
                        break;
                case 3:
                    System.out.println("Nombre:"+m.getNombre());
                    System.out.println("Nombre comun:"+m.getNombre_comun());
                    System.out.println("Habitat"+m.getHabitat());
                    System.out.println("Famili:"+m.getNombre());
                    System.out.println("Sexo:"+m.getSexo());
                    System.out.println("-----¿Que desea que el animal realice?-----");
                    System.out.println("1.Comer");
                    System.out.println("2.Dormir");
                    System.out.println("3.Gritar");
                    System.out.println("4.Jugar");
                    System.out.println("5.Moverse");
                    d= key.nextInt();
                    key.nextLine();
                        switch(d){
                            case 1:
                                m.Comer();
                                break;
                            case 2:
                                m.Dormir();
                                break;
                            case 3:
                                m.gritar();
                                break;
                            case 4:
                                m.Jugar();
                                break;
                            case 5:
                                m.Moverse();
                                break;
                        }
                        break;
                case 4:
                    System.out.println("----GRACIAS POR SU VISITA----");
                    flag= false;
                    break;
            } 
            
        } while(flag);
    }
   
    public static void mostrarMenu(){
        System.out.println("-----¿Que animal desea visitar?-----");
        System.out.println("1.Puma");
        System.out.println("2.Loro");
        System.out.println("3. Mono");
        System.out.println("4.Salir");
    }
    
}
