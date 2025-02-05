public boolean bankFees(double fee) {
    double totalFees = 0.0;
    for (int i = 1; i <= transactions; i++) {
        totalFees += fee * i;
    }
    if (balance >= totalFees) {
        balance -= totalFees;
        return true;
    } else {
        balance = 0.0;
        return false;
    }
}