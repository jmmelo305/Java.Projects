import java.util.Scanner;
import java.util.Arrays;
public class MeloOddEvenArray {
    
    public static void main (String [] args){

        int number = 0;
        int num = 0;
        int [] arrayNum = new int[15];
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 15 integers separated by one space each");
        

        while (num < 15){
            number = input.nextInt();
            arrayNum [num] = number;     
            num++;
        }

        input.close();
        
        System.out.println("Even numbers: " + Arrays.toString (getEvens(arrayNum)));
        System.out.println("Odd numbers: " + Arrays.toString (getOdds(arrayNum)));
    }


    public static int [] getEvens(int [] nums){
        int arrayLength = nums.length;
        int [] evenNums = new int [7];
        int arrayCount = 0;
        
        for (int i = 0; i < arrayLength; i = i + 1){
            if (nums[i] % 2 == 0){
                evenNums [arrayCount] = nums [i];
                arrayCount ++;
            }
            
        }
        return evenNums ;

    }
    public static int [] getOdds(int [] nums){
        int arrayLength = nums.length;
        int [] oddsNums = new int [8];
        int arrayCount = 0;
        
        for (int i = 0; i < arrayLength; i = i + 2){
                
            if (nums[i] % 2 != 0){
            oddsNums [arrayCount] = nums [i];
                arrayCount ++;
            }
        }
        return oddsNums ;
    }
}
