import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {
    Human human;

    @Before
    public void before(){
        human = new Human();
    }

    @Test
    public void canEat(){
        human.eat("banana");
        assertEquals("Ate banana!", human.eat("banana"));
    }

    @Test
    public void canBreathe(){
        human.breathe();
        assertEquals("Is breathing", human.breathe());
    }

    @Test
    public void canTalk(){
        human.talk();
        assertEquals("Is talking", human.talk());
    }

    @Test
    public void canWalk(){
        human.talk();
        assertEquals("Is talking", human.talk());
    }
}
