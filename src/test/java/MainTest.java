import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main = new Main();

    @Test
    void sum(){
        assertEquals(3, main.sum(2, 1));
    }

    @Test
    void minus(){
        assertEquals(1, main.minus(3, 2));
    }

    @Test
    void multiplu(){
        assertEquals(4, main.multiplu(1, 4));
    }

    @Test
    void del(){
        assertEquals(2, main.del(4, 2));
    }
}