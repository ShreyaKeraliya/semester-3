#include <stdio.h>

int main() {
    //declare variables
    int totalSeconds, hours, minutes, seconds;

    //enter variables
    printf("Enter total seconds: ");
    scanf("%d", &totalSeconds);

    //claculate hours , minutes, seconds
    hours = totalSeconds / 3600;
    totalSeconds %= 3600;
    minutes = totalSeconds / 60;
    seconds = totalSeconds % 60;

    //print answer
    printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);

    return 0;
}
