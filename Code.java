import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class Code {
  public static void main(String[] args) {

    Integer[] warmup = new Integer[10];//this is here because the first .sort takes
    Code.fillArray(10,warmup);         //longer than usual therefore I have added a
    Arrays.sort(warmup);               //warmup to make the results more accurate

    Integer[] array = new Integer[10];
    Code.fillArray(10,array);
    Code.recordSorting(10,array);

    Integer[] array2 = new Integer[100];
    Code.fillArray(100,array2);
    Code.recordSorting(100,array2);

    Integer[] array3 = new Integer[1000];
    Code.fillArray(1000,array3);
    Code.recordSorting(1000,array3);

    Integer[] array4 = new Integer[10000];
    Code.fillArray(10000,array4);
    Code.recordSorting(10000,array4);

    Integer[] array5 = new Integer[100000];
    Code.fillArray(100000,array5);
    Code.recordSorting(100000,array5);

  }

  public static void fillArray(int number,Integer[] array) {
    Random rand = new Random();
    for (int i=0;i<number;i++) {
      array[i] = rand.nextInt(99) + 1;
    }
  }

  public static void recordSorting(int length,Integer[] array) {
    long startTime = System.nanoTime();
    Arrays.sort(array);
    long endTime = System.nanoTime();
    long timeTaken = endTime - startTime;
    System.out.println("It took " + timeTaken + " nanoseconds to sort a " + length + " number array!");
  }
};
