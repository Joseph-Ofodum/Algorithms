

public class Recurssion {
    public static void main( String[] args){
        int numbers = sum(32);
        System.out.println(numbers);
    }


        public static int sum(int p){
        if (p > 0){
            return p + sum(p-1);
        }else {
            return 0;
        }

        }

    }

