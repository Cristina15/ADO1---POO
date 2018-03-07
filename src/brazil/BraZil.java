package brazil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vitoria cristina TADS B - ADO 1 Professor nunca lemos arquivos nem
 * mesclamos nada, não temos um exemplo nem experiência, como você QUER QUE
 * FAÇAMOS ALGO QUE NÃO TEMOS IDÉIA??? Não queria perder um ponto por ser burra.
 */
public class BraZil {

    public static void main(String[] args) {

        String arquivo1 = "C:\\Users\\vitoria.csilva15\\Documents\\NetBeansProjects\\BraZil\\src\\brazil\\pib.txt";
        String arquivo2 = "C:\\Users\\vitoria.csilva15\\Documents\\NetBeansProjects\\BraZil\\src\\brazil\\regioes.txt";

        String linhaTemp = null;

        /*      ------------------------------------- */
 /*      Abertura de arquivo e loop de leitura */
 /*      ------------------------------------- */
        try {
            FileReader fileReader = new FileReader(arquivo1);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // loop por cada linha do arquivo
            while ((linhaTemp = bufferedReader.readLine()) != null) {
                System.out.println(linhaTemp);
            }

            // feche o arquivo
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + arquivo1 + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + arquivo1 + "'");
        }

        /*      ------------------------------------- */
 /*      Exemplo de escrita em arquivo         */
 /*      ------------------------------------- */
        String saida = "saida.txt";

        try {

            FileWriter fileWriter = new FileWriter(saida);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("pib da regiao São Paulo = 1349 ");
            bufferedWriter.newLine();
            bufferedWriter.write("pib da regiao  =  %%% ");

            // feche o arquivo
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Erro de escrita em '" + saida + "'");
        }

    }
}
