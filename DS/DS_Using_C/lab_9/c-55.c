#include <stdio.h>

struct Student {
    int roll_no;
    char name[50];
    char branch[50];
    int batch_no;
};

int main() {
    struct Student s;
    struct Student *ptr = &s;

    printf("Enter roll no: ");
    scanf("%d", &ptr->roll_no);
    printf("Enter name: ");
    scanf("%s", ptr->name);
    printf("Enter branch: ");
    scanf("%s", ptr->branch);
    printf("Enter batch no: ");
    scanf("%d", &ptr->batch_no);

    printf("\n--- Student Details ---\n");
    printf("Roll No: %d\n", ptr->roll_no);
    printf("Name: %s\n", ptr->name);
    printf("Branch: %s\n", ptr->branch);
    printf("Batch No: %d\n", ptr->batch_no);

    return 0;
}
