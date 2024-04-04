import java.io.*;

public class testeVideo {

    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/main/java/videoTeste.txt"));
            String linha = bf.readLine();

            while (linha != null) {
                System.out.println(linha);
                System.out.println("----");
                String[] campos = linha.split(",");

                System.out.println("Code: " + campos[0]);
                System.out.println("Title: " + campos[1]);
                System.out.println("Video ID: " + campos[2]);
                System.out.println("Published At: " + campos[3]);
                System.out.println("Keyword: " + campos[4]);
                System.out.println("Likes: " + campos[5]);
                System.out.println("Comments: " + campos[6]);
                System.out.println("Views: " + campos[7]);
                if (campos.length > 8) {
                    System.out.println("Esse campo não podia existir: " + campos[8]);
                }

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
