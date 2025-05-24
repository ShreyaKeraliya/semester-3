#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ARRAY_SIZE 20
#define NUM_VALUES 15

// Hash function as per problem
int hashFunc(int x) {
    return (x % 18) + 2;
}

// Insert value into hash table with linear probing
void insert(int hashTable[], int value) {
    int index = hashFunc(value);
    int originalIndex = index;
    int i = 0;

    while (hashTable[index] != -1) { // collision detected
        index = (originalIndex + i) % ARRAY_SIZE;
        i++;
        if (i == ARRAY_SIZE) {
            printf("Hash Table full! Cannot insert %d\n", value);
            return;
        }
    }
    hashTable[index] = value;
}

// Display hash table
void display(int hashTable[]) {
    printf("Hash Table contents:\n");
    for (int i = 0; i < ARRAY_SIZE; i++) {
        if (hashTable[i] == -1)
            printf("Index %d: Empty\n", i);
        else
            printf("Index %d: %d\n", i, hashTable[i]);
    }
}

int main() {
    int hashTable[ARRAY_SIZE];
    for (int i = 0; i < ARRAY_SIZE; i++)
        hashTable[i] = -1;  // initialize with -1 indicating empty

    srand(time(NULL));
    int count = 0;

    printf("Inserting 15 random values:\n");
    while (count < NUM_VALUES) {
        int val = (rand() % 900000) + 100000; // random between 100000 and 999999
        // Check for duplicates in hashTable before insertion (optional)
        int duplicate = 0;
        for (int j = 0; j < ARRAY_SIZE; j++) {
            if (hashTable[j] == val) {
                duplicate = 1;
                break;
            }
        }
        if (!duplicate) {
            printf("%d ", val);
            insert(hashTable, val);
            count++;
        }
    }
    printf("\n\n");

    display(hashTable);

    return 0;
}
