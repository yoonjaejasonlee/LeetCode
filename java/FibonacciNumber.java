public class FibonacciNumber {
    public int fib(int n){
        if(n == 0){
            return 0; 
        }

        int [] answer = new int[n+1];

        answer[0] = 0; 
        answer[1] = 1;

        for(int i = 2; i<= n ; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer[n];
    }
}
