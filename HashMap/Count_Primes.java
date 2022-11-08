import java.util.Arrays;
import java.util.Scanner;

public class Count_Primes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = isprime(10);
        System.out.println(ans);
    }

    private static int isprime(int n) {
            if(n<=2){
                return 0;
            }

            boolean[] prime = new boolean[n];
            Arrays.fill(prime, true);
            prime[0]=false;
            prime[1]=false;
            for (int i = 2; i*i <=n ; i++) {
                if(prime[i]==true){
                    for (int j = i*i; j <n; j+=i) {
                        prime[j] =false;
                    }
                }
            }
            int count =0;
            for (int i = 2; i <prime.length; i++) {
                if(prime[i]==true){
                    count++;
                }
            }
            return count;
    }
}