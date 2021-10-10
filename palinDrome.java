import java.util.Scanner;

public class palinDrome {

    public static void main(String[] args) 
    
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");

        int palin=scan.nextInt(); //342

        int temp=palin;
        int remainder=0;
        int Avg=0;

        while(temp>0)
        {
            remainder = temp%10;
            Avg =(Avg*10)+remainder;
            temp =temp/10;

        }
 
        if(Avg==palin)
        
        {
            System.out.println(" Given Number is palindrome: ");

        }
        else
        {
            System.out.println(" Given Number is Not XXX an palindrome : ");
        }
        

        

    }


    
}
