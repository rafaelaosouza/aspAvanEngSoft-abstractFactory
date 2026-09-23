package incidente;

public class Incidente {

    private RelatorioIncidente relatorio;
    private PlanoDeAcao plano;

    public Incidente (FabricaAbstrata fabrica) {
        this.relatorio = fabrica.createRelatorioIncidente();
        this.plano = fabrica.createPlanoDeAcao();
    }

    public String emitirRelatorio() {
        return this.relatorio.emitir();
    }

    public String emitirPlano() {
        return this.plano.emitir();
    }
}
