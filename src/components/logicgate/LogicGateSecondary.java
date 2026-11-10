package components.logicgate;

/**
 * Layered implementations of secondary methods for {@code LogicGate}.
 */
public abstract class LogicGateSecondary implements LogicGate {
    /**
     * Changes one of the {@code Signal}.
     */
    @Override
    public void changeInput(Signal signal) {
        /**
         * implementation
         */
    }

    /**
     * Reports the first input signal.
     *
     * @return the first signal of {@code this}
     * @aliases reference returned by {@code signalA}
     * @requires {@code this /= <>}
     * @ensures {@code <signalA> is prefix of this}
     */
    @Override
    public Signal signalA() {
        Signal signal = Signal.HIGH;
        /**
         * implementation
         */
        return signal;
    }

    /**
     * Reports the second input signal.
     *
     * @return the second signal of {@code this}
     * @aliases reference returned by {@code signalB}
     * @requires {@code this /= <>}
     * @ensures {@code <signalB> is prefix of this}
     */
    @Override
    public Signal signalB() {
        Signal signal = Signal.HIGH;
        /**
         * implementation
         */
        return signal;
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
