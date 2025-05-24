#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

// Create new node
struct Node* newNode(int data) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->data = data;
    node->prev = NULL;
    node->next = NULL;
    return node;
}

// Append node at end
void append(struct Node** head, int data) {
    struct Node* node = newNode(data);
    if (*head == NULL) {
        *head = node;
        return;
    }
    struct Node* curr = *head;
    while (curr->next)
        curr = curr->next;
    curr->next = node;
    node->prev = curr;
}

// Display the list
void display(struct Node* head) {
    struct Node* curr = head;
    printf("List: ");
    while (curr) {
        printf("%d ", curr->data);
        curr = curr->next;
    }
    printf("\n");
}

// Delete alternate nodes starting from second node
void deleteAlternateNodes(struct Node** head) {
    if (*head == NULL)
        return;

    struct Node* curr = *head;
    struct Node* nextNode;

    while (curr != NULL && curr->next != NULL) {
        nextNode = curr->next;

        // Remove nextNode
        curr->next = nextNode->next;
        if (nextNode->next != NULL) {
            nextNode->next->prev = curr;
        }

        free(nextNode);

        // Move curr to next valid node
        curr = curr->next;
    }
}

int main() {
    struct Node* head = NULL;

    // Sample input list
    int arr[] = {10, 20, 30, 40, 50, 60};
    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < n; i++) {
        append(&head, arr[i]);
    }

    printf("Original List:\n");
    display(head);

    deleteAlternateNodes(&head);

    printf("List after deleting alternate nodes:\n");
    display(head);

    // Free list memory
    while (head != NULL) {
        struct Node* temp = head;
        head = head->next;
        free(temp);
    }

    return 0;
}
