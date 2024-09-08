class FilteredAccount : public Account {
private:
    int filteredCount;
public:
    FilteredAccount(int accno) : Account(accno), filteredCount(0) {}
    bool process(Transaction t) {
        if (t.value() == 0) {
            filteredCount++;
            return true;
        } else {
            return Account::process(t);
        }
    }
    int filtered() const {
        return filteredCount;
    }
};