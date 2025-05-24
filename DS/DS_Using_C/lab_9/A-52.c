#include <stdio.h>

int main() {
    int n;
    printf("Enter size: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter elements:\n");
    for(int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    int *ptr = arr;
    int max = *ptr;

    for(int i = 1; i < n; i++)
        if(*(ptr + i) > max)
            max = *(ptr + i);

    printf("Largest element: %d\n", max);
    return 0;
}
