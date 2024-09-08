class ArrayClass
{
private:
    int *ptr;
    int size;

public:
    ArrayClass(int s)
    {
        size = s;
        ptr = new int[s];
    }
    ~ArrayClass()
    {
        delete[] ptr;
    }
    ArrayClass(const ArrayClass &other)
    {
        size = other.size;
        ptr = new int[size];
        for (int i = 0; i < size; i++)
        {
            ptr[i] = other.ptr[i];
        }
    }
    ArrayClass &operator=(const ArrayClass &other)
    {
        if (this == &other)
        {
            return *this;
        }
        delete[] ptr;
        size = other.size;
        ptr = new int[size];
        for (int i = 0; i < size; i++)
        {
            ptr[i] = other.ptr[i];
        }
        return *this;
    }
    int &operator[](int j)
    {
        return *(ptr + j);
    }
};