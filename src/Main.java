import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] anArray = new int[10];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(anArray));
        for (int i = 0; i < anArray.length*2; i++) {
            System.out.print(anArray[i]);
            System.out.print(" ");
        if(i<anArray.length*2){
            System.out.println(anArray[i]);

        }else 
        }
    }
}
