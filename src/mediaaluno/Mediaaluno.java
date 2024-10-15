
package mediaaluno;

import java.util.Scanner;


public class Mediaaluno {

    
    public static void main(String[] args) {
        // TODO code application logic here
        float n1,n2,media;
        int opcao;
        
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Digite a primeira nota: ");
            n1 = teclado.nextFloat();
            
            System.out.println("Digite a segunda nota: ");
            n2 = teclado.nextFloat();
            
            media = (n1 + n2)/2;
            
            if(media > 7){
                System.out.println("Aluno Aprovado!");   
            } else{
                System.out.println("Aluno Reprovado");
            }
            System.out.println("Media do aluno é:" +media);
            
            System.out.println("Deseja realizar um novo cálculo? (1-Sim 2-Nao)");
            opcao = teclado.nextInt();
            
        }while(opcao != 2);
           
        
    }
 
}