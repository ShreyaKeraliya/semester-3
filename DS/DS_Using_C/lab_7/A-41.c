#include <stdio.h>
#include <ctype.h>
#include <string.h>

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

void infixToPostfix(char *infix, char *postfix) {
    int i = 0, j = 0;
    char c;
    while((c = infix[i++]) != '\0') {
        if(isalnum(c)) postfix[j++] = c;
        else if(c == '(') push(c);
        else if(c == ')') {
            while(top != -1 && peek() != '(')
                postfix[j++] = pop();
            pop(); // remove '('
        }
        else {
            while(top != -1 && precedence(peek()) >= precedence(c))
                postfix[j++] = pop();
            push(c);
        }
    }
    while(top != -1)
        postfix[j++] = pop();
    postfix[j] = '\0';
}

int main() {
    char infix[MAX], postfix[MAX];
    printf("Enter infix expression: ");
    scanf("%s", infix);
    infixToPostfix(infix, postfix);
    printf("Postfix: %s\n", postfix);
    return 0;
}
