class Result {
     private static final String[] units = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void intToWord(int n) {
        if (n == 0) {
            System.out.print("zero");
            return;
        }
        
        StringBuilder output = new StringBuilder();
        
        int lakhPart = n / 100000;
        int remainingAfterLakhs = n % 100000;
        int thousandPart = remainingAfterLakhs / 1000;
        int remainingAfterThousand = remainingAfterLakhs % 1000;

        if (lakhPart > 0) {
            if (output.length() > 0) output.append(" ");
            output.append(units[lakhPart]);
            output.append(lakhPart == 1 ? " lakh" : " lakhs");
        }
        
        if (thousandPart > 0) {
            if (output.length() > 0) output.append(" ");
            if (thousandPart < 20) {
                output.append(units[thousandPart]);
            } else {
                output.append(tens[thousandPart / 10]);
                int unitPart = thousandPart % 10;
                if (unitPart != 0) {
                    output.append(" ");
                    output.append(units[unitPart]);
                }
            }
            output.append(" thousand");
        }
        
        int hundredPart = remainingAfterThousand / 100;
        int remainingAfterHundred = remainingAfterThousand % 100;
        
        if (hundredPart > 0) {
            if (output.length() > 0) output.append(" ");
            output.append(units[hundredPart]);
            output.append(" hundred");
        }
        
        if (remainingAfterHundred > 0) {
            if (output.length() > 0) output.append(" ");
            if (remainingAfterHundred < 20) {
                output.append(units[remainingAfterHundred]);
            } else {
                output.append(tens[remainingAfterHundred / 10]);
                int unitPart = remainingAfterHundred % 10;
                if (unitPart != 0) {
                    output.append(" ");
                    output.append(units[unitPart]);
                }
            }
        }
        
        System.out.print(output.toString());
    }
}
