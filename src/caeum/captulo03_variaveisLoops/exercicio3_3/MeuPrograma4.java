//Apostila Caelum fj11 captulo 2
/*4) Imprima os fatoriais de 1 a 10.
O fatorial de um n�mero n � n * n-1 * n-2 ... at� n = 1. Lembre-se de utilizar os par�nteses.
O fatorial de 0 � 1
O fatorial de 1 � (0!) * 1 = 1
O fatorial de 2 � (1!) * 2 = 2
O fatorial de 3 � (2!) * 3 = 6
O fatorial de 4 � (3!) * 4 = 24
Fa�a um for que inicie uma vari�vel n (n�mero) como 1 e fatorial (resultado) como 1 e varia n de 1 at� 10:
for (int n = 1, fatorial = 1; n <= 10; n++) {
} */

package caeum.captulo03_variaveisLoops.exercicio3_3;

public class MeuPrograma4{
	public static void main (String args[]) {
		int n, i, fat = 1;
		
		for (n=1;n<=10;n++){
			
			fat = 1;
			
			for (i = 2; i <= n; i++) {
				
					fat = fat * i;
			}
			
		System.out.println("Fatorial de "+n+" = " + fat);
		
		}
	}
}