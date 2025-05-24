#include <stdio.h>

void sortColors(int nums[], int n) {
    int low = 0, mid = 0, high = n - 1, temp;

    while (mid <= high) {
        if (nums[mid] == 0) {
            // swap nums[low] and nums[mid]
            temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;
        } else if (nums[mid] == 1) {
            mid++;
        } else { // nums[mid] == 2
            // swap nums[mid] and nums[high]
            temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
        }
    }
}

int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int nums[n];
    printf("Enter %d elements (0 for red, 1 for white, 2 for blue):\n", n);
    for (int i = 0; i < n; i++)
        scanf("%d", &nums[i]);

    sortColors(nums, n);

    printf("Sorted colors array:\n");
    for (int i = 0; i < n; i++)
        printf("%d ", nums[i]);
    printf("\n");

    return 0;
}
