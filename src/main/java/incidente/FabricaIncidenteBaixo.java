package incidente;

public class FabricaIncidenteBaixo implements FabricaAbstrata {

    @Override
    public RelatorioIncidente createRelatorioIncidente() {
        return new RelatorioIncidenteBaixo();
    }

    @Override
    public PlanoDeAcao createPlanoDeAcao() {
        return new PlanoDeAcaoBaixo();
    }
}
