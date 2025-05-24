#include <stdio.h>

int main() {
    //declare variables
    int a, b, c;

    //enter all ther variables
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    // check if a is largest
    if (a >= b && a >= c){
        printf("%d is the largest.\n", a);
    }
    // check if b is largest
    else if (b >= a && b >= c){
        printf("%d is the largest.\n", b);
    }
    //else c is largest 
    else{
        printf("%d is the largest.\n", c);
    }
    return 0;
}
