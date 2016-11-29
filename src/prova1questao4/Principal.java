package prova1questao4;
import java.util.Scanner;
/*
 * Voc� escrever� um aplicativo para atribuir assentos em cada v�o da companhia a�rea para somente um avi�o (capacidade: dez assentos).
 * Seu aplicativo deve exibir as seguintes alternativas: �Por favor digite 1 para Primeira Classe e digite 2 para Classe Econ�mica�.
 * Se o usu�rio digitar 1, seu aplicativo deve atribuir assentos na primeira classe (poltronas 1 a 5).
 * Se o usu�rio digitar 2, seu aplicativo deve atribuir um assento na classe econ�mica (poltronas 6 a 10).
 * Em seguida, seu aplicativo deve exibir um cart�o de embarque indicando o n�mero da poltrona da pessoa e se ela est�
 * na primeira classe ou na classe econ�mica. Utilize um array unidimensionaldo tipoprimitivo boolean para representar o 
 * gr�fico de assentos do avi�o. Inicializetodos os elementos do array como false para indicar que todas as poltronas est�o 
 * desocupadas. � medida que cada assento � atribu�do,configure os elementos correspondentes do array com true para indicar 
 * que o assento n�o est� maisdispon�vel. Seu aplicativo nunca deve atribuir uma poltrona que j� foi reservada. 
 * Quando a classe econ�mica estiver lotada, seu aplicativo deve perguntar � pessoa se ela aceita ficar na primeira 
 * classe (e vice-versa). Se sim, fa�a a atribui��o apropriada de assento. Se n�o, exiba a mensagem �O pr�ximo v�o parte em 3 horas�
*/

public class Principal {

    private static Scanner teclado;

	public static void main(String[] args) {
        teclado = new Scanner(System.in);
        Aviao aviao = new Aviao();
        int opcao;

        do {
            System.out.print("Por favor digite 1 para Primeira Classe, digite 2 para Classe Econ�mica e 0 para sair: ");
            opcao = teclado.nextInt();
            if (opcao != 0) {
                aviao.atribuiAssento(opcao);
            }
        } while (opcao != 0);
    }
}