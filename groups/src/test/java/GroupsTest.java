import static org.junit.Assert.*;
import org.junit.*;

public class GroupsTest {

  private Groups group;
  @Before
  public void setUp() {
    group = new Groups();
  }

  @Test
  public void selectNumberOfGroups() {
    String outcome = group.create(3);
    assertEquals(outcome, "3 groups created");
  }

  @Test
  public void createGroups() {
    group.create(3);
    int outcome = group.numberOfGroups();
    assertEquals(outcome, 3);
  }

  @Test
  public void CheckGroupsAreCorrectSize() {
    group.create(4);
    Integer[][] outcome = new Integer[4][4];
    outcome[0] = group.accessGroups(0);
    outcome[1] = group.accessGroups(1);
    outcome[2] = group.accessGroups(2);
    outcome[3] = group.accessGroups(3);
    assertEquals(outcome[0].length, 4);
    assertEquals(outcome[1].length, 4);
    assertEquals(outcome[2].length, 4);
    assertEquals(outcome[3].length, 3);

  }

  @Test
  public void CheckGroupsContainValidNumbers() {
    group.create(1);
    Integer[] outcome = new Integer[15];
    outcome = group.accessGroups(0);
    Integer answer = 0;
    Integer correctAnswer = 120;
    for (int i=0;i<outcome.length;i++) {
      answer += outcome[i];
    }
    assertEquals(answer, correctAnswer);
  }
}
