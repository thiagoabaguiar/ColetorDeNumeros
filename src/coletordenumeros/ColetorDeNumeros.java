/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coletordenumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author CS384038
 */
public class ColetorDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroRecebido, contadorDeNumerosRecebidos = 0, somaNumeroRecebidos = 0, qtdNumerosPares = 0, qtdNumerosImpares = 0, numerosAcimaDe100 = 0, mediaNumerosDigitados = 0;

        do {

            numeroRecebido = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Digite um número: <br><em>(0 interrompe)<em></html>"));

            if (numeroRecebido != 0) {
                contadorDeNumerosRecebidos++;
                somaNumeroRecebidos += numeroRecebido;

                if (numeroRecebido % 2 == 0) {
                    qtdNumerosPares++;
                } else {
                    qtdNumerosImpares++;
                }
                
                if (numeroRecebido > 100){
                    numerosAcimaDe100++;
                }
                
                mediaNumerosDigitados = somaNumeroRecebidos / contadorDeNumerosRecebidos;
            };

        } while (numeroRecebido != 0);

        JOptionPane.showMessageDialog(null,
                "<html>"
                + "Total de Números Digitados: " + contadorDeNumerosRecebidos + "<br>"
                + "Soma dos Números Digitados: " + somaNumeroRecebidos + "<br>"
                + "Total de Números Pares: " + qtdNumerosPares + "<br>"
                + "Total de Números Ímpares: " + qtdNumerosImpares + "<br>"
                + "Números acima de 100: " + numerosAcimaDe100 + "<br>"
                + "Média dos Números Digitados: " + mediaNumerosDigitados + "<br>"
                + "</html>");

    }

}
