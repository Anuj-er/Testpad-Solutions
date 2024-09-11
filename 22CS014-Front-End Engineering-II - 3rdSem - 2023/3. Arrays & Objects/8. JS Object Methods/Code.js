ladder.setSteps = function(numSteps) {
    this.steps = numSteps;
};
ladder.getSteps = function() {
    return this.steps;
};
ladder.stepUp = function() {
    this.steps += 1;
};
ladder.stepDown = function() {
    if (this.steps > 0) { // Ensure steps don't go below zero
        this.steps -= 1;
    }
};