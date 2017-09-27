public class TesteDesconto {

    public static void main(String[] args){
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento orcamento = new Orcamento(400);
        orcamento.adicionaItem(new Item("LAPIS", 30.0));
        orcamento.adicionaItem(new Item("CANETA", 25.0));
        orcamento.adicionaItem(new Item("POST-IT", 100.0));
        orcamento.adicionaItem(new Item("CADERNO", 250.0));
        orcamento.adicionaItem(new Item("PASTA", 60.0));

        double desconto;

        desconto = calculadoraDeDesconto.calcula(orcamento);
        System.out.println("Valor do desconto: " + desconto);
    }
}
