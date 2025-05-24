#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>

// Helper function to sort a string
void sortString(char *str) {
    int len = strlen(str);
    for(int i=0; i<len-1; i++) {
        for(int j=i+1; j<len; j++) {
            if(str[i] > str[j]) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
    }
}

// Convert string to lowercase
void toLowerCase(char *str) {
    for(int i=0; str[i]; i++) {
        str[i] = tolower((unsigned char)str[i]);
    }
}

// Helper function to check anagram
int isAnagram(char *a, char *b) {
    char sortedA[100], sortedB[100];
    strcpy(sortedA, a);
    strcpy(sortedB, b);
    toLowerCase(sortedA);
    toLowerCase(sortedB);
    sortString(sortedA);
    sortString(sortedB);
    return strcmp(sortedA, sortedB) == 0;
}

int main() {
    int n;
    char words[10][100], input[100];
    srand(time(0));

    printf("Enter number of words (max 10): ");
    scanf("%d", &n);

    printf("Enter %d words:\n", n);
    for(int i=0; i<n; i++) {
        scanf("%99s", words[i]);  // Limit input size to avoid buffer overflow
    }

    int index = rand() % n;
    printf("Anagram challenge word: %s\n", words[index]);

    printf("Enter anagram of the word: ");
    scanf("%99s", input);

    if(isAnagram(words[index], input))
        printf("Correct! '%s' is an anagram of '%s'.\n", input, words[index]);
    else
        printf("Incorrect. '%s' is not an anagram of '%s'.\n", input, words[index]);

    return 0;
}
