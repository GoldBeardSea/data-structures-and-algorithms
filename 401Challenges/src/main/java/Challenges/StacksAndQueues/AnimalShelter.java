package Challenges.StacksAndQueues;

import java.util.Date;

public class AnimalShelter {
    protected Queue<Cat> catQueue;
    protected Queue<Dog> dogQueue;

    public AnimalShelter() {
        this.catQueue = new Queue<>();
        this.dogQueue = new Queue<>();
    }

    public void enqueue (Pet pet) {
        if (pet.getClass() == Cat.class) {
            pet.setDate(new Date());
            catQueue.enqueue((Cat) pet);
        } else {
            dogQueue.enqueue((Dog) pet);
            pet.setDate(new Date());

        }
    }

    public Pet dequeue (String preference) {
        if (catQueue.isEmpty()) {
            System.out.println("No Animals in this Shelter");
            return null;
        }
        if (!preference.equals("dog") && !preference.equals("cat")) {
            return null;
        }
        if (preference.equals("dog")) {
            return dogQueue.dequeue();
        }
        if (preference.equals("cat")) {
            return catQueue.dequeue();
        }
        return null;
    }

}