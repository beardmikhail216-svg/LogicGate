import components.logicgate.LogicGate;
import components.logicgate.LogicGate1L;

/**
 * Customized JUnit test fixture for {@code LogicGate1L}.
 */
public class LogicGate1LTest extends LogicGateTest {

    @Override
    protected final LogicGate constructorTest() {
        return new LogicGate1L();
    }

    @Override
    protected final LogicGate constructorRef() {
        return new LogicGate1L();
    }

}
