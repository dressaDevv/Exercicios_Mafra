package ex015;

public class Main {
    public static void main(String[] args) {

        Funcionario jose = new Funcionario("José Silva", "Analista",4500);
        System.out.println("Nome do funcionário: " + jose.getNome() + " Cargo: " + jose.getCargo() + " Salário: R$" + jose.getSalario());

        Funcionario vitor = new Funcionario("Vitor Dias", "Dev",8000);
        System.out.println("Nome do funcionário: " + vitor.getNome() + " Cargo: " + vitor.getCargo() + " Salário: R$" + vitor.getSalario());

        Funcionario maria = new Funcionario("Maria Andrade", "Gerente de Projetos",12000);
        System.out.println("Nome do funcionário: " + maria.getNome() + " Cargo: " + maria.getCargo() + " Salário: R$" + maria.getSalario());
    }
}
