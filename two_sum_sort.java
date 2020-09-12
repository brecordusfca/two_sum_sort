import java.util.Scanner;
import java.util.Arrays;

class two_sum_sort
{

    private static int[] two_sum_sorting(int[] num, int target)
    {
        Arrays.sort(num);
        
        int left = 0;
        int right = num.length - 1;
        
        while(left < right)
        {
            if(num[left] + num[right] == target)
            {
                return new int[] {num[left], num[right]};
            }
            else if (num[left] + num[right] < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return new int[] {};
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will be in the array?");
        int n = input.nextInt();
        
        int[] num = new int[n];

        for(int i = 0; i < n; i++)
        {
        	System.out.println("Input number for the array: ");
            num[i] = input.nextInt();
        }
        System.out.println("Target: ");
        int target = input.nextInt();

        input.close();

        int[] cell = two_sum_sorting(num, target);

        if (cell.length == 2)
        {
        	System.out.println("Solution found!");
            System.out.println(cell[0] + " " + cell[1]);
        }
        else
        {
            System.out.println("No solution found!");
        }
    }
}
