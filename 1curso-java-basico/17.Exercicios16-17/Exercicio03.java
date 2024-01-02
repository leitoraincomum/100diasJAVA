import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        /*3. Faça um programa que leia e valide as seguintes informações:
        a. Nome: maior que 3 caracteres;
        b. Idade: entre 0 e 150;
        c. Salário: maior que zero;
        d. Sexo: 'f' ou 'm';
        e. Estado Civil: 's', 'c', 'v', 'd';*/
        System.out.println("** Validacao de dados de cadastro **");
        Scanner scan = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        double salario;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = scan.next();

        while(nome.length() <= 3){
            System.out.println("Digite um nome com mais de tres caracteres: ");
            nome = scan.next();
        }

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        while(idade < 0 || idade > 150){
            System.out.println("Digite uma idade de 0 a 150 anos: ");
            idade = scan.nextInt();
        }

        System.out.println("Digite um salario: ");
        salario = scan.nextDouble();

        while(salario < 0){
            System.out.println("Digite um salario maior que zero: ");
            salario = scan.nextDouble();
        }

        boolean infoInvalido = false;

        do{

            System.out.println("Digite sexo F - feminino ou M - masculino");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
                infoInvalido = true;
            } else{
                System.out.println("Sexo precisa ser f - feminino ou m - masculino");
            }

        }while(!infoInvalido);

        infoInvalido = false;
        do{
            
            System.out.println("Digite o  seu estado civil \nS - solteiro / C - casado / V - viuvo / D - divorciado");
            estadoCivil = scan.next();
            
            if(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || 
            estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){
                infoInvalido = true;
            } else{
                System.out.println("Estado civil precisa ser s, c, v e d");
            }

        }while(!infoInvalido);
        
        System.out.println("Nome : " +  nome + "\nIdade: " + idade +
        "\nSalario: " + salario + "\nSexo: " + sexo + "\nEstado Civil: " + estadoCivil);

        /*Exemplo Loiane
          boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        do {
            
            System.out.println("Entre com o nome:");
            
            nome = scan.next();
            
            if (nome.length() >= 3){
                infoValida = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {
            
            System.out.println("Entre com a idade:");
            
            idade = scan.nextInt();
            
            if (idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o salário:");
            
            salario = scan.nextDouble();
            
            if (salario > 0){
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o sexo:");
            
            sexo = scan.next();
            
            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!infoValida);
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o estado civil:");
            
            estadoCivil = scan.next();
            
            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!infoValida);
        
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
         */
    
    }
}//revisado 31/10/2023