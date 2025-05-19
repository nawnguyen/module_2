package ss7.ThucHanh.AnimalInterfaceEdible.animal;

import ss7.ThucHanh.AnimalInterfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}

