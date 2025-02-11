# Write your script here 
#!/bin/bash
# Read two strings from the user
read str1
read str2
# Compare the two strings
if [ "$str1" == "$str2" ]; then
    echo "EQUAL"
else
    echo "NOT EQUAL"
fi