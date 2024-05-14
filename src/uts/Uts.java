package uts;
import java.util.Arrays;

public class Uts {
      public static void main(String[] args) {
        char direction1 = 'R';
        int[] cubes1 = {3, 2, 1, 2};
        System.out.println(Arrays.toString(switchGravity(direction1, cubes1)));  
        char direction2 = 'L';
        int[] cubes2 = {1, 4, 5, 3, 5};
        System.out.println(Arrays.toString(switchGravity(direction2, cubes2)));  
    }

    public static int[] switchGravity(char direction, int[] cubes) {
        int[] result = Arrays.copyOf(cubes, cubes.length);

        Arrays.sort(result);

        if (direction == 'L') {
            for (int i = 0; i < result.length / 2; i++) {
                int temp = result[i];
                result[i] = result[result.length - 1 - i];
                result[result.length - 1 - i] = temp;
            }
        }

        return result;
    }
}