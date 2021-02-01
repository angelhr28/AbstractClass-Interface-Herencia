/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myveterinary;


public class Dog extends Animal implements AnimalInterface{

    @Override
    public void animalSound() {
        System.out.println("El perro " + this.getNameAnimal() +" ladra: Wao-Wao");
    }

    @Override
    public void favoriteFood() {
        System.out.println("El perro " + this.getNameAnimal() +" come: Rico Can");
    }

    @Override
    public void myEdad() {
        System.out.println("La edad de " + this.getNameAnimal() + "es de "+ edad);    
    }
    
}
