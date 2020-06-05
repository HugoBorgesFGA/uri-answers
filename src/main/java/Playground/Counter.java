package Playground;

import java.util.List;

public class Counter {

    private final List<Algarism> algarisms;
    private Algarism first;

    public Counter(List<Algarism> algarisms) {
        this.algarisms = algarisms;

        int lastIndex = algarisms.size() - 1;
        for(int i = lastIndex; i >= 0; i--) {
            if (i == lastIndex) {
                this.first = this.algarisms.get(lastIndex);
                continue;
            }

            Algarism previous = this.algarisms.get(i + 1);
            Algarism current = this.algarisms.get(i);

            previous.setOnUnderflow((obj) -> current.decrement());
            previous.setOnOverflow((obj) -> current.increment());
        }
    }

    public void increment() {
        this.first.increment();
    }

    public void decrement() {
        this.first.decrement();
    }

    public List<Algarism> getAlgarisms() {
        return algarisms;
    }
}
