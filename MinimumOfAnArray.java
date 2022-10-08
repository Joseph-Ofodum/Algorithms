public class MinimumOfAnArray {
        static void min(int arr[]){
            int number = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(number > arr[i])
                    number= arr[i];
            }
                System.out.println(number);
        }
}
