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
                break;
            }
            case OR: {
                if (this.signalA() == Signal.HIGH
                        || this.signalB() == Signal.HIGH) {
                    out = Signal.HIGH;
                }
                break;
            }
            case NOT: {
                if (this.signalA() == Signal.LOW) {
                    out = Signal.HIGH;
                }
                break;
            }
            case XOR: {
                if (this.signalA() != this.signalB()) {
                    out = Signal.HIGH;
                }
                break;
            }
            default: {
                //this shouldnt happen
                break;
            }
        }
        return out;
    }

    /**
     * Changes the value of {@code SignalA}.
     *
     * @param signalA
     *            the {@code signal} whose value is to be changed
     */
    @Override
    public void changeInputA(Signal signalA) {
        if (signalA == Signal.HIGH) {
            this.setInput(signalA, Signal.LOW);
        } else {
            this.setInput(signalA, Signal.HIGH);
        }
    }

    /**
     * Changes the value of {@code SignalB}.
     *
     * @param signalB
     *            the {@code signal} whose value is to be changed
     */
    @Override
    public void changeInputB(Signal signalB) {
        if (signalB == Signal.HIGH) {
            this.setInput(signalB, Signal.LOW);
        } else {
            this.setInput(signalB, Signal.HIGH);
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
