package exercises.un4.exer1;

import exercises.un4.exer1.Automovel;
import java.util.ArrayList;
import java.util.Scanner;

public class UsaAutomovel {
    static Scanner scan = new Scanner(System.in);
    
    public static void UsaAutomovel(String[] args) {
        ArrayList<Automovel> lista = new ArrayList<Automovel>();
        int opcao = 0;
        
        System.out.println("Bem vindo ao UsaAutomóvel!");
        do {
            opcao = menu(opcao);
            
            switch(opcao) {
                case 1:
                    inserirAuto(lista);
                    break;
                case 2:
                    pesquisarAuto(lista);
                    break;
                case 3:
                    excluirAuto(lista);
                    break;
                case 4:
                    listarAutos(lista);
                    break;
                case 5:
                    System.out.println("Fechando programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Entrada inválida. O programa será encerrado.");
                    System.exit(0);
            }
        } while(true);
    }
    
    private static int menu(int opcao) {
        System.out.println("Favor selecionar procedimento:");
        System.out.println("1. Adicionar automóvel ao sistema");
        System.out.println("2. Pesquisar automóvel");
        System.out.println("3. Excluir automóvel");
        System.out.println("4. Ver todos os automóveis no sistema");
        System.out.println("5. Fechar programa");
        
        opcao = scan.nextInt();
        scan.nextLine();
        return opcao;
    }
    
    private static void pesquisarAuto(ArrayList<Automovel> lista) {
        String pesquisa;
        System.out.print("Favor informar o modelo do carro: ");
        pesquisa = scan.nextLine();
        
        for(Automovel auto : lista) {
            if(auto.getModelo().equalsIgnoreCase(pesquisa)) {
                System.out.println(auto.toString());
            }
        }
    }
    
    private static void inserirAuto(ArrayList<Automovel> lista) {
        
    }
    
    private static void excluirAuto(ArrayList<Automovel> lista) {
        
    }
    
    private static void listarAutos(ArrayList<Automovel> lista) {
        
    }
}