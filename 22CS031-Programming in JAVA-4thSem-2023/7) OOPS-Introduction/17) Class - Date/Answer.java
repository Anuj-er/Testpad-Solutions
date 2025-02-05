class Date {
    private int month;
    private int day;
    public Date(int m, int d) {
        this.month = m;
        this.day = d;
    }
    public int daysInMonth() {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0;
        }
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public void nextDay() {
        if (day < daysInMonth()) {
            day++;
        } else {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
            }
        }
    }
    public String toString() {
        return month + "/" + day;
    }
    public int absoluteDay() {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int absoluteDay = day;
        for (int i = 0; i < month - 1; i++) {
            absoluteDay += daysInMonths[i];
        }
        return absoluteDay;
    }
}