
import java.util.Scanner;;
public class primeall 
{


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int num=scan.nextInt();
        int count;

        for(int i=1;i<=num;i++)
        {
            count =0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }

            }
            if(count==0)
            {
                System.out.println(i);
            }
        }


    }
}
