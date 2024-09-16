/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Animal {

    int id;

    public Animal() {
    }

    Animal(int id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Animal other = (Animal) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        Animal a1 = new Animal(1001);
        Animal a2 = new Animal(1001);
        Animal a3 = new Animal();
        System.out.print(a1.equals(a2) + " ");
        System.out.println(a2.equals(a3));
    }

}
