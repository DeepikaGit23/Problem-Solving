public class FredoAndArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(" " + arr[i]);
        }
        System.out.println(" Sum = " + sum);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]*arr.length>sum){
                System.out.println(arr[i]*arr.length);
                break;
            }
        }
    }
}
