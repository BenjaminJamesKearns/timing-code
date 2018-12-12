import java.util.Random;

public class Groups {

  Integer[][] groupArray;
  public Integer[] people = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  public Integer groupNumber;
  public Integer groupRemainder;

  public String create(int num) {
    long startTime = System.nanoTime();
    groupArray = new Integer[num][];
    fillGroups(num);
    long endTime = System.nanoTime();
    long timeTaken = endTime - startTime;
    System.out.println("It took " + timeTaken + " nanoseconds!");
    return num + " groups created";
  }

  public Integer numberOfGroups() {
    return groupArray.length;
  }

  public Integer[] accessGroups(Integer num) {
    return groupArray[num];
  }

  public void fillGroups(Integer num) {
    groupNumber = people.length/num;
    groupRemainder = people.length%num;
    for(int i=0;i<num;i++) {
      if (groupRemainder>0) {
        groupArray[i] = new Integer[groupNumber+1];
        groupRemainder-=1;
      } else {
        groupArray[i] = new Integer[groupNumber];
      }
    }
    Integer person;
    for(int i=0;i<num;i++) {
      Random rand = new Random();
      person = 0;
      while (person<groupArray[i].length) {
        int index = rand.nextInt(people.length);
        while (people[index] == 0) {
          index = rand.nextInt(people.length);
        }
        groupArray[i][person] = people[index];
        people[index] = 0;
        person += 1;
      }
    }
  }
}
