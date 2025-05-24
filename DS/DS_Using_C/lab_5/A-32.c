#include <stdio.h>

int main() {
    int a[3][2], b[2][3], result[3][3] = {0};

    printf("Enter elements of 3x2 matrix:\n");
    for(int i=0; i<3; i++)
        for(int j=0; j<2; j++)
            scanf("%d", &a[i][j]);

    printf("Enter elements of 2x3 matrix:\n");
    for(int i=0; i<2; i++)
        for(int j=0; j<3; j++)
            scanf("%d", &b[i][j]);

    // Multiply matrices
    for(int i=0; i<3; i++)
        for(int j=0; j<3; j++)
            for(int k=0; k<2; k++)
                result[i][j] += a[i][k] * b[k][j];

    printf("Product of the matrices:\n");
    for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++)
            printf("%d ", result[i][j]);
        printf("\n");
    }

    return 0;
}
