
import java.util.Scanner;
import Calculator.*;
public class MyCalculator {

    public static void main(String[]args)
    {
        int a,b,result;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        Add xyz = new Add(a,b);
        result = xyz.doAdd();
        System.out.println(result);

    }
}
