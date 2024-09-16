#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node* left;
    struct Node* right;
} Node;

Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

void insert(Node** root, int data) {
    if (*root == NULL) {
        *root = createNode(data);
        return;
    }

    if (data < (*root)->data)
        insert(&((*root)->left), data);
    else if (data > (*root)->data)
        insert(&((*root)->right), data);
}

int minValue(Node* root) {
    int minv = root->data;
    while (root->left != NULL) {
        minv = root->left->data;
        root = root->left;
    }
    return minv;
}
void deleteNode(Node** root, int data) {
    if (*root == NULL)
        return;

    if (data < (*root)->data)
        deleteNode(&((*root)->left), data);
    else if (data > (*root)->data)
        deleteNode(&((*root)->right), data);
    else {
        if ((*root)->left == NULL)
            *root = (*root)->right;
        else if ((*root)->right == NULL)
            *root = (*root)->left;
        else {
            (*root)->data = minValue((*root)->right);
            deleteNode(&((*root)->right), (*root)->data);
        }
    }
}

int search(Node* root, int data) {
    if (root == NULL)
        return 0;

    if (root->data == data)
        return 1;

    if (root->data > data)
        return search(root->left, data);
    else
        return search(root->right, data);
}

void printInOrder(Node* root) {
    if (root != NULL) {
        printInOrder(root->left);
        printf("%d ", root->data);
        printInOrder(root->right);
    }
}

int main() {
    Node* root = NULL;
    int choice, data;

    while (1) {
        printf("Binary Search Tree Menu:\n");
        printf("1. Insert a node\n");
        printf("2. Delete a node\n");
        printf("3. Search a node\n");
        printf("4. Print In-Order Traversal\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the data to insert: ");
                scanf("%d", &data);
                insert(&root, data);
                break;
            case 2:
                printf("Enter the data to delete: ");
                scanf("%d", &data);
                deleteNode(&root, data);
                break;
            case 3:
                printf("Enter the data to search: ");
                scanf("%d", &data);
                if (search(root, data))
                    printf("Node found!\n");
                else
                    printf("Node not found!\n");
                break;
            case 4:
                printf("In-Order Traversal: ");
                printInOrder(root);
                printf("\n");
                break;
            case 5:
                exit(0);
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}