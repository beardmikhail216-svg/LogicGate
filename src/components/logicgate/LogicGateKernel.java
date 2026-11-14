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
     * Reports the first input signal of {@code this}.
     *
     * @return the first signal of {@code this}
     */
    Signal signalA();

    /**
     * Reports the second input signal of {@code this}.
     *
     * @return the second signal of {@code this}
     */
    Signal signalB();

    /**
     * Reports the gate type of {@code this}.
     *
     * @return the gate type of {@code this}
     */
    GateType gateType();

    /**
     * Sets the value of {@code signalA} which must be contained in Signal enum.
     *
     * @param signalA
     *            the signal to set a value to
     * @requires signal != null
     * @updates this
     */
    void setInput(Signal signalA);

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
