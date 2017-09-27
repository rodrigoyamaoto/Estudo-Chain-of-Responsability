public class DescontoPorVendaCasada implements Desconto {
    private Desconto proximo;
    private boolean lapis = false;
    private boolean caneta = false;

    @Override
    public double calcula(Orcamento orcamento)
    {
        for(Item item: orcamento.getItens()){
            if(item.getNome().equals("LAPIS"))
                lapis = true;
            if(item.getNome().equals("CANETA"))
                caneta = true;
        }

        if(lapis && caneta)
            return orcamento.getValor() * 0.05;
        else
            return proximo.calcula(orcamento);
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximo = desconto;
    }
}
