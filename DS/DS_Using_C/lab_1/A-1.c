#include <stdio.h>
#define PI 3.14159

int main() {
    //declare variables
    float radius, area;

    //enter radius
    printf("Enter the radius of the circle: ");
    scanf("%f", &radius);

    // calculate area of circle 
    area = PI * radius * radius;

    //print area 
    printf("Area of the circle is: %.2f\n", area);

    return 0;
}
