package ex014;

public class Main {
    public static void main(String[] args) {

        Curso edFisica = new Curso("Ed. Física", 0178264.7);
        System.out.println("Curso: " + edFisica.nome + " Codigo: " + edFisica.codigo);



        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas", 0184562.2);
        System.out.println("Curso: " + ads.nome + " Codigo: " + ads.codigo);



        Curso direito = new Curso("Direito", 0194612.3);
        System.out.println("Curso: " + direito.nome + " Codigo: " + direito.codigo);


    }
}
