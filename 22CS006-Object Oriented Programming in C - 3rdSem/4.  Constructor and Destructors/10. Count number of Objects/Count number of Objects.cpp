int cnt = 0;
class Counter
{
public:
    Counter()
    {
        cnt++;
    }
    ~Counter()
    {
        cnt--;
    }
};