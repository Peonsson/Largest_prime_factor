import java.math.BigInteger;

/**
 * Created by Peonsson on 2015-09-11.
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * https://projecteuler.net/problem=3
 */
public class Problem_3 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("600851475143");
        BigInteger newNumber = new BigInteger("0");

        BigInteger i = new BigInteger("1");
        while(true) {
            if(isPrime(i.intValue()))
                newNumber = number.divide(i);

        }
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if(i % j == 0)
                return false;
        }
        return true;
    }
}