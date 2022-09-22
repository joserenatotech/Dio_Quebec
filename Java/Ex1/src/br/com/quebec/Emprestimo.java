package br.com.quebec;

public class Emprestimo {
    

    public static int duasParcelas(){
        return 2;
    }
    public static int tresParcelas(){
        return 3;
    }

    public static double taxaTresParcelas(){
        return 0.3;
    }

    public static double taxaSeisParcelas(){
        return 0.6;
    }

    public static void calcularValorFinal(int valor,double parcelas){
        if(parcelas == 3){
            double valorFinal = valor + (valor * taxaTresParcelas());
            System.out.println("Valor:R$"+valor+ " *Parcelamento em 3x - Valor Total:R$"+valorFinal);
        }else {
            if(parcelas == 6){
                double valorFinal = valor + (valor * taxaSeisParcelas());
                System.out.println("Valor:R$"+valor+ " *Parcelamento em 6x - Valor Total:R$"+valorFinal);
            } else{
                System.out.println("Parcelamento Indisponivel...");
            }
        }
    }
}
