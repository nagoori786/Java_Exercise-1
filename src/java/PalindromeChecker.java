
public class PalindromeChecker {

    public boolean palindromeCheck(long number){   //Palindrome check

        long temp;
        long number_reverse=0;
        temp=number;
        long rem;
        long sum=0;

        while(number>0){
            rem=number%10;
            if(rem%2 == 0)
                sum=sum+rem;
            number_reverse=number_reverse*10+rem;   //Reverse number
            number=number/10;
        }

        if(temp != number_reverse )
            return false;
        else
            return true;
    }
}
