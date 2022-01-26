//sorting without using sorting method
public class Sorting {
    public static void main(String[] args) {

        int[] arr={1,2,0,1,0,1,2,0};
        int c1=0,c2=0;
        for (int j : arr) {
            if (j == 0) {
                c1++;
            } else if (j == 1) {
                c2++;
            }
        }
        for (int i = 0; i<arr.length ; i++) {
            if(i<(c1))
            {
                arr[i]=0;
            }
            if(i>=(c1) && i<(c1+c2))
            {
                arr[i]=1;
            }
            if(i>=c1+c2)
            {
                arr[i]=2;
            }
        }
        for (int i:arr
             ) {
            System.out.println(i);

        }
    }
}
