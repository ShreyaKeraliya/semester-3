#include <stdio.h>

int main() {
    int n, sum = 0;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter numbers:\n");
    for(int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    int *ptr = arr;
    for(int i = 0; i < n; i++)
        sum += *(ptr + i);

    printf("Sum = %d\n", sum);
    return 0;
}
