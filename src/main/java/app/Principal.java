/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;
import praticaAula.CadastroPF;


public class Principal {
    public static void main(String[] args) {
        CadastroPF cadPf;
        
        cadPf = new CadastroPF();
        
        menu();
    }
    
    public void menu(){
        String menu = "Informe a opção desejada: \n"
                + "1 - Cadastrar Pessoa Fisica\n"
                + "2 - Pesquisar Pessoa Fisica \n"
                + "3 - Editar Pessoa Fisica \n"
                + "4 - Deletar pessoa Fisica \n"
                + "0 - Sair\n";
        String strOpcao = JOptionPane.showInputDialog(menu);
        
        int opcao = Integer.parseInt(strOpcao);
        
        switch(opcao){
            case 1: {
                cad
                JOptionPane.showMessageDialog(null, "Implementar cadastro PF");
                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, "Implementar pesquisa PF");
                break;
            }
            case 3: {
                JOptionPane.showMessageDialog(null, "Implementar edicao PF");
                break;
            }
            case 4: {
                JOptionPane.showMessageDialog(null, "Implementar remocao PF");
                break;
            }
            case 0: {
                JOptionPane.showMessageDialog(null, "Implementar saida programa");
                
            }
            default:
                JOptionPane.showMessageDialog(null, "Numero não identificado");
        }
    }
     
}
