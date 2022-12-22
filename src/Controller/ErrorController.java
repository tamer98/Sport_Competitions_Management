package Controller;


public class ErrorController {

    public static boolean numChecker(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean nameChecker(String name){
        String checkname=name;
        int counter=0;
        char checkchar=0;

        for(int i=0;i<checkname.length();i++)
        {
            checkchar= checkname.charAt(i);

            if((checkchar<=90 && checkchar>=65)||(checkchar<=122 && checkchar>=97) || checkchar==32)
            {
                counter++;
            }
        }
        if(checkname.length() > 2){
            if(counter==checkname.length()){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }
   
}
