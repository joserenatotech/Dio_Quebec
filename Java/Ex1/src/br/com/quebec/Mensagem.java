package br.com.quebec;

public class Mensagem {
    
    public static void obterMensagem(int hora) {
        switch(hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                bomdia();
            break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            boatarde();
                 break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 01:
            case 02:
            case 03:
            case 04:
            boanoite();
            break;
        }

        
    }
    public static void bomdia(){
            System.out.println("Bom dia");
    }
    public static void boanoite(){
        System.out.println("Boa noite");
    }
    public static void boatarde(){
        System.out.println("Boa tarde");
    }
}
