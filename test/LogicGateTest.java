import components.logicgate.LogicGate;
import components.logicgate.LogicGateKernel.GateType;
import components.logicgate.LogicGateKernel.Signal;

/**
 * JUnit test fixture for {@code LogicGate}'s constructors and kernel methods.
 *
 * @author Mikhail Beard
 *
 */
public abstract class LogicGateTest {

    /**
     * Invokes the appropriate {@code LogicGate} constructor for the
     * implementation under test and returns the result.
     *
     * @return the new logic gate
     * @ensures
     */
    protected abstract LogicGate constructorTest();

    /**
     * Invokes the appropriate {@code LogicGate} constructor for the reference
     * implementation and returns the result.
     *
     * @return the new logic gate
     * @ensures
     */
    protected abstract LogicGate constructorRef();

    /**
     * Test for AND
     */
    @Test
    public void testAndBothSignalsHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.AND);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.AND);
        lRef.setInput(Signal.HIGH, Signal.HIGH);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.HIGH, Signal.HIGH);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.HIGH, lTest.output());
    }

    @Test
    public void testAndBothSignalsLow() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.AND);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.AND);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.LOW, Signal.LOW);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.LOW, lTest.output());
    }

    @Test
    public void testAndSignalAHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.AND);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.AND);
        lRef.setInput(Signal.HIGH, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.HIGH, Signal.LOW);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.LOW, lTest.output());
    }

    @Test
    public void testAndSignalBHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.AND);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.AND);
        lRef.setInput(Signal.LOW, Signal.HIGH);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.LOW, Signal.HIGH);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.LOW, lTest.output());
    }

    /**
     * Test for OR
     */
    @Test
    public void testORBothSignalsHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.OR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.OR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.HIGH, Signal.HIGH);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.HIGH, lTest.output());
    }

    @Test
    public void testORBothSignalsLow() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.OR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.OR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.LOW, Signal.LOW);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.LOW, lTest.output());
    }

    @Test
    public void testORSignalAHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.OR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.OR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.HIGH, Signal.LOW);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.HIGH, lTest.output());
    }

    @Test
    public void testORSignalBHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.OR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.OR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.LOW, Signal.HIGH);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.HIGH, lTest.output());
    }

    /**
     * Test for NOT
     */
    @Test
    public void testNotSignalHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.OR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.OR);
        lRef.setInput(Signal.HIGH);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.HIGH);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.LOW, lTest.output());
    }

    @Test
    public void testNotSignalLow() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.OR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.OR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.LOW, Signal.HIGH);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.HIGH, lTest.output());
    }

    /**
     * Test for XOR
     */
    @Test
    public void testXORBothSignalsHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.XOR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.XOR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.HIGH, Signal.HIGH);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.HIGH, lTest.output());
    }

    @Test
    public void testXORBothSignalsLow() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.XOR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.XOR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.LOW, Signal.LOW);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.LOW, lTest.output());
    }

    @Test
    public void testXORSignalAHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.XOR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.XOR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.HIGH, Signal.LOW);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.HIGH, lTest.output());
    }

    @Test
    public void testORSignalBHigh() {
        /*
         * Set up variables
         */
        LogicGate lTest = this.constructorTest();
        lTest.setGateType(GateType.XOR);
        LogicGate lRef = this.constructorRef();
        lRef.setGateType(GateType.XOR);
        lRef.setInput(Signal.LOW, Signal.LOW);
        /*
         * Call method under test
         */
        lTest.setInput(Signal.LOW, Signal.HIGH);
        /*
         * Assert that the values of variables match expectations
         */
        assertEquals(Signal.HIGH, lTest.output());
    }

}
