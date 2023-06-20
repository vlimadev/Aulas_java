public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1998;
        boolean incluidoNoPlano = false;
        String tipoPlano = "normal";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado!");
        }else {
            System.out.println("é preciso pagar o aluguel!");
        }
    }
}
