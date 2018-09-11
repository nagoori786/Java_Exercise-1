
public class TomAndJerry {

    //This method is for checkinggiven number lies between 20 & 30 and checking even or odd
    public String tomOrJerry(int number){

        if( (number%2 == 0) && (number >= 20 && number <= 30) )
            return "Tom";

        else if( (number%2 != 0) && (number >= 20 && number <= 30) )
            return "Jerry";

        else
            return "Not between 20 & 30";
    }
}
