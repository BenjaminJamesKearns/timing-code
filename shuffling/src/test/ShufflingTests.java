import org.junit.*;

public class ShufflingTests {

    private Shuffling shuffling;
    @Before
    public void setUp() {
        shuffling = new Shuffling();
    }

    @Test
    public void test() {
        shuffling.shuffle();
    }
}
