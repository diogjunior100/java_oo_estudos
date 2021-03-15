
package exercicio2;

import java.util.Scanner;

import javax.swing.JOptionPane;

import static exercicio2.cadastroApp.nome;
import static exercicio2.cadastroApp.ano;

public class principalApp {
    
    static cadastroApp[] cadastros;
    static int posicaoLivre;
    
    
    public static void main(String[] args) {
        
        cadastros = new cadastroApp[10];
        posicaoLivre = 0;
        
        int opcaoEscolhida = 0;
		do {
			Scanner sc = new Scanner(System.in);
			
			String menu = "Menu de opcoes \n"
					    + "============== \n\n"
					    + "1 - Cadastrar PA \n"
					    + "2 - Imprimir PAs existentes \n"
					    + "0 - Sair";
			System.out.println(menu);
			opcaoEscolhida = sc.nextInt();
			
			
			switch (opcaoEscolhida) {
			case 1: {
				cadastrar();
				break;
			}
			case 2: {
				imprimir();
				break;
			}
			default:
			}
		} while (opcaoEscolhida != 0);
	}
    
        private static void imprimir() {
		for (int i=0; i < cadastros.length; i++) {
			if (cadastros[i] != null) {
				String resposta = "PA[ " + i + " ]\n";
				resposta += "Nome: " + cadastros[i].nome + '\n';
				resposta += "ano: " + cadastros[i].ano + '\n'; 
				System.out.println(resposta);
				System.out.println("---------------");
			}
		}
	}
        
        static void cadastrar() {
            
		Scanner sc = new Scanner(System.in);
                cadastroApp ca = new cadastroApp(nome, ano);
                
                nome = sc.next();
                ano = sc.nextInt();
                        
		
		//instanciar um objeto do tipo ProgressaoAritmetica
		cadastros[posicaoLivre] = ca;
		posicaoLivre++;
	}
    }
