import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal;

    @Before
    public void before(){
        mammal = new Mammal();
    }

    @Test
    public void canEat(){
        mammal.eat("banana");
        assertEquals("Ate banana!", mammal.eat("banana"));
    }

    @Test
    public void canBreathe(){
        mammal.breathe();
        assertEquals("Is breathing", mammal.breathe());
    }

    @Test
    public void canTalk(){
        mammal.talk();
        assertEquals("Is talking", mammal.talk());
    }
}
