# Create an array with the folder names
folders=(
“1. Group By Clause”
“2. Having Clause”
“3. Order By Clause”
“4. MAX / MIN Aggregate Functions”
“5. COUNT Function”
“6. Sum & Avg functions”
“7. UPPER, LOWER & LENGTH Functions”
“8. Number Functions”
“9. Date Functions”
“10. Character Functions”
“11. Print the count of records”
“12. Print records ordered by two fields”
“13. Print records in descending order”
)

# Create folders and code.sql file
for folder in "${folders[@]}"; do
    mkdir "$folder"
    touch "$folder/code.sql"  # Create an empty code.sql file
done

# Move and rename screenshots
screenshots=(Screenshots/*.png)
for i in "${!folders[@]}"; do
    if [[ -f "${screenshots[$i]}" ]]; then
        mv "${screenshots[$i]}" "${folders[$i]}/${folders[$i]}.png"
    fi
done