
public class CharChecker{

    //this method identifies type of entered character
    public String characterCheck(char character){

        int ascii=(int)character;
        if(ascii >= 65 && ascii <= 90)
            return "Capital letter";

        else if(ascii >= 97 && ascii <= 122 )
            return "Small letter";

        else if(ascii >=48 && ascii <= 57)
            return "Digit";

        else
            return "Special Character";

    }
}
