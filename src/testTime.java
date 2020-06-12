import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * UNIX EPOCH / UNIX TIMESTAMP
 * For more information visit: https://www.epochconverter.com/
 */

public class testTime {
    public static void main(String[] args) throws ParseException{
        long a;
        String b;
        Scanner sc= new Scanner(System.in);

        //Fetch current timestamp
        a = System.currentTimeMillis();
        System.out.println("The current timestamp is:"+a);

        //Convert timestamp to DATE
        System.out.println("Enter the timestamp:");
        a=sc.nextLong();
        System.out.println("The full date is:"+ new Date(a));

        //Convert DATE to timestamp
        a= new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse("10/01/1998 17:30:00").getTime(); //Give your DATE here
        System.out.println("The converted timestamp is:"+a);
        System.out.println("Your entered DATE was:"+ new Date(a));
    }
}
