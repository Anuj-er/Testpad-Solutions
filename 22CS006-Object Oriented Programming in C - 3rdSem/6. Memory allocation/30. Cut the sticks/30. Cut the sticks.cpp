int* cutSticks(int lengths_size, int *lengths, int *result_size) 
{
int* result_array = new int[lengths_size];
    int result_index = 0;
    while (true) {
        int min_length = -1;
        int sticks_cut = 0;
        for (int i = 0; i < lengths_size; i++) {
            if (lengths[i] > 0 && (min_length == -1 || lengths[i] < min_length)) {
                min_length = lengths[i];
            }
        }
        if (min_length == -1) {
            break;
        }
        for (int i = 0; i < lengths_size; i++) {
            if (lengths[i] > 0) {
                lengths[i] -= min_length;
                sticks_cut++;
            }
        }
        result_array[result_index++] = sticks_cut;
    }
    *result_size = result_index;
    return result_array;
}