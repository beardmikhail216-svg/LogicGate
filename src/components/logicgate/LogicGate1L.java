package components.logicgate;
/**
 * {@code LogicGate1L} implemenations of primary methods.
 * @correspondence
 * @convention
 */
public class LogicGate1L extends LogicGateSecondary {

    /*
     * Private members --------------------------------------------------------
     */
    private GateType gateType;
    private Signal signalA;
    private Signal signalB;


    /**
     * Representation of {@code this}.
     */
    private LogicGate rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = new LogicGate1L();
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
        assert source instanceof LogicGate
                : "Violation of: source is of dynamic type LogicGate1L";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case: source must be of dynamic type LogicGate1L,
         * and the ? must be T or the call would not have compiled.
         */
        LogicGate1L localSource = (LogicGate1L) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */
    @Override
    public final void setInput(Signal a, Signal b) {
        signalA = a;
        signalB = b;
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

    @Override
    public final void setGateType(GateType type) {
        gateType = type;
    }
}
