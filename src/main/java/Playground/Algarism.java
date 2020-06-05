package Playground;

import java.util.function.Consumer;

public class Algarism {

    private final int minValue;
    private final int maxValue;

    private Consumer<Void> onOverflow;
    private Consumer<Void> onUnderflow;
    private int value;

    public Algarism(int value, int minValue, int maxValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;

        this.value = value;
        this.onOverflow = (obj) -> {};
        this.onUnderflow = (obj) -> {};
    }

    public void setOnOverflow(Consumer<Void> onOverflow) {
        this.onOverflow = onOverflow;
    }

    public void setOnUnderflow(Consumer<Void> onUnderflow) {
        this.onUnderflow = onUnderflow;
    }

    public void increment() {
        if (++value > this.maxValue) {
            this.onOverflow.accept(null);
            this.value = this.minValue;
        }
    }

    public void decrement() {
        if (--value < this.minValue) {
            this.onUnderflow.accept(null);
            this.value = this.maxValue;
        }
    }

    public int getValue() {
        return value;
    }
}
