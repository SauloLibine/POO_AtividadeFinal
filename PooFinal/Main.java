package PooFinal.src;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Socio> socios = new ArrayList<>();
        List<Convidado> convidados = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
        int opcao;

do{
    system.out.println("Digite a opção desejada:");
    system.out.println("1-Cadastrar sócio");
    system.out.println("2-Adicionar convidados");
    system.out.println("3-Listar sócios");
    system.out.println("4-Listar convidados");
    system.out.println("5-Remover sócio");
    system.out.println("6-adicionar funcionário");
    system.out.println("7-Listar funcionários");
    system.out.println("8-Remover funcionário");
    system.out.println("0-Sair");

switch (opcao) {
    case 1:
        // código para cadastrar sócio
        System.out.println("Cadastro de sócio");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Número do Sócio: ");
        int numeroSocio = Integer.parseInt(sc.nextLine());
        System.out.print("Plano: ");
        String plano = sc.nextLine();

        try{
            Socio novoSocio = new Socio(nome, cpf, email, numeroSocio, plano);
            socios.add(novoSocio);
            system.out.println("Sócio cadastrado com sucesso!");
        } catch (Exception e) {
            system.out.println("Erro ao cadastrar sócio: " + e.getMessage());
        }
        break;
    case 2:
        // código para adicionar convidados
        System.out.println("Adicionar convidado");
        System.out.print("Nome: ");
        String nomeC = sc.nextLine();
        System.out.print("CPF: ");
        String cpfC = sc.nextLine();
        System.out.print("Email: ");
        String emailC = sc.nextLine();
        System.out.print("Data da Visita: ");
        String dataVisita = sc.nextLine();

        try{
            Convidado novoConvidado = new Convidado(nomeC, cpfC, emailC, dataVisita);
            convidados.add(novoConvidado);
            system.out.println("Convidado adicionado com sucesso!");
        } catch (Exception e) {
            system.out.println("Erro ao adicionar convidado: " + e.getMessage());
        }
        break;
    case 3:
        // código para listar sócios
        System.out.println("Lista de Sócios:");
        for (Socio socio : socios) {
            system.out.println(socio);
        }
        break;
    case 4:
        System.out.println("Lista de Convidados:");
        for (Convidado convidado : convidados) {
            system.out.println(convidado);
        }
        break;
    case 5:
        // código para remover sócio
        System.out.print("Digite o CPF do sócio a ser removido: ");
        String cpfRemover = sc.nextLine();
        socios.removeIf(socio -> socio.getCpf().equals(cpfRemover));
        system.out.println("Sócio removido, se o CPF existia na lista.");
        break;
    case 6:
        System.out.println("Adicionar funcionário");
        System.out.print("Nome: ");
        String nomeF = sc.nextLine();
        System.out.print("CPF: ");
        String cpfF = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Salário: ");
        double salario = Double.parseDouble(sc.nextLine());
        try{
            Funcionario novoFuncionario = new Funcionario(nomeF, cpfF, cargo, salario);
            funcionarios.add(novoFuncionario);
            system.out.println("Funcionário adicionado com sucesso!");
        } catch (Exception e) {
            system.out.println("Erro ao adicionar funcionário: " + e.getMessage());
        }
        break;
    case 7:
        // código para listar funcionários
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            system.out.println(funcionario);
        }
        break;
    case 8:
        // código para remover funcionário
        System.out.print("Digite o CPF do funcionário a ser removido: ");
        String cpfRemoverF = sc.nextLine();
        funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpfRemoverF));
        system.out.println("Funcionário removido, se o CPF existia na lista.");
        break;
    case 0:
        system.out.println("Saindo do programa...");
        break;
    default:
        system.out.println("Opção inválida. Tente novamente.");
}
} while (opcao != 0);
sc.close();
}
}