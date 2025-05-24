#include <stdio.h>

int main(){
    //declare variables
    int n;

    //enter n
    printf("ENter Number : ");
    scanf("%d",&n);

    //if reminder 0 -> even
    if (n % 2 == 0)
    {
        printf("%d is even",n);
    }
    //else -> odd
    else
    {
        printf("%d is odd",n);
    }
    return 0;
}
