package incidente;

public class FabricaIncidenteCritico implements FabricaAbstrata {

    @Override
    public RelatorioIncidente createRelatorioIncidente() {
        return new RelatorioIncidenteCritico();
    }

    @Override
    public PlanoDeAcao createPlanoDeAcao() {
        return new PlanoDeAcaoCritico();
    }
}
