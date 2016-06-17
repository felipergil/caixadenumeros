/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodista;

/**
 *
 * @author Felipe Rodrigues Gil - 248543
 */
public class CaixaDeNumeros {

    int[] vetor = new int[15];

    public void vetor() {
        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = (int) (Math.random() * 100);
        }
    }

    public int maiorVetor() {
        int maior = 0;
        for (int x = 0; x < 15; x++) {
            if (vetor[x] > maior) {
                maior = vetor[x];
            }
        }
        return maior;
    }

    public int menorVetor() {
       int menor = vetor[0];
        for (int x = 0; x < 15; x++) {
            if (vetor[x] < menor) {
                menor = vetor[x];
            }
        }
        return menor;
    }

    public int[] listaInvertida() {
        int[] invertido = new int[15];
        int y = 0;
        for (int x = 14; x >= 0; x--) {
            invertido[y] = vetor[x];
            y++;
        }
        return invertido;
    }

    public int mediaDosVetores() {
        int soma = 0;
        for (int x = 0; x < 15; x++) {
            soma += vetor[x];
        }
        return soma / 15;
    }
}
