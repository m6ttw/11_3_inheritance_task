import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {
    Chimpanzee chimpanzee;

    @Before
    public void before(){
        chimpanzee = new Chimpanzee();
    }

    @Test
    public void canEat(){
        chimpanzee.eat("banana");
        assertEquals("Ate banana!", chimpanzee.eat("banana"));
    }

    @Test
    public void canBreathe(){
        chimpanzee.breathe();
        assertEquals("Is breathing", chimpanzee.breathe());
    }

    @Test
    public void canTalk(){
        chimpanzee.talk();
        assertEquals("Is talking", chimpanzee.talk());
    }

    @Test
    public void canWalk(){
        chimpanzee.walk();
        assertEquals("Is walking", chimpanzee.walk());
    }
}
