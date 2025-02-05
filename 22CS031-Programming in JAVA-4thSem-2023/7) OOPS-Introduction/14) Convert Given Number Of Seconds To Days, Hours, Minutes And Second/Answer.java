int getDays(int sec) {
    return sec / (24 * 3600);
}
int getHours(int sec) {
    return (sec % (24 * 3600)) / 3600;
}
int getMinutes(int sec) {
    return (sec % 3600) / 60;
}
int getSeconds(int sec) {
    return sec % 60;
}