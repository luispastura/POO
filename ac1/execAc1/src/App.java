public class App {

    public static void main(String[] args) throws Exception {
        calcMedia(8.0, 9.5, 7.0);
        impMetodo();
        diaSemana(5);
        ePrimo(45, 0);
        eBissexto(2016);

    }

    public static void calcMedia(double ap1, double ap2, double ac){
        double media = (ap1 + ap2) * 0.4 + ac * 0.2;
        System.out.println(media);
    }

    public static void impMetodo(){
        for(int i = 150; i <= 200; i++){
            System.out.println(i);
        }
    }

    public static void ePrimo (int x, int i){
        for (i = 2; i < x ; i++) {
            if (x % 1 == 0) {
                System.out.println("nao é primo");
                break;

            }else{
                System.out.println("é primo");
            }
        }

    }


    public static void diaSemana(int dia){
        switch (dia){
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda-feira");
            break;
            case 3:
            System.out.println("Terç-feira");
            break;
            case 4:
            System.out.println("Quarta-feira");
            break;
            case 5:
            System.out.println("Quinta-feira");
            break;
            case 6:
            System.out.println("Sexta-feira");
            break;
            case 7:
            System.out.println("Sábado");
            break;
            default:
            System.out.println("Dia Inválido");
        }
    }
    public static void eBissexto(int ano) {
        int ver1, ver4, ver400;
        ver1 = ano % 100;
        ver4 = ano % 4;
        ver400 = ano % 400;
        if (ver4 > 0) {
            System.out.println("O ano não é bissexto.");
        } else if (ver1 == 0) {
            if (ver400 == 0) {
                System.out.println("O ano é bissexto.");
            } else {
                System.out.println("O ano não é bissexto.");
            }
        } else {
            System.out.println("O ano é bissexto.");
        }
    }
}
