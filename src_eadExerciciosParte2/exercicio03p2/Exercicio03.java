package exercicio03p2;

import java.util.Scanner;

//  3) Fa�a um algoritmo que leia um vetor de n�meros inteiros (20 posi��es) e
//  mostre o vetor ordenado (crescente).
//  Depois, dado um n�mero inteiro qualquer, pesquise o mesmo no vetor,
//  informando se foi encontrado ou n�o.
public class Exercicio03 {

    static int v[] = new int[20];
    static Scanner teclado = new Scanner(System.in);

    public static void leitura() {
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "� n�mero: ");
            v[i] = teclado.nextInt();
        }
    }

    public static void ordena() {
        int aux;

        for (int i = 0; i <= 18; i++) {
            for (int j = i + 1; j <= 19; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    public static void mostra() {
        System.out.println();
        for (int i = 0; i <= 19; i++) {
            System.out.print(v[i] + "  ");
        }
        System.out.println();
        System.out.println();
    }

    // Retorna o valor -1 caso n�o encontre o elemento no vetor,
    // ou ent�o retorna a posi��o, caso encontre o elemento no vetor.
    public static int busca(int x) {
        int idx = -1;
        for (int i = 0; i <= 19; i++) {
            if (v[i] == x) {
                idx = i;
            }
        }
        return (idx);
    }

    public static void pesquisa() throws Exception {
        int n, idx;

        System.out.print("Deseja pesquisar um n�mero (S/N)? ");
        char opcao = (char) System.in.read();
        while (Character.toUpperCase(opcao) == 'S') {
            System.out.println();
            System.out.print("Digite um n�mero: ");
            n = teclado.nextInt();
            System.out.println();
            idx = busca(n);
            if (idx == -1) {
                System.out.println("N�mero N�O encontrado!");
            } else {
                System.out.println("N�mero " + n + " encontrado na posi��o " + idx);
            }
            System.out.println();
            System.out.print("Deseja pesquisar outro n�mero (S/N)? ");
            opcao = (char) System.in.read();
        }
    }

    public static void main(String[] args) throws Exception {
        leitura();
        ordena();
        mostra();
        pesquisa();
    }
}