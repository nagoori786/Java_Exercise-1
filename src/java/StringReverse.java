
public class StringReverse {

    //This method takes string as input and return the reversed string
    public String reverseString(String str) {

        int len = str.length();
        String str1="";
        for (int i = len-1; i >= 0; i--) {
            str1=str1+str.charAt(i);
        }
        return str1;
    }
}
