#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

int main() {
    struct Node *node = (struct Node *)malloc(sizeof(struct Node));

    printf("Enter data: ");
    scanf("%d", &node->data);

    node->next = NULL;

    printf("Node data: %d\n", node->data);

    free(node);
    return 0;
}
