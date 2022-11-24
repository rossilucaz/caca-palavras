#include<stdio.h>
#include<conio.h>

int n;
int n2;
int resultado;
int r;

int s(n, n2){ // multiplicação 
  resultado =  n * n2;
  return(resultado); 
}

int main(void)
{
  int v, v2, r;
  printf("Digite o primeiro valor:");
  scanf("%d", &v);
  printf("Digite o segundo valor:");
  scanf("%d", &v);
  
  //chama a função e recebe o retorno
  r= multiplica(v,v2);
  
  printf("Resultado = %d\n", r);
  
  getch();
  return 0;
}