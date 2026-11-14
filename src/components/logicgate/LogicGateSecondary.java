package components.logicgate;

/**
 * Layered implementations of secondary methods for {@code LogicGate}.
 */
public abstract class LogicGateSecondary implements LogicGate {
    /**
     * Returns the output signal based on the current signal inputs and gate
     * type.
     *
     * @return the value
     * @ensures output = evaluation of {@code this} gate's inputs and type
     */
    @Override
    public Signal output() {
        Signal out = Signal.LOW;
        switch (this.gateType()) {
            case AND: {
                if (this.signalA() == Signal.HIGH
                        && this.signalB() == Signal.HIGH) {
                    out = Signal.HIGH;
                }
            }
            case OR: {
                if (this.signalA() == Signal.HIGH
                        || this.signalB() == Signal.HIGH) {
                    out = Signal.HIGH;
                }
            }
            case NOT: {
                if (this.signalA() == Signal.LOW) {
                    out = Signal.HIGH;
                }
            }
            case XOR: {
                if (this.signalA() != this.signalB()) {
                    out = Signal.HIGH;
                }
            }
        }
        return out;
    }

    /**
     * Changes the value of {@code Signal}.
     *
     * @param signal
     *            the {@code signal} whose value is to be changed
     */
    @Override
    public void changeInput(Signal signal) {
        if (signal == Signal.HIGH) {
            signal = Signal.LOW;
        } else {
            signal = Signal.HIGH;
        }
    }

    /**
     * Reports whether {@code this} is HIGH.
     *
     * @return true iff {@code this} is HIGH
     */
    @Override
    public boolean isOutputHigh() {
        return this.output() == Signal.HIGH;
    }

}
