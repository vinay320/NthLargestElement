//moving negative element to side
public class Sort {
    public static void main(String[] args) {
        int[] arr={5,-5,-6,4,6,-7,3};
        int pos=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<0)
            {int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            }

        }
        for (int i:arr
             ) {
            System.out.println(i);

        }
    }
}