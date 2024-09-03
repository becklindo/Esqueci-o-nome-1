import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] usuarios = {
            {"admin", "admin123"},
            {"financeiro", "fin123"},
            {"cliente", "cliente123"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
        boolean usuarioEncontrado = false;
        for (String[] usuario : usuarios) {
            if (usuario[0].equals(login)) {
                usuarioEncontrado = true;
                if (usuario[1].equals(senha)) {
                    switch ("login") {
                        case "admin":
                            System.out.println("Bem-vindo, administrador! Acesso total concedido.");
                            break;
                        case "financeiro":
                            System.out.println("Bem-vindo, financeiro! Acesso às finanças concedido.");
                            break;
                        case "cliente":
                            System.out.println("Bem-vindo, cliente! Acesso à sua conta concedido.");
                            break;
                    }
                } else {
                    System.out.println("Senha errada.");
                }
                break;
            }
        }
        if (!usuarioEncontrado) {
            System.out.println("Usuário não encontrado.");
        Scanner.close("");

        }

    }