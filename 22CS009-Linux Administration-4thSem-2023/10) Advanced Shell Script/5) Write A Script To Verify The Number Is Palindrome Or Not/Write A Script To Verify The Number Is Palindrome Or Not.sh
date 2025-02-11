verifyPalindrome() {
    n=$1        
    original=$n 
    reversed=0
    while [ $n -gt 0 ]; do
        remainder=$((n % 10)) 
        reversed=$((reversed * 10 + remainder))  
        n=$((n / 10))  
    done
    if [ $original -eq $reversed ]; then
        echo "Yes"
    else
        echo "No"
    fi
}