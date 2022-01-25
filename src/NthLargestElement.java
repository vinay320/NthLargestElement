import java.util.Scanner;

public class NthLargestElement {
    public static void main(String[] args) {
        int[] arr={2,8,1,6,3,7,9};
        int max=0;
        int n;

        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {   max=0;
            int in=0;
            for(int j=0;j<7;j++)
            {

                if(arr[j]>max)
                {
                    max=arr[j];
                    in=j;
                }
            }
            arr[in]=0;

        }
        System.out.println(max);
    }
}
