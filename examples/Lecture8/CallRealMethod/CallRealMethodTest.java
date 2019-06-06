import org.junit.Test;
import org.mockito.*;
import static org.junit.Assert.*;

public class CallRealMethodTest {
	@Test
	public void testWithoutCallRealMethod() {
		//Create our mocks.
		CallRealMethod obj = Mockito.mock(CallRealMethod.class); //Create double.
		Mockito.when(obj.methodThatNeedsStubbed()).thenReturn(1); //Create stub.
		
		int result = obj.methodUnderTest();
		
		//This assertion will fail because when we create the mock CallRealMethod object, we stubbed the methodThatNeedsStubbed(),
		//but we didn't stub the methodUnderTest(). It returns the default value of 0 and thus the test fails.
		assertEquals(1, result);
	}
	
	@Test
	public void testWithCallRealMethod() {
		//Create our mocks.
		CallRealMethod obj = Mockito.mock(CallRealMethod.class); //Create double.
		Mockito.when(obj.methodThatNeedsStubbed()).thenReturn(1); //Create stub.
		Mockito.when(obj.methodUnderTest()).thenCallRealMethod(); //Instruct the double to call the real method for methodUnderTest().
		
		int result = obj.methodUnderTest();
		
		//This time the assertion passes because we instructed the double to use the actual methodUnderTest() method for this test.
		assertEquals(1, result);
	}
}