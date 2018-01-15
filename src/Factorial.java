public class Factorial {

    int factorial(int n){
        int f = 1;
        if (n < 0)
            return 0;
        while ( n > 0){

            f = f *n;
            n = n-1;
        }
        return f;
    }
}
