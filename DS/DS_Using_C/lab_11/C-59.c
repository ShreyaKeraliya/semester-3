#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

int areSame(struct Node *head1, struct Node *head2) {
    while (head1 && head2) {
        if (head1->data != head2->data)
            return 0;
        head1 = head1->next;
        head2 = head2->next;
    }
    return head1 == NULL && head2 == NULL;
}

struct Node* createList(int n) {
    struct Node *head = NULL, *temp = NULL;
    for (int i = 0; i < n; i++) {
        struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
        printf("Enter value: ");
        scanf("%d", &newNode->data);
        newNode->next = NULL;
        if (!head) {
            head = newNode;
            temp = newNode;
        } else {
            temp->next = newNode;
            temp = newNode;
        }
    }
    return head;
}

int main() {
    int n1, n2;
    printf("Enter number of nodes in list 1: ");
    scanf("%d", &n1);
    struct Node *list1 = createList(n1);

    printf("Enter number of nodes in list 2: ");
    scanf("%d", &n2);
    struct Node *list2 = createList(n2);

    if (areSame(list1, list2))
        printf("Lists are same\n");
    else
        printf("Lists are different\n");

    return 0;
}
