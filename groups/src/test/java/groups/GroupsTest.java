import static org.junit.Assert.*;
import org.junit.*;

public class GroupsTest {

  @Test
  public void selectNumberOfGroups() {
    Groups group = new Groups();
    String outcome = group.create(3);
    assertEquals(outcome, "3 groups created");
  }
};
