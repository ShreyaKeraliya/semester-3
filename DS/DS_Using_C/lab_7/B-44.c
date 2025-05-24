#include <stdio.h>
#include <ctype.h>
#include <string.h>

int stack[100], top = -1;

void push(int val) {
    stack[++top] = val;
}
int pop() {
    return stack[top--];
}

int main() {
    char expr[100];
    printf("Enter prefix expression: ");
    scanf("%s", expr);

    int len = strlen(expr);
    for(int i = len - 1; i >= 0; i--) {
        if(isdigit(expr[i])) {
            push(expr[i] - '0');
        } else {
            int a = pop();
            int b = pop();
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
