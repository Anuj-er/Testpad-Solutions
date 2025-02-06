int evenDigits(int n) {
 if (n == 0) {
 return 0;
 }
 int lastDigit = n % 10;
 if (lastDigit % 2 == 0) {
 return evenDigits(n / 10) * 10 + lastDigit;
 } else {
 return evenDigits(n / 10);
 }
}