#!/bin/bash
read main_string
read substring
position=$(echo "$main_string" | grep -b -o "$substring" | cut -d: -f1)
if [ -n "$position" ]; then
    echo $((position + 1))
else
    echo "-1"
fi