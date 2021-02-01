/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myveterinary;


public class MyVeterinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("---------------------------------PERRO--------------------------------------");
        Dog myDog = new Dog(); // Creo objeto Dog
        myDog.setNameAnimal("Kuro"); // Getter
        myDog.setRazaAnimal("Chiwawa"); // Setter
        myDog.animalSound(); // Metodo Abstracto
        myDog.favoriteFood();// Metodo Abstracto
        myDog.myEdad(); // Metodo Abstract INTERFACE
        myDog.sleep(); // Metodo NO Abstracto
        
        System.out.println("-------------------------------GATO----------------------------------------");

        Cat myCat = new Cat(); // Creo objeto Dog
        myCat.setNameAnimal("Shiro"); // Getter
        myCat.setRazaAnimal("Persa"); // Setter
        myCat.animalSound(); // Metodo Abstracto
        myCat.favoriteFood();// Metodo Abstracto
        myCat.myEdad(); // Metodo Abstract INTERFACE
        myCat.sleep(); // Metodo NO Abstracto
        
    }
    
}
