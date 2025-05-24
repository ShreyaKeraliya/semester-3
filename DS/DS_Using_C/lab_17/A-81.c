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

// Utility to find index of a value in array from start to end
int findIndex(int arr[], int start, int end, int val) {
    for (int i = start; i <= end; i++) {
        if (arr[i] == val) return i;
    }
    return -1;
}

// Recursive function to construct tree from preorder and postorder arrays
struct Node* constructTree(int preorder[], int postorder[], int* preIndex, int postStart, int postEnd, int size) {
    if (*preIndex >= size || postStart > postEnd)
        return NULL;

    struct Node* root = newNode(preorder[*preIndex]);
    (*preIndex)++;

    if (postStart == postEnd || *preIndex >= size)
        return root;

    // Find the next preorder element in postorder to separate left and right subtree
    int index = findIndex(postorder, postStart, postEnd, preorder[*preIndex]);

    if (index != -1) {
        root->left = constructTree(preorder, postorder, preIndex, postStart, index, size);
        root->right = constructTree(preorder, postorder, preIndex, index + 1, postEnd - 1, size);
    }

    return root;
}

// Inorder traversal to verify tree construction
void inorder(struct Node* root) {
    if (root == NULL) return;
    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}

int main() {
    int preorder[] = {1, 2, 4, 5, 3, 6, 7};
    int postorder[] = {4, 5, 2, 6, 7, 3, 1};
    int size = sizeof(preorder) / sizeof(preorder[0]);
    int preIndex = 0;

    struct Node* root = constructTree(preorder, postorder, &preIndex, 0, size - 1, size);

    printf("Inorder traversal of constructed tree: ");
    inorder(root);
    printf("\n");

    return 0;
}
