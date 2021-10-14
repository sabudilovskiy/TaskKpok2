package Support;

import java.util.Scanner;

public class Support {
    public static Long inputLong(Scanner scan, String inputText, String errorText){
        long temp = -1;
        System.out.println (inputText);
        boolean error = false;
        try{
            temp = Long.parseLong (scan.nextLine ());
        }
        catch (NumberFormatException numberFormatException){
            error = true;
        }
        while (error){
            System.out.println (errorText);
            try{
                temp = Long.parseLong (scan.nextLine ());
                error = false;
            }
            catch (NumberFormatException ignored){
            }
        }
        return temp;
    }
}
