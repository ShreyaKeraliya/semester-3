#include <stdio.h>

int main() {
    char ch;
    //enter ch
    printf("Enter a character: ");
    scanf(" %c", &ch);  

    //check if vowel -> print vowel
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        printf("%c is a vowel.\n", ch);
    }
    // else -> print not vowel 
    else {
        printf("%c is not a vowel.\n", ch);
    }

    return 0;
}
