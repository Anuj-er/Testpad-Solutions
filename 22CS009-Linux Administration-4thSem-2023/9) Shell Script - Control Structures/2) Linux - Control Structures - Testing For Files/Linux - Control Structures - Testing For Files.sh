# Write your script here
#!/bin/bash
# Read the file path from user input
read file_path
# Check if the file exists
if [ -e "$file_path" ]; then
    echo "Exists"
else
    echo "Not Exists"
fi