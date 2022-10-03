package manipulaficheiros;

import java.io.File;
import java.io.IOException;

class Ficheiro {

    static void criaFicheiro() {
        String nome;
        System.out.println("Insira o nome do ficheiro a criar: ");
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
        File ficheiro = new File(nome);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    static void verificaSeExiste() {
    }

    static void escreveNoFinal() {
    }

    static void escreveFicheiroNovo() {
    }

    static void PrintFicheiro() {
    }

    static void mostraListaFicheiros() {
        File ficheiro = new File("C:\\Users\\hpaulo\\Desktop\\ProjetoJava\\Ficheiros");
        File [] lista = ficheiro.listFiles();
        for (File lista1 : lista) {
            System.out.println(lista1.getName());
        }

        
    }
    
}
