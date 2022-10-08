public class maxOfAnArray {
    static void max(int arr[]){
        int num = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(num< arr[i])
            num = arr[i];
        }
        System.out.println(num);
    }
}
