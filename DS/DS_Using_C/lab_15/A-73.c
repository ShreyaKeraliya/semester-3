#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

// Create a new node
struct Node* newNode(int data) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->data = data;
    node->prev = NULL;
    node->next = NULL;
    return node;
}

// Insert node at the front
void insertFront(struct Node** head, int data) {
    struct Node* node = newNode(data);
    if (*head == NULL) {
        *head = node;
        return;
    }
    node->next = *head;
    (*head)->prev = node;
    *head = node;
}

// Insert node at the end
void insertEnd(struct Node** head, int data) {
    struct Node* node = newNode(data);
    if (*head == NULL) {
        *head = node;
        return;
    }
    struct Node* curr = *head;
    while (curr->next != NULL) {
        curr = curr->next;
    }
    curr->next = node;
    node->prev = curr;
}

// Delete node at specified position (1-based index)
void deleteAtPosition(struct Node** head, int pos) {
    if (*head == NULL || pos <= 0) {
        printf("Invalid position or empty list.\n");
        return;
    }

    struct Node* curr = *head;

    // If deleting first node
    if (pos == 1) {
        *head = curr->next;
        if (*head != NULL) {
            (*head)->prev = NULL;
        }
        free(curr);
        return;
    }

    // Traverse to the node at pos
    for (int i = 1; curr != NULL && i < pos; i++) {
        curr = curr->next;
    }

    if (curr == NULL) {
        printf("Position out of range.\n");
        return;
    }

    // Update links to remove curr
    if (curr->prev != NULL)
        curr->prev->next = curr->next;
    if (curr->next != NULL)
        curr->next->prev = curr->prev;

    free(curr);
}

// Display all nodes
void display(struct Node* head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }
    struct Node* curr = head;
    printf("List: ");
    while (curr != NULL) {
        printf("%d ", curr->data);
        curr = curr->next;
    }
    printf("\n");
}

int main() {
    struct Node* head = NULL;
    int choice, data, pos;

    while (1) {
        printf("\nMenu:\n");
        printf("1. Insert at front\n");
        printf("2. Delete at position\n");
        printf("3. Insert at end\n");
        printf("4. Display list\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter data to insert at front: ");
                scanf("%d", &data);
                insertFront(&head, data);
                break;

            case 2:
                printf("Enter position to delete: ");
                scanf("%d", &pos);
                deleteAtPosition(&head, pos);
                break;

            case 3:
                printf("Enter data to insert at end: ");
                scanf("%d", &data);
                insertEnd(&head, data);
                break;

            case 4:
                display(head);
                break;

            case 5:
                printf("Exiting...\n");
                // Free memory before exit
                while (head != NULL) {
                    struct Node* temp = head;
                    head = head->next;
                    free(temp);
                }
                return 0;

            default:
                printf("Invalid choice. Try again.\n");
        }
    }
}
