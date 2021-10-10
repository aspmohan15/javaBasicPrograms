import java.util.Scanner;

public class amstrong {
    
    public static void main(String[] args) 
    {
        System.out.println("Enter the number :");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int temp=num;     
        int rem;
        int sum=0;

        while(temp>0)
        {
            rem=temp%10;
            sum+=(rem*rem*rem);
            temp/=10;
             
        }
         
        if(num==sum)

        {
            System.out.println("The given "+num+" is Amstrong: ");
        }
        else
        {
            System.out.println("The given "+num+" is not an Amstrong: ");

        }

    }
         


}

    

