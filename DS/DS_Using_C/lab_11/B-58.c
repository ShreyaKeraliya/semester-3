#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

int countCircularList(struct Node *head) {
    if (head == NULL)
        return 0;
    int count = 1;
    struct Node *temp = head->next;
    while (temp != head) {
        count++;
        temp = temp->next;
    }
    return count;
}

int main() {
    struct Node *head = NULL, *tail = NULL;
    int n, val;
    printf("Enter number of nodes: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
        printf("Enter value: ");
        scanf("%d", &newNode->data);
        newNode->next = NULL;
        if (head == NULL) {
            head = newNode;
            tail = newNode;
        } else {
            tail->next = newNode;
            tail = newNode;
        }
    }
    if (tail) tail->next = head; // Make it circular
    printf("Total nodes in circular list: %d\n", countCircularList(head));
    return 0;
}
