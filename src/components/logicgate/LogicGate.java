package components.logicgate;

/**
* {@code LogicGate} enhanced with secondary methods.
*/
public interface LogicGate extends Comparable<LogicGate>, LogicGateKernel {

    /**
     * Changes one of the {@code Signal}.
     *
     * @param signal
     *              the {@code signal} whose value is to be changed
     */
    void changeInput(Signal signal);

    /**
     * Reports the first input signal.
     *
     * @return the first signal of {@code this}
     * @aliases reference returned by {@code signalA}
     * @requires {@code this /= <>}
     * @ensures {@code <signalA> is prefix of this}
     */
    Signal signalA();

    /**
     * Reports the seoncd input signal.
     *
     * @return the second signal of {@code this}
     * @aliases reference returned by {@code signalB}
     * @requires {@code this /= <>}
     * @ensures {@code <signalB> is prefix of this}
     */
    Signal signalB();

    /**
     * Reports whether {@code this} is HIGH.
     *
     * @return true iff {@code this} is HIGH
     */
    boolean isOutputHigh();

}
