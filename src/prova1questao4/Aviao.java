package prova1questao4;

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

import java.util.Scanner;

public class Aviao {

    Scanner teclado = new Scanner(System.in);
    private boolean[] poltronas = new boolean[10];
    private int ptrPrimeira = -1;
    private int ptrSegunda = 4;

    public Aviao() {
        for (int i = 0; i < 10; i++) {
            poltronas[i] = false;
        }
    }

    public void atribuiAssento(int classe) {
        if (classe == 1) {
            atribuiPrimeira();
        } else {
            atribuiSegunda();
        }
    }

    private void atribuiPrimeira() {
        if (ptrPrimeira < 4) {
            poltronas[++ptrPrimeira] = true;
            System.out.println("Cart�o de embarque: " + (ptrPrimeira + 1) + " - Primeira Classe.");
        } else {
            if (ptrSegunda == 9) {
                System.out.println("Classe econ�mica tamb�m est� lotada!!!");
            } else {
                System.out.print("Primeira Classe lotada, deseja sentar na classe econ�mica? ");
                if (teclado.next().equalsIgnoreCase("s")) {
                    atribuiSegunda();
                } else {
                    System.out.println("O pr�ximo v�o parte em 3 horas!");
                }
            }
        }
    }

    private void atribuiSegunda() {
        if (ptrSegunda < 9) {
            poltronas[++ptrSegunda] = true;
            System.out.println("Cart�o de embarque: " + (ptrSegunda + 1) + " - Segunda Classe.");
        } else {
            if (ptrPrimeira == 4) {
                System.out.println("Primeira Classe tamb�m est� lotada!!!");
            } else {
                System.out.print("Classe Econ�mica lotada, deseja sentar na primeira classe? ");
                if (teclado.next().equalsIgnoreCase("S")) {
                    atribuiPrimeira();
                } else {
                    System.out.println("O pr�ximo v�o parte em 3 horas!");
                }
            }
        }
    }
}