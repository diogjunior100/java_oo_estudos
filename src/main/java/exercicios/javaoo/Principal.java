
package exercicios.javaoo;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Principal {
    static int posicaoLivre = 0;
    static ProgressaoAritmetica[] progressoes;
    
    
  
    
    public static void main(String[] args) {
        
        progressoes = new ProgressaoAritmetica[10];
        
        int opcaoEscolhida = 0;
        do{
           Scanner sc = new Scanner(System.in);
           
           String menu = "1 - cadastrar \n"
                   + "2 - imprimir existentes \n"
                   + "0 - Sair \n";
           System.out.println(menu);
           opcaoEscolhida = sc.nextInt();
           
           switch(opcaoEscolhida){
                case 1: {
                   cadastrarPA();
                   break;
                }
                case 2: {
                   imprimirPA();         
                   break;
                }
                default:
           }
                   
                       
           
        } while(opcaoEscolhida != 0);
    }
    
    static void imprimirPA(){
        for (int i=0; i < progressoes.length; i++) {
			if (progressoes[i] != null) {
				String resposta = "PA[ " + i + " ]\n";
				resposta += "A0: " + progressoes[i].a0 + '\n';
				resposta += "N: " + progressoes[i].n + '\n'; 
				resposta += "R: " + progressoes[i].r + '\n';
                                resposta += "PA: " + Arrays.toString(progressoes[i].termos) + '\n';
				System.out.println(resposta);
				System.out.println("---------------");
			}
		}
    }
    
    static void cadastrarPA(){
        String A0 = JOptionPane.showInputDialog("Diga o a0");
        String N = JOptionPane.showInputDialog("Diga o n");
        String R = JOptionPane.showInputDialog("Diga o r");
        
        int a0 = Integer.parseInt(A0);
        int n = Integer.parseInt(N);
        int r = Integer.parseInt(R);
        
        ProgressaoAritmetica pa = new ProgressaoAritmetica(a0, n, r);
        progressoes[posicaoLivre] = pa;
        posicaoLivre++;
        
       
        
        
    }
}
