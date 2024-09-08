#include <string>
#include <stack>
int balancedString(const std::string& s) {
    std::stack<char> st;
    for (int i = 0; i < s.size(); ++i) {
        char c = s[i];
        if (c == '(' || c == '{') {
            st.push(c);
        } else if (c == ')' || c == '}') {
            if (st.empty()) {
                return i; 
            }
            char top = st.top();
            st.pop();
            if ((c == ')' && top != '(') || (c == '}' && top != '{')) {
                return i; 
            }
        }
    }
    if (!st.empty()) {
        return s.size(); 
    }
    return -1; 
}