public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();//Cria o objeto chamdo c1 do tipo Conta Corrente
        c1.Cadastrar(123,"Anna",789);
        c1.depositar(1000);
        System.out.println("SALDO:"+c1.ConsultarSaldo());
        c1.sacar(50);
        System.out.println("SALDO:"+c1.ConsultarSaldo());

    }
}