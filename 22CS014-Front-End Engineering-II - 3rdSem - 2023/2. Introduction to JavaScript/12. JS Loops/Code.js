function primeCount(n) {
    let primeCount = 0;
    function isPrime(num) {
        if (num <= 1) return false;
        for (let i = 2; i <= Math.sqrt(num); i++) {
            if (num % i === 0) return false;
        }
        return true;
    }
    for (let i = 2; i <= n; i++) {
        if (isPrime(i)) {
            primeCount++;
        }
    }
    return primeCount;
}