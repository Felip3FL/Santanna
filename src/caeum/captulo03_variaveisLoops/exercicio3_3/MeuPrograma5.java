//Apostila Caelum fj11 captulo 2
/*5) Aumente a quantidade de n�meros que ter�o os fatoriais impressos, at� 20, 30, 40. Em um determinado
momento, al�m desse c�lculo demorar, vai come�ar a mostrar respostas completamente erradas. Porque?
Mude de int para long, e voc� poder� ver alguma mudan�a.*/

package caeum.captulo03_variaveisLoops.exercicio3_3;

public class MeuPrograma5{
	public static void main (String args[]) {
		int n, i = 1;
		long fat;
		
		for (n=1;n<=40;n++){
			
			fat = 1;
			
			for (i = 2; i <= n; i++) {
				
					fat = fat * i;
			}
			
		System.out.println("Fatorial de "+n+" = " + fat);
		
		}
	}
}
