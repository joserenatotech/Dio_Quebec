package br.com.quebec;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadora");
        Calculadora cd = new Calculadora();
        cd.som(3, 3);
        Calculadora.sub(3, 3);
        Calculadora.div(3, 3);
        Calculadora.mult(3, 3);

        System.out.println("Mensagem conforme horários: ");

        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(19);

        System.out.println("Empréstimos: ");
        Emprestimo.calcularValorFinal(1000, 3);
        Emprestimo.calcularValorFinal(600, 6);
        Emprestimo.calcularValorFinal(600,3);




    }
}
