package basicsort;

public class InsertSort {

    public static void main(String[] args) {

        int[] arr = new int[]{7,5,4,2,3,1,9,8,6};

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(j-1 >=0 && arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
