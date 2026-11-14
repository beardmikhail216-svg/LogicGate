package components.logicgate;

/**
 * {@code LogicGate} enhanced with secondary methods.
 */
public interface LogicGate extends LogicGateKernel {

    /**
     * Returns the output signal based on the current signal inputs and gate
     * type.
     *
     * @return the value
     * @ensures output = evaluation of {@code this} gate's inputs and type
     */
    Signal output();

    /**
     * Changes the value of {@code Signal}.
     *
     * @param signal
     *            the {@code signal} whose value is to be changed
     */
    void changeInput(Signal signal);

    /**
     * Reports whether the output of {@code this}'s gate is HIGH.
     *
     * @return true iff the output of {@code this}'s gate is HIGH
     */
    boolean isOutputHigh();

}
