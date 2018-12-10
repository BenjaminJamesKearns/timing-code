import java.util.Calendar;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class Code {
  public static void main(String[] args) {
    Random rand = new Random();

    Integer[] warmup = new Integer[10]; //this is here because the first .sort takes
    for (int i=0;i<10;i++) {            //longer than usual therefore I have added a
      warmup[i] = rand.nextInt(99) + 1; //warmup to make the results more accurate
    }
    Arrays.sort(warmup);

    Integer[] array = new Integer[10];
    for (int i=0;i<10;i++) {
      array[i] = rand.nextInt(99) + 1;
    }

    long startTime = System.nanoTime();
    Arrays.sort(array);
    long endTime = System.nanoTime();
    long timeTaken = endTime - startTime;
    System.out.println("It took " + timeTaken + " nanoseconds to sort a 10 number array!");

    Integer[] array2 = new Integer[100];
    for (int i=0;i<100;i++) {
      array2[i] = rand.nextInt(99) + 1;
    }
    startTime = System.nanoTime();
    Arrays.sort(array2);
    endTime = System.nanoTime();
    timeTaken = endTime - startTime;
    System.out.println("It took " + timeTaken + " nanoseconds to sort a 100 number array!");

    Integer[] array3 = new Integer[1000];
    for (int i=0;i<1000;i++) {
      array3[i] = rand.nextInt(99) + 1;
    }

    startTime = System.nanoTime();
    Arrays.sort(array3);
    endTime = System.nanoTime();
    timeTaken = endTime - startTime;
    System.out.println("It took " + timeTaken + " nanoseconds to sort a 1,000 number array!");

    Integer[] array4 = new Integer[10000];
    for (int i=0;i<10000;i++) {
      array4[i] = rand.nextInt(99) + 1;
    }

    startTime = System.nanoTime();
    Arrays.sort(array4);
    endTime = System.nanoTime();
    timeTaken = endTime - startTime;
    System.out.println("It took " + timeTaken + " nanoseconds to sort a 10,000 number array!");

    Integer[] array5 = new Integer[100000];
    for (int i=0;i<100000;i++) {
      array5[i] = rand.nextInt(99) + 1;
    }

    startTime = System.nanoTime();
    Arrays.sort(array5);
    endTime = System.nanoTime();
    timeTaken = endTime - startTime;
    System.out.println("It took " + timeTaken + " nanoseconds to sort a 100,000 number array!");

  }
};
