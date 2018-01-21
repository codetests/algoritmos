#include <iostream>

void printArray(int values[]);

int main(int, char**)
{
    int values[10] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    printArray(values);

    bool troca = true;
    int aux;
    while (troca) {
        troca = false;
        for (int i = 0; i < 10 - 1; i++) {
            if (values[i] > values[i + 1]) {
                aux = values[i];
                values[i] = values[i + 1];
                values[i + 1] = aux;
                troca = true;
            }
        }
    }

    printArray(values);
}

void printArray(int values[]) {

    static char x[80] = { 0 };
    
    std::cout << "Array: ";

    for (int i = 0; i < 10; i++) {

        std::cout << values[i] << " ";
     }
    
    std::cout << std::endl;
}
