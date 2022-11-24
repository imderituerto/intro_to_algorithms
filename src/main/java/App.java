public class App {

    public static void main(String[] args){

    }

    public static int factorial(int n){

        /* ALGORITHM PSEUDOCODE
           - accept an integer n
           - find the product of n + every positive integer below it
           - return the product
         */

        // equivalent for loop
//        for(n = n; n > 1, n--){
//            product *= n;
//        }

        int product = 1;
        while(n > 1){
            product = n * product;
            n--;
        }
            return product;
    }

}
