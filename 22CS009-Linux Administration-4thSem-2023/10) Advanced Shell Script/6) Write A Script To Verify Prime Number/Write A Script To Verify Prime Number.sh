verifyPrime() {
    n=$1
    if [ $n -le 1 ]; then
        echo "NOT PRIME"
        return
    fi
    for ((i=2; i*i<=n; i++)); do
        if [ $((n % i)) -eq 0 ]; then
            echo "NOT PRIME"
            return
        fi
    done
    echo "PRIME"
}