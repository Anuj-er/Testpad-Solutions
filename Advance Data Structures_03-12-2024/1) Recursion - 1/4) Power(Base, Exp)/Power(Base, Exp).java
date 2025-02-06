class Result {
    static long power(int base, int exp) {
        if (exp < 0) {
            return -1; // Return -1 for negative exponents
        }
        if (exp == 0) {
            return 1; // Base case: any number raised to the power of 0 is 1
        }
        if (exp % 2 == 0) {
            long halfPower = power(base, exp / 2);
            return halfPower * halfPower; // Use the property (a^b)^2 = a^(2b)
        } else {
            return base * power(base, exp - 1); // Reduce the exponent by 1
        }
    }
}