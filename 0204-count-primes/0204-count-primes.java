class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2

        boolean[] isPrime = new boolean[n];
        // Assume all numbers are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Start marking non-prime numbers
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count; // Return the total count of primes
    }
}
