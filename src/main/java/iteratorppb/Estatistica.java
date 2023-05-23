package iteratorppb;
import java.util.Iterator;
public class Estatistica {
    public static Integer contarPecasComDesconto(Computador computador) {
        int quantidade = 0;
        for (Peca peca : computador) {
            if (peca.pagoComDesconto()) {
                quantidade++;
            }
        }
        return quantidade;
    }
    public static Integer totalComDesconto(Computador computador) {
        int total = 0;
        for (Peca peca : computador) {
            if (peca.pagoComDesconto()) {
                total+=peca.valorComDesconto();
            }
        }
        return total;
    }
    public static Integer contarTotalPecas(Computador computador) {
        int quantidade = 0;
        for (Iterator a = computador.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}


