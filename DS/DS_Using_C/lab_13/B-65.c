#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

// Create a new node
struct Node* newNode(int data) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->data = data;
    node->next = NULL;
    return node;
}

// Append node at the end
void append(struct Node** head, int data) {
    struct Node* temp = newNode(data);
    if (*head == NULL) {
        *head = temp;
        return;
    }
    struct Node* curr = *head;
    while (curr->next)
        curr = curr->next;
    curr->next = temp;
}

// Print the list
void printList(struct Node* head) {
    while (head) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

// Bubble sort the linked list by swapping node data
void sortList(struct Node* head) {
    if (!head) return;
    struct Node *i, *j;
    int temp;
    for (i = head; i != NULL; i = i->next) {
        for (j = i->next; j != NULL; j = j->next) {
            if (i->data > j->data) {
                // Swap data values
                temp = i->data;
                i->data = j->data;
                j->data = temp;
            }
        }
    }
}

int main() {
    struct Node* head = NULL;

    // Example input: 10 2 33 4 25
    append(&head, 10);
    append(&head, 2);
    append(&head, 33);
    append(&head, 4);
    append(&head, 25);

    printf("Original List: ");
    printList(head);

    sortList(head);

    printf("Sorted List: ");
    printList(head);

    return 0;
}
