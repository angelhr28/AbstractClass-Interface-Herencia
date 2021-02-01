/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myveterinary;


public class Cat extends Animal implements AnimalInterface {

    @Override
    public void animalSound() {
        System.out.println("El gato " + this.getNameAnimal() +" maulla: Miao-Miao");
    }

    @Override
    public void favoriteFood() {
        System.out.println("El gato " + this.getNameAnimal() +" come: WishCash");
    }

    @Override
    public void myEdad() {
        System.out.println("La edad de " + this.getNameAnimal() + "es de "+ edad);    
    }
    
}
