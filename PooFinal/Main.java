package PooFinal.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Socio> socios = new ArrayList<>();
        List<Convidado> convidados = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar sócio");
            System.out.println("2 - Adicionar convidados");
            System.out.println("3 - Listar sócios");
            System.out.println("4 - Listar convidados");
            System.out.println("5 - Remover sócio");
            System.out.println("6 - Adicionar funcionário");
            System.out.println("7 - Listar funcionários");
            System.out.println("8 - Remover funcionário");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1; // Força cair no default se não for número
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Sócio ---");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    
                    int numeroSocio = 0;
                    try {
                        System.out.print("Número do Sócio: ");
                        numeroSocio = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido! Definido como 0.");
                    }
                    
                    System.out.print("Plano: ");
                    String plano = sc.nextLine();

                    try {
                        Socio novoSocio = new Socio(nome, cpf, email, numeroSocio, plano);
                        socios.add(novoSocio);
                        System.out.println("Sócio cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar sócio: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n--- Adicionar Convidado ---");
                    System.out.print("Nome: ");
                    String nomeC = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpfC = sc.nextLine();
                    System.out.print("Email: ");
                    String emailC = sc.nextLine();
                    System.out.print("Data da Visita: ");
                    String dataVisita = sc.nextLine();

                    try {
                        Convidado novoConvidado = new Convidado(nomeC, cpfC, emailC, dataVisita);
                        convidados.add(novoConvidado);
                        System.out.println("Convidado adicionado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao adicionar convidado: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("\n--- Lista de Sócios ---");
                    if (socios.isEmpty()) System.out.println("Nenhum sócio cadastrado.");
                    for (Socio socio : socios) {
                        System.out.println(socio); // Usa o toString()
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Convidados ---");
                    if (convidados.isEmpty()) System.out.println("Nenhum convidado cadastrado.");
                    for (Convidado convidado : convidados) {
                        System.out.println(convidado); // Agora funcionará com o toString() adicionado
                    }
                    break;

                case 5:
                    System.out.print("Digite o CPF do sócio a ser removido: ");
                    String cpfRemover = sc.nextLine();
                    boolean removeuS = socios.removeIf(socio -> socio.getCpf().equals(cpfRemover));
                    if (removeuS) System.out.println("Sócio removido com sucesso.");
                    else System.out.println("CPF não encontrado.");
                    break;

                case 6:
                    System.out.println("\n--- Adicionar Funcionário ---");
                    System.out.print("Nome: ");
                    String nomeF = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpfF = sc.nextLine();
                    System.out.print("Email: "); // Faltava pedir o email no original
                    String emailF = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    
                    double salario = 0.0;
                    try {
                        System.out.print("Salário: ");
                        salario = Double.parseDouble(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido! Definido como 0.0");
                    }

                    try {
                        // Ordem corrigida: Nome, CPF, Email, Cargo, Salario
                        Funcionario novoFuncionario = new Funcionario(nomeF, cpfF, emailF, cargo, salario);
                        funcionarios.add(novoFuncionario);
                        System.out.println("Funcionário adicionado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao adicionar funcionário: " + e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("\n--- Lista de Funcionários ---");
                    if (funcionarios.isEmpty()) System.out.println("Nenhum funcionário cadastrado.");
                    for (Funcionario funcionario : funcionarios) {
                        System.out.println(funcionario); // Usa o toString()
                    }
                    break;

                case 8:
                    System.out.print("Digite o CPF do funcionário a ser removido: ");
                    String cpfRemoverF = sc.nextLine();
                    boolean removeuF = funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpfRemoverF));
                    if (removeuF) System.out.println("Funcionário removido com sucesso.");
                    else System.out.println("CPF não encontrado.");
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        sc.close();
    }
}