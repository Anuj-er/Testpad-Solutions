#!/bin/bash
read N
even_count=0
for (( i=1; i<=N; i++ ))
do
  read num
  if (( num % 2 == 0 )); then
    even_count=$((even_count + 1))
  fi
done
echo $even_count