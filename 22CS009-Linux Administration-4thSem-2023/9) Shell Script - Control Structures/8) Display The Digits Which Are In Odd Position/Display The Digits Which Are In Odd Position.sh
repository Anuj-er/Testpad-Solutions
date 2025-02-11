#!/bin/bash
read num
num_str="$num"
length=${#num_str}
for (( i=0; i<$length; i++ )); do
    if (( (i+1) % 2 != 0 )); then
        echo ${num_str:$i:1}
    fi
done