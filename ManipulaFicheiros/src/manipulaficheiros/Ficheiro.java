package manipulaficheiros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
        String nome;
        System.out.println("Insira o nome do ficheiro a criar: ");
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
        File ficheiro = new File(nome);
        if(!ficheiro.exists()){
                System.out.println("O ficheiro não existe");
            }else{
                System.out.println("O ficheiro existe");
        }  
    }

    static void escreveNoFinal() {
        String nome;
        System.out.println("Insira o nome do ficheiro: ");
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
        File ficheiro = new File(nome);
        
        try{
            if(!ficheiro.exists()){
                ficheiro.createNewFile();
            }
            FileWriter fw = new FileWriter(ficheiro, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String texto;
            System.out.println("Insira o conteúdo: ");
            texto = ManipulaFicheiros.ler.nextLine();
            texto = ManipulaFicheiros.ler.nextLine();
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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
