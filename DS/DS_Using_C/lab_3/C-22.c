#include <stdio.h>

// Function for factorial
int factorial(int n) {
    int fact = 1;
    for (int i = 2; i <= n; i++)
        fact *= i;
    return fact;
}

// Function for nCr
int nCr(int n, int r) {
    return factorial(n) / (factorial(r) * factorial(n - r));
}

int main() {
    int rows;

    // Enter the number of rows
    printf("Enter the number of rows for Pascal's Triangle: ");
    scanf("%d", &rows);

    // Generate Pascal's Triangle
    for (int i = 0; i < rows; i++) {
        // Print spaces 
        for (int space = 0; space < rows - i - 1; space++)
            printf("  ");

        // Print values
        for (int j = 0; j <= i; j++) {
            printf("%4d", nCr(i, j));
        }

        printf("\n");
    }

    return 0;
}
