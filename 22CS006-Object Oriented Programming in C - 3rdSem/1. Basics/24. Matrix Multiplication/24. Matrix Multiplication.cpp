void multiplyMatrix(int A[50][50], int B[50][50], int R1, int C1, int R2, int C2)
{
    int result[50][50] = {0};  // Initialize result matrix with zeros
    for (int i = 0; i < R1; ++i) {
        for (int j = 0; j < C2; ++j) {
            for (int k = 0; k < C1; ++k) {
                result[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    for (int i = 0; i < R1; ++i) {
        for (int j = 0; j < C2; ++j) {
            cout << result[i][j] << " ";
        }
        cout << endl;
    }
}