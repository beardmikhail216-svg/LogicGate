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
        LOW,
        HIGH
    }
    /**
     * GateType.
     */
    enum GateType {
        AND,
        OR,
        NOT,
        XOR
    }

    /**
     * Sets the value of {@code signalA} and {@code signalB}, both of which
     * must be contained in Signal enum.
     *
     * @param signalA
     *              the signal to set a value to
     * @param signalB
     *              the signal to set a value to
     * @updates this
     */
    void setInput(Signal signalA, Signal signalB);

    /**
     * Outputs the signal after evaluating the gate Logic.
     *
     * @return the value
     */
    Signal output();

    /**
     * Sets the value of {@code this} to {@code type} when {@code type} is
     * contained in GateType enum.
     *
     * @param type
     *              The gate type to set for {@code this}
     * @updates this
     */
    void setGateType(GateType type);
}