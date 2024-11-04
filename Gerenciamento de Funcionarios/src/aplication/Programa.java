package aplication;

import entities.Funcionario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Definindo o formato da data

        System.out.print("Quantos funcionarios iremos cadastrar? ");
        int cadastro = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>(); // Lista para armazenar os funcionários cadastrados

        for (int i = 0; i < cadastro; i++) {
            sc.nextLine(); // Consumir a linha pendente

            Funcionario funcionario = new Funcionario(); // Cria um novo objeto Funcionario para cada cadastro

            System.out.println("Nome do " + (i + 1) + " Funcionario:");
            String nome = sc.nextLine();
            funcionario.setNome(nome); // Usar o setter para atribuir o nome

            System.out.println("Função do " + (i + 1) + " Funcionario:");
            String funcao = sc.nextLine();
            funcionario.setFuncao(funcao); // Usar o setter para atribuir a função

            System.out.println("Salario do " + (i + 1) + " Funcionario:");
            double salario = sc.nextDouble();
            funcionario.setSalario(salario); // Usar o setter para atribuir o salário

            sc.nextLine(); // Consumir a linha pendente

            System.out.println("Data de admissão do " + (i + 1) + " Funcionario (dd/MM/yyyy): ");
            String dataAdmissaoStr = sc.nextLine();
            LocalDate dataAdmissao = LocalDate.parse(dataAdmissaoStr, formatter);
            funcionario.setDataAdmissao(dataAdmissaoStr); // Usar o setter para atribuir a data de admissão

            funcionarios.add(funcionario); // Adiciona o objeto Funcionario à lista
        }

        // Exibindo opções
        System.out.println("SUAS OPÇÕES: ");
        System.out.println("[1] Ver dados dos funcionarios");
        System.out.println("[2] Atualizar dados dos funcionarios");
        System.out.println("[3] Deletar dados do funcionario");
        System.out.println("[4] Adicionar funcionario");
        System.out.println("[5] Finalizar programa");
        int opcao = sc.nextInt(); // Captura a escolha do usuário

        while (opcao != 5) {

            switch (opcao) {

                case 1: // Ver dados dos funcionários
                    for (Funcionario func : funcionarios) {
                        System.out.println("Nome: " + func.getNome());
                        System.out.println("Função: " + func.getFuncao());
                        System.out.println("Salário: " + func.getSalario());
                        System.out.println("Data de Admissão: " + func.getDataAdmissao());
                        System.out.println("--------------------------");
                    }
                    break;
                case 2: // Atualizar dados
                    System.out.println("Qual funcionário deseja atualizar? (Digite o índice de 1 a " + cadastro + ")");
                    int indice = sc.nextInt() - 1; // Ajusta para índice baseado em 0
                    if (indice >= 0 && indice < funcionarios.size()) {
                        Funcionario funcAtualizar = funcionarios.get(indice);//criando função
                        sc.nextLine(); // Consumir a linha pendente

                        // Atualizar nome
                        System.out.println("Novo nome (atual: " + funcAtualizar.getNome() + "):");
                        String novoNome = sc.nextLine();
                        funcAtualizar.setNome(novoNome);

                        // Atualizar função
                        System.out.println("Nova função (atual: " + funcAtualizar.getFuncao() + "):");
                        String novaFuncao = sc.nextLine();
                        funcAtualizar.setFuncao(novaFuncao);

                        // Atualizar salário
                        System.out.println("Novo salário (atual: " + funcAtualizar.getSalario() + "):");
                        double novoSalario = sc.nextDouble();
                        funcAtualizar.setSalario(novoSalario);

                        sc.nextLine(); // Consumir a linha pendente

                        // Atualizar data de admissão
                        System.out.println("Nova data de admissão (atual: " + funcAtualizar.getDataAdmissao() + "):");
                        String novaDataStr = sc.nextLine();
                        LocalDate novaData = LocalDate.parse(novaDataStr, formatter);
                        funcAtualizar.setDataAdmissao(novaDataStr);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Qual funcionário deseja deletar ? (Digite o índice de 1 a " + cadastro + ")");
                    indice = sc.nextInt() - 1;
                        Funcionario remove = funcionarios.remove(indice);

                    break;
                case 4:

                    break;

                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("SUAS OPÇÕES: ");
            System.out.println("[1] Ver dados dos funcionarios");
            System.out.println("[2] Atualizar dados dos funcionarios");
            System.out.println("[3] Deletar dados do funcionario");
            System.out.println("[4] Finalizar programa");
            opcao = sc.nextInt();
        }
        sc.close();
    }
}

