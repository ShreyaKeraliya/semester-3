#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* newNode(int data) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->data = data;
    node->next = NULL;
    return node;
}

void append(struct Node** head, int data) {
    struct Node* temp = newNode(data);
    if (*head == NULL) {
        *head = temp;
        return;
    }
    struct Node* curr = *head;
    while (curr->next) curr = curr->next;
    curr->next = temp;
}

void printList(struct Node* head) {
    while (head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

struct Node* copyList(struct Node* head) {
    if (head == NULL) return NULL;
    struct Node* newHead = newNode(head->data);
    newHead->next = copyList(head->next);
    return newHead;
}

int main() {
    struct Node* original = NULL;
    append(&original, 10);
    append(&original, 20);
    append(&original, 30);
    append(&original, 40);

    printf("Original List: ");
    printList(original);

    struct Node* copied = copyList(original);
    printf("Copied List: ");
    printList(copied);

    return 0;
}
