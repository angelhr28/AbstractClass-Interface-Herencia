/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myveterinary;


// Clase abstracta
abstract class Animal {
     
  // Atributos
  private String nameAnimal; 

  private String razaAnimal; 
  
  // Contructor
  public Animal () {
     super(); 
     nameAnimal = "Sin nombre";
     razaAnimal = "Sin raza";
  }

  // Metodos getter y setter
  public void setNameAnimal (String nameAnimal) { this.nameAnimal = nameAnimal;   }

  public String getNameAnimal () { return nameAnimal;   }

  public void setRazaAnimal (String razaAnimal) { this.razaAnimal = razaAnimal;   }

  public String getRazaAnimal () { return razaAnimal;   }

  // metodos abstractos 
  public abstract void animalSound();
  public abstract void favoriteFood();

  // metodo no abstracto
  public void sleep() {
    System.out.println("" + nameAnimal + "es de raza " + razaAnimal + " y esta durmiendo Zzz");
  } 
}
