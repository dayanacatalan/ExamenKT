
package examen1;

public class Resta extends Operacion{
Resta(double valor1, double valor2) {
this.valor1 = valor1;
this.valor2 = valor2;}
double calcular(){
double resta= valor1 - valor2;
return (int) resta;}  
}
