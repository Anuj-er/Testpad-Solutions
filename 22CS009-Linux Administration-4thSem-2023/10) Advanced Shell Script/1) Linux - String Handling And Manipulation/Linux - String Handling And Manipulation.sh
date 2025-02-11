#!/bin/bash
read string1
read string2
read string3
concatenated_string="${string1}${string2}${string3}"
echo "$concatenated_string"
echo "${#concatenated_string}"
read x
read y
substring="${concatenated_string:x:y}"
echo "$substring"