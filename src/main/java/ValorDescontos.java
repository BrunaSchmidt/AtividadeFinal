public class ValorDescontos {


    public double descontar10(double valorSemDesconto) {
        double desconto10 = 10;

        double desconto = (valorSemDesconto * desconto10) / 100;
        double valorComDesconto = valorSemDesconto - desconto;

        return valorComDesconto;

    }

    public String descontar20(double valorSemDesconto) {
        double desconto20 = 20;

        double desconto = (valorSemDesconto * desconto20) / 100;
        double valorComDesconto = valorSemDesconto - desconto;
        String label = null;

        return null;
    }

    public double descontar30(double valorSemDesconto) {
        double desconto20 = 30;

        double desconto = (valorSemDesconto * desconto20) / 100;
        double valorComDesconto = valorSemDesconto - desconto;
        System.out.println(valorComDesconto);

        return valorComDesconto;
    }

    public boolean descontoFixo(double valorSemDesconto) {

        if (valorSemDesconto >= 150) {
            double desconto35 = 35;

            double desconto = (valorSemDesconto * desconto35) / 100;
            double valorComDesconto = valorSemDesconto - desconto;

            return true;

        }else if(valorSemDesconto <= 0){
            double desconto = 0;


        }return false;

    }
}



