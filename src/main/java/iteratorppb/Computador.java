package iteratorppb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Computador  implements Iterable<Peca>{
    private List<Peca> pecas = new ArrayList<Peca>();

    public Computador(Peca... pecas) {
        this.pecas = Arrays.asList(pecas);
    }
    @Override
    public Iterator<Peca> iterator() {
        return pecas.iterator();
    }
}
