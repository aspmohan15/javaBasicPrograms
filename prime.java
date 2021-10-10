import java.lang.Math;

public class prime
{
    public static void main(String[] args) {
        


        int num=4;
        int flag=1;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                flag=0;
                break;

            }

        }
        if(num<=0)
        {
            flag=0;

        }
        if(flag==0)
        {
            System.out.println("Given Number is prime :");
        }
        else{ 
            System.out.println("Given Number is Not a Prime :");
            }
    }
}