public class DescontoPorMaisDeQuinhentosReais implements  Desconto{

    private Desconto proximo;

    @Override
    public double calcula(Orcamento orcamento) {
        if(orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        }
        else{
            return proximo.calcula(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximo = desconto;
    }
}
