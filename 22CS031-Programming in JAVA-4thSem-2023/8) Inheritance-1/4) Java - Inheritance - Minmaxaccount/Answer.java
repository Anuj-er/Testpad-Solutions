class MinMaxAccount extends BankAccount {
    private int minBalance;
    private int maxBalance;
    public MinMaxAccount(int number, int bal) {
        super(number, bal);
        minBalance = bal;
        maxBalance = bal;
    }
    @Override
    public void withdraw(int amt) {
        super.withdraw(amt);
        updateMinMax();
    }
    @Override
    public void deposit(int amt) {
        super.deposit(amt);
        updateMinMax();
    }
    private void updateMinMax() {
        int currentBalance = getBalance();
        if (currentBalance < minBalance) {
            minBalance = currentBalance;
        }
        if (currentBalance > maxBalance) {
            maxBalance = currentBalance;
        }
    }
    public int getMin() {
        return minBalance;
    }
    public int getMax() {
        return maxBalance;
    }
}