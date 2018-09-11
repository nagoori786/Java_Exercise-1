import java.util.Scanner;

public class ForLoop {

    //This method prints the number, number times till entered number
    public static void main(String args[]){

        int i;
        int j;
        int num;
        Scanner scanner= new Scanner(System.in);
        num=scanner.nextInt();
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++)
                System.out.print(i+" ");
        }
        System.out.println("");
    }
}
