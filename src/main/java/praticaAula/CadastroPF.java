package praticaAula;

import javax.swing.JOptionPane;

public class CadastroPF {
    
    private PessoaFisica[] pfs;
    
    public CadastroPF(){
        pfs = new PessoaFisica[0];
    }
    
    public PessoaFisica cadastrarPessoaFisica(){
        // ler dados pessoa fisica
        String nome = JOptionPane.showInputDialog("Informe o nome da pessoa fisica");
        String cpf = JOptionPane.showInputDialog("Informe o CPF");
        
        //instanciar pessoa fisica
        
        PessoaFisica temp = new PessoaFisica(nome,cpf);
        
        // armazenar pessoa fisica no repositorio
        PessoaFisica tempPfs[] = new PessoaFisica[pfs.length + 1];
        for (int i = 0; i < pfs.length; i++){
            tempPfs[i] = pfs[i];
        }
        tempPfs[tempPfs.length - 1] = temp;
        pfs = tempPfs;
        
        return temp; //return tempPfs[tempPfs.length - 1];
    }
    
    public PessoaFisica pesquisarPessoaFisica(String cpf){
        
        
    }
    
    public boolean deletarPessoaFisica(PessoaFisica pf){
        
    }
    
    public PessoaFisica editarPessoaFisica(PessoaFisica pf){
        
        
    }
}
