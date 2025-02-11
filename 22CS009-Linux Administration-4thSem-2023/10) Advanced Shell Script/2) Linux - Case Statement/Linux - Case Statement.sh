#!/bin/bash
read day_number
case $day_number in
  1) echo "Monday"    ;;
  2) echo "Tuesday"   ;;
  3) echo "Wednesday" ;;
  4) echo "Thursday"  ;;
  5) echo "Friday"    ;;
  6) echo "Saturday"  ;;
  7) echo "Sunday"    ;;
  *) echo "Invalid Day Number" ;;
esac