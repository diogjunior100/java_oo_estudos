
package exercicio3;

import static exercicio3.Triangulo.area;
import static exercicio3.Triangulo.h;
import static exercicio3.Triangulo.l1;
import static exercicio3.Triangulo.l2;
import static exercicio3.Triangulo.l3;
import static exercicio3.Triangulo.perimetro;
import static exercicio3.Quadrado.l4;     

import java.util.Scanner;


public class principalApp2 {
    public static void main(String[] args) {
        
        int opcaoEscolhida = 0;
		do {
			Scanner sc = new Scanner(System.in);
			
			String menu = "Menu de opcoes \n"
					    + "============== \n\n"
					    + "1 - Triangulo \n"
					    + "2 - Quadrado \n"
					    + "3 - Retangulo";
			System.out.println(menu);
			opcaoEscolhida = sc.nextInt();
			
			
			switch (opcaoEscolhida) {
			case 1: {
				acessoTriangulo();
				break;
			}
			case 2: {
				acessoQuadrado();
				break;
			}
                        case 3: {
                                acessoRetangulo();
                                break;
                        }
			default:
			}
		} while (opcaoEscolhida != 0);
        
    }

    private static void acessoTriangulo() {
        
        Scanner sc = new Scanner(System.in);
        Triangulo tr = new Triangulo(l1,l2,l3,h);
        
        l1 = sc.nextInt();
        l2 = sc.nextInt();
        l3 = sc.nextInt();
        
        System.out.println("Altura ");
        h = sc.nextInt();
        
        perimetro = l1+l2+l3;
        area = (l3*h)/2;
        
        System.out.println("Perimetro: " + perimetro 
                            + "Area" + area);
        
    }
    
    private static void acessoQuadrado() {
        
        Scanner sc = new Scanner(System.in);
        Quadrado qd = new Quadrado(l1,l2,l3,h);
        
        l1 = sc.nextInt();
        l2 = sc.nextInt();
        l3 = sc.nextInt();
        l4 = sc.nextInt();
        
        perimetro = l1+l2+l3+l4;
        
        System.out.println("Perimetro: " + perimetro);
        
        
    }
    
       private static void acessoRetangulo() {
        
        Scanner sc = new Scanner(System.in);
        Retangulo rt = new Retangulo(l1,l2,l3,l4);
        
        l1 = sc.nextInt();
        l2 = sc.nextInt();
        l3 = sc.nextInt();
        l4 = sc.nextInt();
        
        perimetro = l1+l2+l3+l4;
        
        System.out.println("Perimetro: " + perimetro);
        
        
    }
        
   }

