import java.util.Scanner;

public class lab33 {
    public  static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        System.out.print("inter an integer number less than ten billion: ");

        if (in.hasNextLong())
        {
            long t= in.nextLong();

            if (t < 0)
            {
               t *= -1;
            }
            if (t >= 10000000000L)
            {
                System.out.println("Number is greater or equals 10,000,000,000!");
            }
            else
            {
                int digits = 1;
                if (t >= 10 && t < 100)
                {
                    digits = 2;
                }
                else
                    if (t >= 100 && t < 1000)
                {
                    digits = 3;
                }
                else
                    if (t>= 1000 && t < 10000)
                {
                    digits = 4;
                }
                else
                    if (t >= 10000 && t < 100000)
                {
                    digits = 5;
                }
                else
                    if (t >= 100000 && t < 1000000)
                {
                    digits = 6;
                }
                else
                    if (t>= 1000000 &&  t < 10000000)
                {
                    digits = 7;
                }
                else
                    if (t >= 10000000 && t < 100000000)
                {
                    digits = 8;
                }
                else
                    if (t>= 100000000 && t < 1000000000)
                {
                    digits = 9;
                }
                else
                    if (t >= 1000000000 && t < 10000000000L)
                {
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        }
        else
        {
            System.out.println("The number is not an integer");
        }
    }
}
