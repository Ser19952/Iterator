import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected PrimitiveIterator.OfInt randomIterator;
    protected int min, max;
    
    public Randoms(int min, int max) {
        randomIterator = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int i = max - min + 1;
                return random.nextInt(Math.abs(i)) + min;
            }
        };
    }
}

