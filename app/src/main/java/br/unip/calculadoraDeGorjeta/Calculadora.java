package br.unip.calculadoraDeGorjeta;

public class Calculadora {
    /**
     * Calcula o valor de uma gorjeta dado o percentual
     * do valor total da conta.
     * @param valor Valor total da conta
     * @param percentual Percentual usado para calcular a gorjeta
     * @return O valor da gorjeta
     */
    static double gorjeta(double valor, double percentual){
        return valor * percentual / 100.0;
    }

    /**
     * Calcula os valores padrão de gorjetas dado o valor
     * total da conta.
     * @param valor Valor total da conta
     * @return Um vetor de três posições com as gorjetas de 5%, 10% e 15%
     */
    static double [] gorjeta(double valor){
        double [] saida = new double[3];
        for (int i = 0; i < 3; i++){
            saida[i] = gorjeta(valor, i * 5 + 5);
        }
        return saida;
    }
}
