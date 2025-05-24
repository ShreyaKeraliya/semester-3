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
    while (curr->next != NULL)
        curr = curr->next;
    curr->next = temp;
}

// Print the list
void printList(struct Node* head) {
    while (head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

// Remove duplicates from sorted linked list
void removeDuplicates(struct Node* head) {
    struct Node* curr = head;
    while (curr != NULL && curr->next != NULL) {
        if (curr->data == curr->next->data) {
            struct Node* temp = curr->next;
            curr->next = curr->next->next;
            free(temp);
        } else {
            curr = curr->next;
        }
    }
}

int main() {
    struct Node* head = NULL;

    // Input: 1 1 6 13 13 13 27 27
    append(&head, 1);
    append(&head, 1);
    append(&head, 6);
    append(&head, 13);
    append(&head, 13);
    append(&head, 13);
    append(&head, 27);
    append(&head, 27);

    printf("Original List: ");
    printList(head);

    removeDuplicates(head);

    printf("List after removing duplicates: ");
    printList(head);

    return 0;
}
