//sub array having sum zero....
import java.util.Scanner;

public class AVG {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i <5 ; i++)
        {
            arr[i]=s.nextInt();
        }
        int a=0,b=0;
        for(int i=0;i<5;i++)
        {   int sum=0;
            for (int j = i; j <5 ; j++) {
                sum=sum+arr[j];
                if(sum==0)
                {       a=i;
                        b=j;
                        break;
                }
            }
            if(sum==0)
            {
                break;
            }
        }
        for (int k = a; k<=b ; k++) {
            System.out.println(arr[k]);
        }


    }
}
