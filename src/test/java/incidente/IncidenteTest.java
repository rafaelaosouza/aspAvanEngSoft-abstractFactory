package incidente;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncidenteTest {

    @Test
    void deveEmitirPlanoIncidenteCritico() {
        FabricaAbstrata fabrica = new FabricaIncidenteCritico();
        Incidente incidente = new Incidente(fabrica);
        assertEquals("Plano de Ação para Incidente Crítico", incidente.emitirPlano());
    }

    @Test
    void deveEmitirPlanoIncidenteBaixo() {
        FabricaAbstrata fabrica = new FabricaIncidenteBaixo();
        Incidente incidente = new Incidente(fabrica);
        assertEquals("Plano de Ação para Incidente de Baixa Severidade", incidente.emitirPlano());
    }

    @Test
    void deveEmitirRelatorioIncidenteCritico() {
        FabricaAbstrata fabrica = new FabricaIncidenteCritico();
        Incidente incidente = new Incidente(fabrica);
        assertEquals("Relatório de Incidente Crítico", incidente.emitirRelatorio());
    }

    @Test
    void deveEmitirRelatorioIncidenteBaixo() {
        FabricaAbstrata fabrica = new FabricaIncidenteBaixo();
        Incidente incidente = new Incidente(fabrica);
        assertEquals("Relatório de Incidente de Baixa Severidade", incidente.emitirRelatorio());
    }

}
