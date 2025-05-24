#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

#define MAX 100
char stack[MAX];
int top = -1;

void push(char c) {
    stack[++top] = c;
}
char pop() {
    return stack[top--];
}
char peek() {
    return stack[top];
}
int precedence(char op) {
    if(op == '+' || op == '-') return 1;
    if(op == '*' || op == '/') return 2;
    return 0;
}

void reverse(char *expr) {
    int n = strlen(expr);
    for(int i = 0; i < n/2; i++) {
        char temp = expr[i];
        expr[i] = expr[n-i-1];
        expr[n-i-1] = temp;
    }
}

void infixToPrefix(char *infix, char *prefix) {
    reverse(infix);
    for(int i = 0; i < strlen(infix); i++) {
        if(infix[i] == '(') infix[i] = ')';
        else if(infix[i] == ')') infix[i] = '(';
    }
    char postfix[MAX];
    infixToPostfix(infix, postfix);
    reverse(postfix);
    strcpy(prefix, postfix);
}

int main() {
    char infix[MAX], prefix[MAX];
    printf("Enter infix expression: ");
    scanf("%s", infix);
    infixToPrefix(infix, prefix);
    printf("Prefix: %s\n", prefix);
    return 0;
}
