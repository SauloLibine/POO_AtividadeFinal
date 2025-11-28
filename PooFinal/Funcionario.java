package PooFinal.src;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    // Construtor corrigido: Ordem dos parâmetros alinhada com o super() e com a lógica do Main
    public Funcionario(String nome, String cpf, String email, String cargo, double salario) {
        super(nome, cpf, email); // A classe Pessoa espera (nome, cpf, email)
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}