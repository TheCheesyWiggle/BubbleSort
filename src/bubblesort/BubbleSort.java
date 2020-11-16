
package bubblesort;

import java.util.*;

public class BubbleSort {
    
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter: ");
        int[] numbers = new int[getLength(getIntInput())];
        boolean order = false;
        int arrlen = numbers.length;
        //collects the numbers
        for(int i = 0; i<arrlen;i++){
            System.out.println("Please enter number "+(i+1)+": ");
            numbers[i] = getIntInput() ;
        }
        System.out.println(Arrays.toString(numbers));
        //bubble sort
        do{
            for(int i = 0;i<arrlen;i++){
                for(int j=0;j<arrlen-1;j++){
                    if(numbers[j]>numbers[j+1]){
                        order = false;
                        int num1 = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = num1;
                        j++;
                    }
                    else{
                        order = true;
                    }
                }
            }
        }while(order == false);
        System.out.println(Arrays.toString(numbers));
        //get min max and avg
        int min = numbers[0];
        int max = numbers[arrlen-1];
        int avg = 0;
        for(int x=0;x<arrlen;x++){
            avg =  avg+numbers[x];
        }
        avg = avg/arrlen;
        System.out.println("Min: "+min+" Max: "+max+" Average: "+avg);
    }
    
    
    public static int getIntInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    
    public static int getLength(int input){
        int length = input; 
        return length;
    }
    
}
