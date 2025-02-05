static int sumOfRange(int min, int max) {
    if (min > max) {
        return 0;
    }
    return (max - min + 1) * (min + max) / 2;
}