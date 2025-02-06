class Result {
    static void printSpiral(int a[][], int r, int c) {
        int strow = 0, stcol = 0;
        int rend = r, cend = c;
        while (strow < rend && stcol < cend) {
            for (int i = stcol; i < cend; i++) {
                System.out.println(a[strow][i]);
            }
            strow++;
            for (int i = strow; i < rend; i++) {
                System.out.println(a[i][cend - 1]);
            }
            cend--;
            if (strow < rend) {
                for (int i = cend - 1; i >= stcol; i--) {
                    System.out.println(a[rend - 1][i]);
                }
                rend--;
            }
            if (stcol < cend) {
                for (int i = rend - 1; i >= strow; i--) {
                    System.out.println(a[i][stcol]);
                }
                stcol++;
            }
        }
    }
}