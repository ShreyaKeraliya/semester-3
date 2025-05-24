#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_NAME 100
#define MAX_PHONE 20

typedef struct Node {
    char name[MAX_NAME];
    char phone[MAX_PHONE];
    struct Node* left;
    struct Node* right;
} Node;

// Create new phone book entry node
Node* newNode(const char* name, const char* phone) {
    Node* node = (Node*)malloc(sizeof(Node));
    strncpy(node->name, name, MAX_NAME);
    strncpy(node->phone, phone, MAX_PHONE);
    node->left = node->right = NULL;
    return node;
}

// Insert entry into BST by name
Node* insert(Node* root, const char* name, const char* phone) {
    if (root == NULL) {
        return newNode(name, phone);
    }
    int cmp = strcmp(name, root->name);
    if (cmp < 0)
        root->left = insert(root->left, name, phone);
    else if (cmp > 0)
        root->right = insert(root->right, name, phone);
    else
        printf("Entry with name \"%s\" already exists.\n", name);
    return root;
}

// Search phone number by name
Node* search(Node* root, const char* name) {
    if (root == NULL)
        return NULL;
    int cmp = strcmp(name, root->name);
    if (cmp == 0)
        return root;
    else if (cmp < 0)
        return search(root->left, name);
    else
        return search(root->right, name);
}

// Find minimum node (used in deletion)
Node* findMinNode(Node* root) {
    while (root && root->left != NULL)
        root = root->left;
    return root;
}

// Delete node by name
Node* deleteNode(Node* root, const char* name) {
    if (root == NULL) {
        printf("Entry \"%s\" not found.\n", name);
        return NULL;
    }

    int cmp = strcmp(name, root->name);
    if (cmp < 0) {
        root->left = deleteNode(root->left, name);
    } else if (cmp > 0) {
        root->right = deleteNode(root->right, name);
    } else {
        // Found node to delete
        if (root->left == NULL) {
            Node* temp = root->right;
            free(root);
            printf("Deleted entry \"%s\".\n", name);
            return temp;
        } else if (root->right == NULL) {
            Node* temp = root->left;
            free(root);
            printf("Deleted entry \"%s\".\n", name);
            return temp;
        } else {
            // Node with two children: get inorder successor (smallest in right subtree)
            Node* temp = findMinNode(root->right);
            strcpy(root->name, temp->name);
            strcpy(root->phone, temp->phone);
            root->right = deleteNode(root->right, temp->name);
        }
    }
    return root;
}

// Inorder traversal (ascending order by name)
void inorder(Node* root) {
    if (root == NULL) return;
    inorder(root->left);
    printf("%s : %s\n", root->name, root->phone);
    inorder(root->right);
}

// Reverse inorder traversal (descending order by name)
void reverseInorder(Node* root) {
    if (root == NULL) return;
    reverseInorder(root->right);
    printf("%s : %s\n", root->name, root->phone);
    reverseInorder(root->left);
}

int main() {
    Node* phoneBook = NULL;
    int choice;
    char name[MAX_NAME];
    char phone[MAX_PHONE];
    Node* result;

    while (1) {
        printf("\nPhone Book Menu:\n");
        printf("1. Add new entry\n");
        printf("2. Remove entry\n");
        printf("3. Search phone number\n");
        printf("4. List entries ascending\n");
        printf("5. List entries descending\n");
        printf("6. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);
        getchar(); // consume newline

        switch (choice) {
            case 1:
                printf("Enter name: ");
                fgets(name, MAX_NAME, stdin);
                name[strcspn(name, "\n")] = 0;  // Remove newline
                printf("Enter phone number: ");
                fgets(phone, MAX_PHONE, stdin);
                phone[strcspn(phone, "\n")] = 0;
                phoneBook = insert(phoneBook, name, phone);
                break;

            case 2:
                printf("Enter name to remove: ");
                fgets(name, MAX_NAME, stdin);
                name[strcspn(name, "\n")] = 0;
                phoneBook = deleteNode(phoneBook, name);
                break;

            case 3:
                printf("Enter name to search: ");
                fgets(name, MAX_NAME, stdin);
                name[strcspn(name, "\n")] = 0;
                result = search(phoneBook, name);
                if (result)
                    printf("Phone number of %s is %s\n", name, result->phone);
                else
                    printf("Entry not found.\n");
                break;

            case 4:
                printf("Phone book entries (Ascending order):\n");
                inorder(phoneBook);
                break;

            case 5:
                printf("Phone book entries (Descending order):\n");
                reverseInorder(phoneBook);
                break;

            case 6:
                printf("Exiting...\n");
                // Free all nodes (not implemented here for brevity)
                exit(0);

            default:
                printf("Invalid choice. Try again.\n");
        }
    }

    return 0;
}
