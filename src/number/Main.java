package number;

public class Main {
	public static void main(String[] args) {
		int N = 3;
		
		System.out.println("Input: " + N);
		
		FindFibonacciFunction solution = new FindFibonacciFunction();
		
		System.out.println("Solution: " + solution.fib(N));
	}
}
