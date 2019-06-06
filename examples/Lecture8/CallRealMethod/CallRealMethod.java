public class CallRealMethod {
	public int methodUnderTest() {
		return methodThatNeedsStubbed();
	}
	
	public int methodThatNeedsStubbed() {
		return 100;
	}
}