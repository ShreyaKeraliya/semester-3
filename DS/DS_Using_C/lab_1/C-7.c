#include <stdio.h>

int main() {
    //declare variables
    int totalDays, years, weeks, days;

    //enter variables
    printf("Enter total number of days: ");
    scanf("%d", &totalDays);

    // claculate years , weeks ,days 
    years = totalDays / 365;
    totalDays %= 365;
    weeks = totalDays / 7;
    days = totalDays % 7;

    //print answer
    printf("%d year(s), %d week(s), and %d day(s)\n", years, weeks, days);

    return 0;
}
