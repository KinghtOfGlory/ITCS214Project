import java.util.NoSuchElementException;
import java.util.Scanner;
public class Registeration
{
    public static void main(String[] args)
    {
            Scanner kbd = new Scanner(System.in);
            char code = kbd.next().charAt(0);

            switch (code)
            {
                case '1':
                    System.out.println("asd");
                    break;
                default:
                    System.out.println("index not found");
            }
    }
}
