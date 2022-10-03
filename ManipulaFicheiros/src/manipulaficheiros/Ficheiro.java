package manipulaficheiros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String nome;
        System.out.println("Insira o nome do ficheiro: ");
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
        File ficheiro = new File(nome);
        
        try{
            if(!ficheiro.exists()){
                ficheiro.createNewFile();
            }
            FileWriter fw = new FileWriter(ficheiro);
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

    static void PrintFicheiro() {
        String nome;
        System.out.println("Insira o nome do ficheiro a mostrar: ");
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
        File ficheiro = new File(nome);
        if(!ficheiro.exists()){
            System.out.println("O ficheiro não existe");
        }else{
            
            try {
                FileReader fr = new FileReader(ficheiro);
                BufferedReader br = new BufferedReader(fr);
                while(br.ready()){
                    String linha = br.readLine();
                    System.out.println(linha);
                }
                br.close();
                fr.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }

    static void mostraListaFicheiros() {
        File ficheiro = new File("C:\\Users\\hpaulo\\Desktop\\ProjetoJava\\Ficheiros");
        File [] lista = ficheiro.listFiles();
        for (File lista1 : lista) {
            System.out.println(lista1.getName());
        }

        
    }
    
}
