package manipulaficheiros;

import java.io.File;

class Ficheiro {

    static void criaFicheiro() {
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
        for(int x = 0;x<lista.length;x++){
            System.out.println(lista[x].getName());
        }

        
    }
    
}
