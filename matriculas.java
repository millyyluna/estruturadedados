import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Aluno {
    String nome;
    int matricula;
    String dataNascimento;

    public Aluno(String nome, int matricula, String dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Data de Nascimento: " + dataNascimento;
    }
}

public class matriculas {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar todos os alunos");
            System.out.println("3. Pesquisar aluno");
            System.out.println("4. Remover aluno");

            System.out.print("Escolha uma das opções acima: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do aluno: ");
                    String nome = scanner.next();
                    System.out.print("Digite a matrícula do aluno: ");
                    int matricula = Integer.parseInt(scanner.next());
                    System.out.print("Digite a data de nascimento do aluno: ");
                    String dataNascimento = scanner.next();

                    Aluno aluno = new Aluno(nome, matricula, dataNascimento);
                    listaAlunos.add(aluno);
                    break;
                case 2:
                    System.out.println("\nLista de Alunos:");
                    for (Aluno a : listaAlunos) {
                        System.out.println(a);
                    }
                    break;
                case 3:
                    System.out.print("\nDigite a matrícula do aluno que você quer pesquisar: ");
                    int matriculaPesquisa = scanner.nextInt();
                    boolean encontrado = false;
                    for (Aluno a : listaAlunos) {
                        if (a.matricula == matriculaPesquisa) {
                            System.out.println("Aluno que estar encontrado: " + a);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Aluno nao foi encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("\nDigite a matrícula do aluno que deseja remover: ");
                    int matriculaRemover = scanner.nextInt();
                    for (int i = 0; i < listaAlunos.size(); i++) {
                        if (listaAlunos.get(i).matricula == matriculaRemover) {
                            listaAlunos.remove(i);
                            System.out.println("Aluno removido com sucesso.");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma das opções válidas.");
            }
        }
    }
}
