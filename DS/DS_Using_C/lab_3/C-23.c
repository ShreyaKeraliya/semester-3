#include <stdio.h>
#include <string.h>

int main() {
    int n;
    printf("Enter the number of names: ");
    scanf("%d", &n);

    // Consume the newline left in the buffer
    getchar();

    char names[n][15];  // Array to store n names (each up to 99 chars)

    // Input names
    printf("Enter %d names:\n", n);
    for (int i = 0; i < n; i++) {
        fgets(names[i], sizeof(names[i]), stdin);

        // Remove newline character at the end if present
        names[i][strcspn(names[i], "\n")] = '\0';
    }

    // Sorting using simple bubble sort logic
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (strcmp(names[i], names[j]) > 0) {
                char temp[100];
                strcpy(temp, names[i]);
                strcpy(names[i], names[j]);
                strcpy(names[j], temp);
            }
        }
    }

    // Print sorted names
    printf("\nNames in alphabetical order:\n");
    for (int i = 0; i < n; i++) {
        printf("%s\n", names[i]);
    }

    return 0;
}
