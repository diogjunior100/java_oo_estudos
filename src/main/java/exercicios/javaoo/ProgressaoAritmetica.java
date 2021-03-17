
package exercicios.javaoo;


public final class ProgressaoAritmetica {
    static int a0;
    static int n;
    static int termos[];
    static int r;
    static int soma;
    
    ProgressaoAritmetica(int a0, int n, int r){
        this.a0 = a0;
        this.n = n;
        this.r = r;
        this.termos = new int[n];
        calcularPA();
        somaTermos();
    }
    
    void calcularPA(){
        for(int i = 1; i<=n; i++){
            termos[i-1] = a0 + (i-1) * r;
        }    
    }
       
    
    public int somaTermos(){
        soma = 0;
        for(int i = 1; i<=termos.length; i++){
            soma = soma + termos[i];
        }
        return soma;
    }
    
    
}
