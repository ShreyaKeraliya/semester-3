#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

// Create new node
struct Node* newNode(int data) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->data = data;
    node->next = NULL;
    return node;
}

// Append node to end of list
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

// Print linked list
void printList(struct Node* head) {
    while (head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

// Swap pairs of nodes by changing links (not values)
struct Node* swapPairs(struct Node* head) {
    if (!head || !head->next)
        return head;

    struct Node* newHead = head->next;
    struct Node* prev = NULL;
    struct Node* curr = head;

    while (curr != NULL && curr->next != NULL) {
        struct Node* nextPair = curr->next->next;
        struct Node* second = curr->next;

        // Swap current pair
        second->next = curr;
        curr->next = nextPair;

        if (prev != NULL) {
            prev->next = second;
        }

        // Update prev and curr pointers
        prev = curr;
        curr = nextPair;
    }

    return newHead;
}

int main() {
    struct Node* head = NULL;

    // Input: 1 2 3 4 5 6 7 8
    for (int i = 1; i <= 8; i++) {
        append(&head, i);
    }

    printf("Original List: ");
    printList(head);

    head = swapPairs(head);

    printf("List after swapping pairs: ");
    printList(head);

    return 0;
}
