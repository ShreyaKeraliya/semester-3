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

// Count total nodes in the list
int countNodes(struct Node* head) {
    int count = 0;
    while (head) {
        count++;
        head = head->next;
    }
    return count;
}

// Swap Kth node from beginning with Kth node from end
void swapKth(struct Node** head, int k) {
    int n = countNodes(*head);
    if (k > n || 2 * k - 1 == n)  // If k is more than number of nodes or kth node from start and end are same
        return;

    struct Node *x = *head, *x_prev = NULL;
    for (int i = 1; i < k; i++) {
        x_prev = x;
        x = x->next;
    }

    struct Node *y = *head, *y_prev = NULL;
    for (int i = 1; i < n - k + 1; i++) {
        y_prev = y;
        y = y->next;
    }

    if (x_prev)
        x_prev->next = y;
    if (y_prev)
        y_prev->next = x;

    struct Node* temp = x->next;
    x->next = y->next;
    y->next = temp;

    if (k == 1)
        *head = y;
    if (k == n)
        *head = x;
}

int main() {
    struct Node* head = NULL;
    // Sample list: 1 2 3 4 5 6 7 8
    for (int i = 1; i <= 8; i++) {
        append(&head, i);
    }

    printf("Original List: ");
    printList(head);

    int k = 3;
    swapKth(&head, k);

    printf("List after swapping %dth node from start and end: ", k);
    printList(head);

    return 0;
}
