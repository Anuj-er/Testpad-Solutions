class FilteredAccount extends Account {
    private int filteredCount = 0;
    public FilteredAccount(int accno) {
        super(accno);  // Call the constructor of the parent Account class
    }
    @Override
    public boolean process(Transaction t) {
        if (t.value() == 0) {
            // If transaction value is 0, increment filteredCount but do not process it
            filteredCount++;
            return true;  // Indicate that the zero transaction was "approved"
        } else {
            // Process the non-zero value transaction
            return super.process(t);
        }
    }
    public int filtered() {
        // Return the number of zero-valued transactions that have been filtered
        return filteredCount;
    }
}