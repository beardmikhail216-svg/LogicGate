package components.logicgate;

import components.standard.Standard;

/**
 * {@code LogicGateKernel} not enhanced with secondary methods.
 */
public interface LogicGateKernel extends Standard<LogicGate> {
    /**
     * Signal.
     */
    enum Signal {
        LOW, HIGH
    }

    /**
     * GateType.
     */
    enum GateType {
        AND, OR, NOT, XOR
    }

    /**
     * Sets the value of {@code signal} which must be contained in Signal enum.
     *
     * @param signal
     *            the first signal to set a value to
     * @requires signalA != null && signalB != null
     * @updates this
     */
    void setInput(Signal signal);

    /**
     * Sets the value of {@code signalA} and {@code signalB}, both of which must
     * be contained in Signal enum.
     *
     * @param signalA
     *            the first signal to set a value to
     * @param signalB
     *            the second signal to set a value to
     * @requires signalA != null && signalB != null
     * @updates this
     */
    void setInput(Signal signalA, Signal signalB);

    /**
     * Returns the output signal based on the current signal inputs and gate
     * type.
     *
     * @return the value
     * @ensures output = evaluation of {@code this} gate's inputs and type
     */
    Signal output();

    /**
     * Sets the value of {@code this} to {@code type} when {@code type} is
     * contained in GateType enum.
     *
     * @param type
     *            The gate type to set for {@code this}
     * @requires type != null
     * @updates this
     */
    void setGateType(GateType type);
}
