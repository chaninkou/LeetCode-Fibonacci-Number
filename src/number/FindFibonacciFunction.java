package number;

public class FindFibonacciFunction {
    public int fib(int N){
        if(N <= 1){
            return N;
        }
        
        int a = 0;
        int b = 1;
        
        while(N-- > 1){
            int sum = a + b;
            a = b;
            b = sum;
        }
        
        return b;
    }
    
    
    // Recursive but too slow 2^n 
		// public int fib(int N) {
		// if(N == 0){
		// 	return 0;
		// } else if(N == 1){
		// 	return 1;
		// } else {
		// 	return fib(N - 2) + fib(N - 1);
		// }
		// }
}
