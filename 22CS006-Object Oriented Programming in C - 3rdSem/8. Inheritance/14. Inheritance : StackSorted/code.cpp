class StackSorted : public ArrayStack
{
public:
    StackSorted() : ArrayStack() {}

    void push(int n) {
        if (isEmpty()) {
            ArrayStack::push(n);
            return;
        }

        ArrayStack temp;
        while (!isEmpty() && peek() > n) {
            temp.push(pop());
        }

        ArrayStack::push(n);

        while (!temp.isEmpty()) {
            ArrayStack::push(temp.pop());
        }
    }

    friend ostream& operator<<(ostream& out, const StackSorted& stack);
};

ostream& operator<<(ostream& out, const StackSorted& stack) {
    ArrayStack temp;
    StackSorted* nonConstStack = const_cast<StackSorted*>(&stack);

    out << "{";
    while (!nonConstStack->isEmpty()) {
        temp.push(nonConstStack->pop());
    }

    bool first = true;
    while (!temp.isEmpty()) {
        int value = temp.pop();
        if (!first) {
            out << ", ";
        }
        out << value;
        nonConstStack->ArrayStack::push(value);
        first = false;
    }
    out << "}";

    return out;
}