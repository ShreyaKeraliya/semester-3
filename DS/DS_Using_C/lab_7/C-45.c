#include <stdio.h>

int isPossible(int *a, int n) {
    int stack[100], top = -1, next = 1;
    for(int i = 0, bIdx = 0; bIdx < n;) {
        if(top != -1 && stack[top] == next) {
            top--;
            bIdx++;
            next++;
        } else if(i < n) {
            stack[++top] = a[i++];
        } else {
            return 0;
        }
    }
    return 1;
}

int main() {
    int T;
    scanf("%d", &T);
    while(T--) {
        int n, a[100];
        scanf("%d", &n);
        for(int i = 0; i < n; i++) scanf("%d", &a[i]);
        if(isPossible(a, n))
            printf("YES\n");
        else
            printf("NO\n");
    }
    return 0;
}
