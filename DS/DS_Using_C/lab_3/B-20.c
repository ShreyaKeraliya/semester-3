#include <stdio.h>

int main() {
    int n, isDuplicate = 0;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];

    // Enter array elements
    printf("Enter %d numbers:\n", n);
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    // Check for duplicates
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                isDuplicate = 1;
                break;
            }
        }
        if (isDuplicate) break;
    }

    if (isDuplicate)
        printf("The array contains duplicate numbers.");
    else
        printf("The array does not contain duplicate numbers.");

    return 0;
}
