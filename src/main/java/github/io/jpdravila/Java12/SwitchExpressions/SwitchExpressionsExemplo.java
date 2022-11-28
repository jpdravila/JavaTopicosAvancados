package github.io.jpdravila.Java12.SwitchExpressions;

import java.util.Scanner;

public class SwitchExpressionsExemplo {

    public static void main(String[] args) {
        System.out.println("Digite o dia da semana: ");
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();
        sc.close();

        String resultado ="";
        /*switch (dia){
            case "segunda":
                resultado = "dia útil";
                break;

            case "terça":
                resultado = "dia útil";
                break;

            case "quarta":
                resultado = "dia útil";
                break;

            case "quinta":
                resultado = "dia útil";
                break;

            case "sexta":
                resultado = "dia útil";
                break;

            case "sabado":
                resultado = "dia útil";
                break;

            case "domingo":
                resultado = "dia não útil";
                break;

            default:
                resultado = "error";
        }

        System.out.println(resultado);*/


        resultado = switch (dia){
            case "segunda", "terca", "quarta", "quinta", "sexta", "sabado" -> "dia útil";
            case "domingo" -> "dia não útil";

            default -> "Validation Error";

        };

        System.out.println(resultado);


    }

}
