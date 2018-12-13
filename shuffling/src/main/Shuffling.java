import java.util.Random;

public class Shuffling {
    public Integer[] array = new Integer[] {1,2,3,4,5};
    public Integer[] newArray = new Integer[5];
    public Integer index;
    public Integer[] shuffle() {
        Random rand = new Random();
        for (int i=0;i<array.length;i++) {
            index = rand.nextInt(array.length-1);
            while (index == i && newArray[index] != null) {
                index = rand.nextInt(array.length-1);
            }
            newArray[index] = array[i];
            System.out.println(newArray[index]);
        }
        return newArray;
    }
}