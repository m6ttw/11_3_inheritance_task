import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal();
    }

    @Test
    public void canEat(){
        animal.eat("banana");
        assertEquals("Ate banana!", animal.eat("banana"));
    }

    @Test
    public void canBreathe(){
        animal.breathe();
        assertEquals("Is breathing", animal.breathe());
    }
}
