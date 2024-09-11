function shallowCopy(input) {
    // Check if the input is an array
    if (!Array.isArray(input)) {
        throw new Error("Input must be an array");
    }
    // Use the slice method to create a shallow copy
    return input.slice();
}