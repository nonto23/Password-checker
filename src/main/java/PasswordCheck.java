import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {


   public static final int PASS_LENGTH = 8;


    public static Boolean hasSpecialCharecter(String password)
    {
        Pattern pattern = Pattern.compile("[$&+,:;=?@#|'<>.^*()%!-]");
        Matcher ismatch = pattern.matcher(password);

        if(!ismatch.matches())
        {
            return true;
        }
        System.out.println("Password should contain atleast one Special Charecter");
        return  false;
    }
    public static Boolean passwordIsOk(String password)
    {
//


        boolean lengthCheck = false;
        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean digitCheck = false;
        boolean specialCharecetor = false;
        boolean exist = false;
        boolean check = false;

        for(int i=0;i<password.length();i++) // This loop tests string
        {
            
            char s=password.charAt(i); // verify the existing of password

             if(password !=null)
             {


                 //System.out.println(" Password should exist");
                 exist =true;
             }

            if(Character.isUpperCase(s)) // This verifies there is a uppercase letter
            {
                //System.out.println(" Password should contain at least one uppercase");
                upperCheck =true;
            }


            if(Character.isLowerCase(s)) // This verifies there is a lowercase letter
            {
                //System.out.println(" Password should contain at  least one Lowercase");
                lowerCheck = true;

            }
            if(Character.isDigit(s)) // This verifies there is a digit
            {

                //System.out.println(" Password should contain at least one digit");
                digitCheck  = true;
            }

            if (password.length() >=PASS_LENGTH) // This verifies the password is atleast 6 characters
            {

               // System.out.println(" Password should contain 8 charecters");
                lengthCheck =true;
            }
            if(hasSpecialCharecter(password))
            {
                //System.out.println(" charecter");
                specialCharecetor = true;

            }

        }

        if(upperCheck == true && lowerCheck == true && digitCheck == true && lengthCheck == true && exist==true && specialCharecetor)
        {
            check=true;
        }
        else
        {
            System.out.println("Password is invalid");
        }



     return check;
    }

    public static boolean isvalid(String password)
    {
        return true;
    }



    public static  Boolean passwordOK(String password)
    {
        boolean check = false;


        if (password!=null && password.length() >= PASS_LENGTH && hasSpecialCharecter(password))
        {
            check = true;
        }
        else
        {
            System.out.println("Password is never OK");
        }

        return check;
    }

    public static void main(String [] arg)
    {


        //System.out.println("Please re enter the password");


        try
        {
            Scanner scan = new Scanner(System.in);


            System.out.println("Enter the password:");
            String password = scan.nextLine();

            if(passwordIsOk(password))
            {
                System.out.println("Password is ok");
            }

            if(passwordOK(password))
            {
                System.out.println("Three conditions are met");
            }
           ;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
