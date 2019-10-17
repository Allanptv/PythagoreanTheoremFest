#include <stdio.h>
#include <math.h>

void main(){
    printf("Hello HacktoberFest!\n");
    printf("Digite o valor do primeiro cateto: ");
    int cat1;
    scanf("%d", &cat1);
    printf("Digite o valor do segundo cateto: ");
    int cat2;
    scanf("%d", &cat2);
    printf("hello");

    int hip = sqrt((cat1*cat1)+(cat2*cat2));
    printf("O valor da hipotenusa eh: %d", hip);

}
