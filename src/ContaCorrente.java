public class ContaCorrente {
    private long numero;
    private String nome;
    private int agencia;
    private double saldo;

    public void Cadastrar (long num,String nomePessoa, int ag){
        numero = num;
        nome=nomePessoa;
        agencia=ag;
        saldo=0;

    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        if (valor<=saldo)
            saldo = saldo - valor;
        else
        System.out.println("SALDO INSUFICIENTE");
    }

    public double  ConsultarSaldo(){
        return (saldo);

    }
}
