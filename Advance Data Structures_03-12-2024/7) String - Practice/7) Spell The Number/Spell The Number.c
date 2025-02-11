char *units[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                  "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
char *tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
void intToWord(int n) {
    if (n == 0) {
        printf("zero");
        return;
    }
    char output[500] = "";  // String buffer to store the result
    int lakhPart = n / 100000;
    int remainingAfterLakhs = n % 100000;
    int thousandPart = remainingAfterLakhs / 1000;
    int remainingAfterThousand = remainingAfterLakhs % 1000;
    if (lakhPart > 0) {
        if (strlen(output) > 0) strcat(output, " ");
        strcat(output, units[lakhPart]);
        strcat(output, lakhPart == 1 ? " lakh" : " lakhs");
    }
    if (thousandPart > 0) {
        if (strlen(output) > 0) strcat(output, " ");
        if (thousandPart < 20) {
            strcat(output, units[thousandPart]);
        } else {
            strcat(output, tens[thousandPart / 10]);
            int unitPart = thousandPart % 10;
            if (unitPart != 0) {
                strcat(output, " ");
                strcat(output, units[unitPart]);
            }
        }
        strcat(output, " thousand");
    }
    int hundredPart = remainingAfterThousand / 100;
    int remainingAfterHundred = remainingAfterThousand % 100;
    if (hundredPart > 0) {
        if (strlen(output) > 0) strcat(output, " ");
        strcat(output, units[hundredPart]);
        strcat(output, " hundred");
    }
    if (remainingAfterHundred > 0) {
        if (strlen(output) > 0) strcat(output, " ");
        if (remainingAfterHundred < 20) {
            strcat(output, units[remainingAfterHundred]);
        } else {
            strcat(output, tens[remainingAfterHundred / 10]);
            int unitPart = remainingAfterHundred % 10;
            if (unitPart != 0) {
                strcat(output, " ");
                strcat(output, units[unitPart]);
            }
        }
    }
    printf("%s", output);
}