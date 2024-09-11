function addOneToEach(input) {
    // Iterate through each element of the array
    for (let i = 0; i < input.length; i++) {
      // Add 1 to the current element
      input[i] += 1;
    }
    // Return the modified array
    return input;
  }