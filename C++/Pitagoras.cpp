#include <iostream>
#include<cmath>
using namespace std;

int main(){
    
    cout << "Hello HacktoberFest!\n";


    int cat1;
    cout << "Digite o valor do primeiro cateto: ";
    cin >> cat1; 

    int cat2;
    cout << "Digite o valor do segundo cateto: ";
    cin >> cat2; 

    int hipotenusa = sqrt((cat1*cat1)+(cat2*cat2));





    cout << "O valor da hipotenusa eh:  "; 
    cout << hipotenusa;


return 0;
}