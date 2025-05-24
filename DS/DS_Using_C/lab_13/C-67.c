#include <stdio.h>
#include <stdlib.h>

// Node structure
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
    while (curr->next) curr = curr->next;
    curr->next = temp;
}

// Print linked list
void printList(struct Node* head) {
    while (head) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

// Calculate gcd of two numbers
int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

// Insert GCD nodes between every pair of adjacent nodes
void insertGCDNodes(struct Node* head) {
    struct Node* curr = head;

    while (curr != NULL && curr->next != NULL) {
        int val1 = curr->data;
        int val2 = curr->next->data;
        int val_gcd = gcd(val1, val2);

        struct Node* gcdNode = newNode(val_gcd);

        // Insert gcdNode between curr and curr->next
        gcdNode->next = curr->next;
        curr->next = gcdNode;

        // Move curr pointer two nodes ahead
        curr = gcdNode->next;
    }
}

int main() {
    struct Node* head = NULL;

    // Input: 18 6 10 3
    append(&head, 18);
    append(&head, 6);
    append(&head, 10);
    append(&head, 3);

    printf("Original List: ");
    printList(head);

    insertGCDNodes(head);

    printf("List after inserting GCD nodes: ");
    printList(head);

    return 0;
}
