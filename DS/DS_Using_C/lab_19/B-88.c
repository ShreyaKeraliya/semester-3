#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TABLE_SIZE 10
#define MAX_KEY_LEN 50
#define MAX_VAL_LEN 50

typedef struct Node {
    char key[MAX_KEY_LEN];
    char value[MAX_VAL_LEN];
    struct Node* next;
} Node;

Node* hashTable[TABLE_SIZE];

// Simple hash function for strings (djb2)
unsigned int hashFunc(const char* str) {
    unsigned long hash = 5381;
    int c;
    while ((c = *str++))
        hash = ((hash << 5) + hash) + c;
    return hash % TABLE_SIZE;
}

// Create new node
Node* createNode(const char* key, const char* value) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    strncpy(newNode->key, key, MAX_KEY_LEN);
    strncpy(newNode->value, value, MAX_VAL_LEN);
    newNode->next = NULL;
    return newNode;
}

// Insert key-value into hash table
void insert(const char* key, const char* value) {
    unsigned int index = hashFunc(key);
    Node* head = hashTable[index];

    // Check if key exists, update value
    Node* curr = head;
    while (curr) {
        if (strcmp(curr->key, key) == 0) {
            strncpy(curr->value, value, MAX_VAL_LEN);
            printf("Updated key \"%s\" with new value \"%s\"\n", key, value);
            return;
        }
        curr = curr->next;
    }

    // Insert new node at head of chain
    Node* newNode = createNode(key, value);
    newNode->next = head;
    hashTable[index] = newNode;
    printf("Inserted key \"%s\" with value \"%s\"\n", key, value);
}

// Search for value by key
char* search(const char* key) {
    unsigned int index = hashFunc(key);
    Node* curr = hashTable[index];
    while (curr) {
        if (strcmp(curr->key, key) == 0)
            return curr->value;
        curr = curr->next;
    }
    return NULL;
}

// Delete key-value by key
void deleteKey(const char* key) {
    unsigned int index = hashFunc(key);
    Node* curr = hashTable[index];
    Node* prev = NULL;

    while (curr) {
        if (strcmp(curr->key, key) == 0) {
            if (prev == NULL) {
                hashTable[index] = curr->next;
            } else {
                prev->next = curr->next;
            }
            free(curr);
            printf("Deleted key \"%s\"\n", key);
            return;
        }
        prev = curr;
        curr = curr->next;
    }
    printf("Key \"%s\" not found\n", key);
}

// Display all entries
void display() {
    printf("Dictionary entries:\n");
    for (int i = 0; i < TABLE_SIZE; i++) {
        Node* curr = hashTable[i];
        if (curr) {
            printf("Index %d:\n", i);
            while (curr) {
                printf("  %s : %s\n", curr->key, curr->value);
                curr = curr->next;
            }
        }
    }
}

int main() {
    // Initialize hash table
    for (int i = 0; i < TABLE_SIZE; i++)
        hashTable[i] = NULL;

    insert("apple", "fruit");
    insert("carrot", "vegetable");
    insert("python", "language");
    insert("java", "coffee");
    insert("java", "programming language"); // update

    display();

    char* val = search("python");
    if (val)
        printf("Value for key \"python\": %s\n", val);
    else
        printf("Key \"python\" not found\n");

    deleteKey("carrot");
    deleteKey("banana");

    display();

    return 0;
}
