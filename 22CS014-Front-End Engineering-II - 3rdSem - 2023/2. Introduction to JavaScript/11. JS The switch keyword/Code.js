function printMessage(input) {
    let message;
    switch (input) {
        case 1:
            message = 'Hi there!';
            break;
        case 2:
            message = 'How are you?';
            break;
        case 3:
            message = "I hope you're doing great!";
            break;
        case 4:
            message = 'How may I help you?';
            break;
        case 5:
            message = 'Thanks for visiting us.';
            break;
        default:
            message = 'Wrong number entered!';
            break;
    }
    return message;
}