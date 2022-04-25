import java.util.Arrays;
public class rotateArray {
    public void rotate(int[] arr) {
        int a = arr[arr.length - 1];
        for (int i= arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;
    }

    public static void main(String[] args) {
        rotateArray obj=new rotateArray();
        int[]arr={10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));
        obj.rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}

