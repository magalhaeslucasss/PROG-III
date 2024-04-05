import java.io.*;
import java.util.*;

public class testeVideo {

    
    public static void main(String[] args) {

        String[] testeGamer = new String[8];
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader("video.txt"));
            String linha = bf.readLine();
            boolean tester = false;
            while (linha != null) {
                System.out.println(linha);
                System.out.println("----");
                String[] campos = linha.split(",");
                
                int QuantCampos = campos.length;
                
                while (QuantCampos > 8) {
                    
                    String[] aux = new String[QuantCampos - 1];

                    for (int i = 0; i < 2; i++){
                        aux[i] = campos[i];
                    }


                    for (int i = 1; i < aux.length; i++){
                        if (i+1 == 2) {
                            aux [i] += campos[i + 1];
                        } else {
                            aux[i] = campos [i + 1];
                        }
                    }
                    QuantCampos = aux.length;
                    testeGamer = aux;
                    tester = true;
                    System.out.println(aux.length);
                }
                if (tester) {
                    System.out.println("Code: " + testeGamer[0]);
                    System.out.println("Title: " + testeGamer[1]);
                    System.out.println("Video ID: " + testeGamer[2]);
                    System.out.println("Published At: " + testeGamer[3]);
                    System.out.println("Keyword: " + testeGamer[4]);
                    System.out.println("Likes: " + testeGamer[5]);
                    System.out.println("Comments: " + testeGamer[6]);
                    System.out.println("Views: " + testeGamer[7]);
                } else {
                    System.out.println("Code: " + campos[0]);
                    System.out.println("Title: " + campos[1]);
                    System.out.println("Video ID: " + campos[2]);
                    System.out.println("Published At: " + campos[3]);
                    System.out.println("Keyword: " + campos[4]);
                    System.out.println("Likes: " + campos[5]);
                    System.out.println("Comments: " + campos[6]);
                    System.out.println("Views: " + campos[7]);
                }
                    tester = false;
                
                // Ler a próxima linha
              System.out.println("-------------");
                linha = bf.readLine();
            }
            
            // Fechar o BufferedReader após a conclusão da leitura do arquivo
            bf.close();

        } catch (Exception e) {
            System.out.println("Erro presente: " + e);
        }
    }
}