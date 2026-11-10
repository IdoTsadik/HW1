import java.util.Arrays;

public class Assignment01Q04 {



    public static int[] shiftArrayCyclic(int[] array, int move, char direction) 
    {
        if (array.length == 0)
        {
            return array;
        }
        if (direction != 'L' && direction != 'R')
     {
            return array;
        }
        if (move < 0)
        {
            move = -1 * move;

            if (direction == 'L')
            {
                direction = 'R';
            }
            else
            {
                direction = 'L';
            }
        }
        move = move % array.length;
        int[] new_arr = new int[array.length];
        if (direction == 'L')
        {
            for (int i = 0; i < array.length; i++)
            {
                new_arr[i] = array[(i + move) % array.length];
            }
        }
        else
        {
            for (int i=0; i <array.length; i++)
            {
                new_arr[i] = array[(i - move + array.length) % array.length];
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            array[i] = new_arr[i];
        }
        return array;
    }
    

            

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}