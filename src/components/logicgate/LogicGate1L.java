package components.logicgate;

/**
 * {@code LogicGate1L} implemenations of primary methods.
 *
 * @correspondence <pre>
 * </pre>
 * @convention <pre>
 * </pre>
 *
 * @author Mikhail Beard
 *
 */
public class LogicGate1L extends LogicGateSecondary {

    /*
     * Private members --------------------------------------------------------
     */
    private GateType gateType;
    private Signal signalA;
    private Signal signalB;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.gateType = GateType.AND;
        this.signalA = Signal.LOW;
        this.signalB = Signal.LOW;
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public LogicGate1L() {
        this.createNewRep();
    }

    /*
     * Standard methods -------------------------------------------------------
     */

    @SuppressWarnings("unchecked")
    @Override
    public final LogicGate newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(LogicGate source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof LogicGate1L : "Violation of: source is of dynamic type LogicGate1L";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case: source must be of dynamic type LogicGate1L,
         * and the ? must be T or the call would not have compiled.
         */
        LogicGate1L localSource = (LogicGate1L) source;
        this.gateType = localSource.gateType;
        this.signalA = localSource.signalA;
        this.signalB = localSource.signalB;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */

    @Override
    public final Signal signalA() {
        return this.signalA;
    }

    @Override
    public final Signal signalB() {
        return this.signalB;
    }

    @Override
    public final GateType gateType() {
        return this.gateType;
    }

    @Override
    public final void setInput(Signal signal) {
        assert signal != null : "Violation of: signal is not null";
        this.signalA = signal;
    }

    @Override
    public final void setInput(Signal signalA, Signal signalB) {
        assert signalA != null : "Violation of: signalA is not null";
        assert signalB != null : "Violation of: signalB is not null";
        this.signalA = signalA;
        this.signalB = signalB;
    }

    @Override
    public final void setGateType(GateType type) {
        assert type != null : "Violation of: type is not null";
        this.gateType = type;
    }
}
