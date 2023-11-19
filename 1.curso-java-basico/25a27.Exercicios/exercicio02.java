public class exercicio02 {
    /*2. Cria uma classe para representar uma conta corrente que possui um número, 
    um saldo, um status que informa se ela é especial ou não, um limite. 
    Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), 
    despositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial
    ou não. Desenvolva um programa para testar essa classe. */
    public static void main(String[] args){
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        
        System.out.println("Saldo da conta " + conta.numero + ": " + conta.saldo);
        
        boolean saqueEfetuado = conta.realizarSaque(10);
        
        if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso!"); 
           conta.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque. Saldo insuficiente!"); 
        }
        
        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("\n** Tentativa de saque de 500 reais **"); 
        if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso!"); 
           conta.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque. Saldo insuficiente!"); 
        }
        
        System.out.println("\n** Deposito de 500 reais **"); 
        conta.depositar(500);
        conta.consultarSaldo();
        
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial!"); 
        } else {
            System.out.println("Nao esta usando cheque especial!"); 
        }
        
        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial!"); 
        } else {
            System.out.println("Nao esta usando cheque especial!"); 
        }
    }
}//feito 17/11/2023