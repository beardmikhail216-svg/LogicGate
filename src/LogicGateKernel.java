/**
 * {@code LogicGateKernel} not enhanced with secondary methods.
 */
public interface LogicGate, LogicGateKernel {
    enum Signal {
        LOW,
        HIGH
    }
    enum GateType {
        AND,
        OR,
        NOT,
        XOR
    }

    /**
     * Sets the value of {@code position} to {@code signal} when {@code signal} is contained in Signal enum
     *
     * @param position
     *                  the input location (in 2 input gate, top or bottom)
     * @param signal
     *              the value to set at {@code position}
     * @updates this
     */
    void setInput(int position, Signal signal);

    /**
     * Outputs the signal after evaluating the gate Logic.
     *
     * @return the value
     */
    Signal output();

    /**
     * Sets the value of {@code this} to {@code type} when {@code type} is contained in GateType enum.
     *
     * @param type
     *              The gate type to set for {@code this}
     * @updates this
     */
    void setGateType(GateType type);
}