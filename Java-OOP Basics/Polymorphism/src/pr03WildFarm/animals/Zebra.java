package pr03WildFarm.animals;

import pr03WildFarm.exceptions.NotEatingException;
import pr03WildFarm.foods.Food;

public class Zebra extends Mammal {

    public Zebra(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            throw new NotEatingException("Zebras are not eating that type of food!");
        }
        this.consumeFood(food.getQuantity());
    }
}
