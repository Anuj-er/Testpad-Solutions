int* cutSticks(int lengths_size, int *lengths, int *result_size) {
    int* result = new int[lengths_size];  
    int result_count = 0;
    while (true) {
        int count = 0;
        for (int i = 0; i < lengths_size; i++) {
            if (lengths[i] > 0) {
                count++;
            }
        }
        if (count == 0) {
            break;
        }
        int minLength = 2147483647;
        for (int i = 0; i < lengths_size; i++) {
            if (lengths[i] > 0 && lengths[i] < minLength) {
                minLength = lengths[i];
            }
        }
        for (int i = 0; i < lengths_size; i++) {
            if (lengths[i] > 0) {
                lengths[i] -= minLength;
            }
        }
        result[result_count++] = count;
    }
    *result_size = result_count;
    int* result_array = new int[result_count];
    for (int i = 0; i < result_count; i++) {
        result_array[i] = result[i];
    }
    delete[] result;  
    return result_array;
}