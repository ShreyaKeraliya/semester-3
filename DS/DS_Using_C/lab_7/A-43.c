#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>

int stack[100], top = -1;

void push(int val) {
    stack[++top] = val;
}
int pop() {
    return stack[top--];
}

int main() {
    char expr[100];
    printf("Enter postfix expression: ");
    scanf("%s", expr);

    for(int i = 0; expr[i] != '\0'; i++) {
        if(isdigit(expr[i])) {
            push(expr[i] - '0');
        } else {
            int b = pop();
            int a = pop();
            switch(expr[i]) {
                case '+': push(a + b); break;
                case '-': push(a - b); break;
                case '*': push(a * b); break;
                case '/': push(a / b); break;
            }
        }
    }
    printf("Result = %d\n", pop());
    return 0;
}
