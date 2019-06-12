package Challenges.StacksAndQueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    public AnimalShelter animalShelter;

    @Before
    public void initialized() {
        animalShelter = new AnimalShelter();
    }

    @Test
    public void test_enqueueCat() {
        Cat molly = new Cat("Molly");
        animalShelter.enqueue(molly);
        assertEquals("this should be molly", "Molly", animalShelter.catQueue.peek().toString());
        assertTrue(animalShelter.dogQueue.isEmpty());
    }

    @Test
    public void test_enqueueDog() {
        Dog cocoa = new Dog("Cocoa");
        animalShelter.enqueue(cocoa);
        assertEquals("this should be cocoa", "Cocoa", animalShelter.dogQueue.peek().toString());
        assertTrue(animalShelter.catQueue.isEmpty());
    }

    @Test
    public void test_dequeueDog() {
        Cat molly = new Cat("Molly");
        animalShelter.enqueue(molly);
        Dog cocoa = new Dog("Cocoa");
        animalShelter.enqueue(cocoa);
        Cat charlie = new Cat("Charlie");
        animalShelter.enqueue(charlie);
        Dog doggo = new Dog("Doggo");
        animalShelter.enqueue(doggo);
        assertEquals("this should be Cocoa", "Cocoa", animalShelter.dequeue("dog").toString());
    }

    @Test
    public void test_dequeueCat() {
        Cat molly = new Cat("Molly");
        animalShelter.enqueue(molly);
        Dog cocoa = new Dog("Cocoa");
        animalShelter.enqueue(cocoa);
        Cat charlie = new Cat("Charlie");
        animalShelter.enqueue(charlie);
        Dog doggo = new Dog("Doggo");
        animalShelter.enqueue(doggo);
        assertEquals("this should be Molly", "Molly", animalShelter.dequeue("cat").toString());
    }

    @Test
    public void test_dequeueNull() {
        Cat molly = new Cat("Molly");
        animalShelter.enqueue(molly);
        Dog cocoa = new Dog("Cocoa");
        animalShelter.enqueue(cocoa);
        Cat charlie = new Cat("Charlie");
        animalShelter.enqueue(charlie);
        Dog doggo = new Dog("Doggo");
        animalShelter.enqueue(doggo);
        assertNull(animalShelter.dequeue("Banana"));
    }
}