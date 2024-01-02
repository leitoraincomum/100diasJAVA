public class ContaCorrente {
    String numero, agencia;
    boolean especial;
    double limiteEspecial, saldo;
    
    boolean realizarSaque(double quantiaASacar){        
        //tem saldo na conta
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificar saldo do limite especial  
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }    
    }//realizarSaque
    
    void depositar(double valorDepositado){       
        saldo += valorDepositado;
    }//depositar
    
    void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo); 
    }//consultarSaldo
    
    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }//verificarUsoChequeEspecial
    
}//feito 17/11/2023
