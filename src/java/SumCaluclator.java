
public class SumCaluclator{

    //this method find the sum of entered random number of integers
    public long sumCaluclate(String str){

        long sum=0;
        String[] stringarray= str.split(" ",0);     //spilts the string when space is encountered
        for(int i=0;i<stringarray.length;i++){
            sum= sum + Integer.parseInt(stringarray[i]);
        }
        return sum;
    }
}
