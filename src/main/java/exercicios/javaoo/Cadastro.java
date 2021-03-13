
package exercicios.javaoo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cadastro {
    int ano,
        idade;
    String nome;

    Cadastro() {
        
    }
    
    Scanner sc = new Scanner(System.in);
    
    void cadastrarDados(){
        System.out.println("Diga seu ano: ");
	ano = sc.nextInt();
        nome = sc.next();
        
    }

    void imprimirDados() {
        System.out.println("Esse e o seu nome " + nome);
        
        idade = 2021 - ano;
        System.out.println("Esse e o sua idade " + idade);
    }
    
        
    
}
