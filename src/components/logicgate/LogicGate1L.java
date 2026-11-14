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
        assert source instanceof LogicGate : "Violation of: source is of dynamic type LogicGate1L";
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
    public Signal signalA() {
        return this.signalA;
    }

    @Override
    public Signal signalB() {
        return this.signalB;
    }

    @Override
    public GateType gateType() {
        return this.gateType;
    }

    @Override
    public void setInput(Signal signal) {
        this.signalA = signal;
    }

    @Override
    public void setInput(Signal signalA, Signal signalB) {
        this.signalA = signalA;
        this.signalB = signalB;
    }

    @Override
    public void setGateType(GateType type) {
        this.gateType = type;
    }

    @Override
    public final Signal output() {
        Signal out = Signal.LOW;
        GateType gateType = this.gateType;
        switch (gateType) {
            case AND: {
                Signal a = this.signalA;
                Signal b = this.signalB;
                if (a.equals(b) && a == Signal.HIGH) {
                    out = Signal.HIGH;
                }
                break;
            }
            case OR: {
                Signal a = this.signalA;
                Signal b = this.signalB;
                if (a == Signal.HIGH || b == Signal.HIGH) {
                    out = Signal.HIGH;
                }
                break;
            }
            case NOT: {
                Signal signal = this.signalA;
                if (signal == Signal.HIGH) {
                    signal = Signal.LOW;
                } else {
                    signal = Signal.HIGH;
                }
                break;
            }
            case XOR: {
                Signal a = this.signalA;
                Signal b = this.signalB;
                if (!a.equals(b)) {
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
}
