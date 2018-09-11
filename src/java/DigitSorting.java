import java.util.Scanner;

import java.util.Arrays;

public class DigitSorting {

    //This method is sort the digits in number
    public static void main(String args[]){

        int sum=0;
        int i=0;
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char tempArray[]=str.toCharArray();      // Convert string to char array
        Arrays.sort(tempArray);
        System.out.print("Sorted number in non-increasing order:");

        for(int j=0;j<tempArray.length;j++) {
            System.out.print(tempArray[j]);
            int temp=(int)tempArray[j];
            temp=temp-48;
            if(temp%2 == 0){
                sum=sum+temp;
            }
        }

        System.out.println(" ");
        System.out.println("Sum of even numbers: " + sum);
        if(sum>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
