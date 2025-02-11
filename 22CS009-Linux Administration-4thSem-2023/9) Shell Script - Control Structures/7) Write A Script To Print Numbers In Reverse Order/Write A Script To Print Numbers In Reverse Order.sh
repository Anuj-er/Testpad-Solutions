#!/bin/bash
read num
while [ $num -ge 1 ]; do
    echo $num
    num=$((num - 1))
done