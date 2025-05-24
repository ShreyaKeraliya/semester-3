#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

// Create new node
struct Node* newNode(int data) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->data = data;
    node->left = node->right = NULL;
    return node;
}

// Insert node into BST
struct Node* insert(struct Node* root, int data) {
    if (root == NULL)
        return newNode(data);
    if (data < root->data)
        root->left = insert(root->left, data);
    else if (data > root->data)
        root->right = insert(root->right, data);
    return root;
}

// Find minimum element (leftmost node)
int findMin(struct Node* root) {
    if (root == NULL) {
        printf("BST is empty.\n");
        return -1; // or some error code
    }
    struct Node* curr = root;
    while (curr->left != NULL)
        curr = curr->left;
    return curr->data;
}

// Find maximum element (rightmost node)
int findMax(struct Node* root) {
    if (root == NULL) {
        printf("BST is empty.\n");
        return -1; // or some error code
    }
    struct Node* curr = root;
    while (curr->right != NULL)
        curr = curr->right;
    return curr->data;
}

int main() {
    struct Node* root = NULL;

    // Sample data
    int arr[] = {50, 30, 20, 40, 70, 60, 80};
    int n = sizeof(arr) / sizeof(arr[0]);

    // Insert nodes
    for (int i = 0; i < n; i++) {
        root = insert(root, arr[i]);
    }

    int minVal = findMin(root);
    int maxVal = findMax(root);

    printf("Minimum element in BST: %d\n", minVal);
    printf("Maximum element in BST: %d\n", maxVal);

    return 0;
}
