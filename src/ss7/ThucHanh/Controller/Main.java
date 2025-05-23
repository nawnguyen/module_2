package ss7.ThucHanh.Controller;


import ss7.ThucHanh.AnimalInterfaceEdible.animal.Animal;
import ss7.ThucHanh.AnimalInterfaceEdible.animal.Chicken;
import ss7.ThucHanh.AnimalInterfaceEdible.animal.Tiger;
import ss7.ThucHanh.AnimalInterfaceEdible.edible.Edible;
import ss7.ThucHanh.AnimalInterfaceEdible.fruit.Apple;
import ss7.ThucHanh.AnimalInterfaceEdible.fruit.Fruit;
import ss7.ThucHanh.AnimalInterfaceEdible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

