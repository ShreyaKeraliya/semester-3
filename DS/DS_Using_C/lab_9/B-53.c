#include <stdio.h>

void swap(int *a, int *b) {
    int t = *a;
    *a = *b;
    *b = t;
}

int main() {
    int n;
    printf("Enter size: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter elements:\n");
    for(int i = 0; i < n; i++)
        scanf("%d", arr + i);

    for(int i = 0; i < n - 1; i++)
        for(int j = 0; j < n - i - 1; j++)
            if(*(arr + j) > *(arr + j + 1))
                swap(arr + j, arr + j + 1);

    printf("Sorted elements:\n");
    for(int i = 0; i < n; i++)
        printf("%d ", *(arr + i));
    return 0;
}
