import java.util.Calendar;
import java.util.Arrays;

class Code {
  public static void main(String[] args) {
    Integer[] array = {5,22,35,7,2,88,2,5,1,10};
    Calendar time = Calendar.getInstance();
    int startTime = time.get(Calendar.MILLISECOND);
    Arrays.sort(array);
    int endTime = time.get(Calendar.MILLISECOND);
    int timeTaken = startTime - endTime;
    System.out.println("It took " + timeTaken + " milliseconds to sort a 10 number array!");
  }
};
