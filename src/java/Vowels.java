import java.util.Scanner;

public class Vowels {

    //this me thod to specify each character in string is vowel or consonant
    public static void main(String args[]){

        String str;
        Scanner scanner= new Scanner(System.in);
        str=scanner.next();
        for(int i=0;i<str.length();i++){

            int ascii=(int)str.toLowerCase().charAt(i);   // to find the character at position 'i'

            if(ascii < 97 || ascii >= 123) {
                System.out.print(str.charAt(i)+"-Error  ");
            }

            else if( str. toLowerCase(). charAt(i)== 'a'|| str. toLowerCase(). charAt(i)=='e'||str. toLowerCase(). charAt(i)=='i'||
             str. toLowerCase(). charAt(i)=='o'||str. toLowerCase(). charAt(i)=='u' ){
                System.out.print(str.charAt(i)+"-Vowel  ");
            }

            else
                System.out.print(str.charAt(i)+"-Consonant  ");
        }
        System.out.println("");
    }
}
