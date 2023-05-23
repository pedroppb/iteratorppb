package iteratorppb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EstatisticaTest {

        @Test
        void deveContarPecasComDesconto() {
            Computador computador = new Computador(
                    new Peca("ryzen 5 5600", 1000,400),
                    new Peca("A520 itx ac",  700,0),
                    new Peca("2x 3600", 800,560),
                    new Peca("rtx 3060 ti", 2500,1200),
                    new Peca("fonte 500w tr2",300,0)
            );
            assertEquals(3, Estatistica.contarPecasComDesconto(computador));
        }

        @Test
        void deveContarTotalComDesconto() {
            Computador computador = new Computador(
                    new Peca("ryzen 5 5600", 1000,400),
                    new Peca("A520 itx ac",  700,0),
                    new Peca("2x 3600", 800,560),
                    new Peca("rtx 3060 ti", 2500,1200),
                    new Peca("fonte 500w tr2",300,0)
            );
            assertEquals(2140, Estatistica.totalComDesconto(computador));
        }
    @Test
    void deveContarTotalPecas() {
        Computador computador = new Computador(
                new Peca("ryzen 5 5600", 1000,400),
                new Peca("A520 itx ac",  700,0),
                new Peca("2x 3600", 800,560),
                new Peca("rtx 3060 ti", 2500,1200),
                new Peca("fonte 500w tr2",300,0)
        );
        assertEquals(5, Estatistica.contarTotalPecas(computador));
    }

}
