package details;

public class EventImp1 implements Event {
	
	public static class InnerEventImpl implements Event{

		@Override
		public void doSomething() {
			
		}
		
		
	}



	
	public void doingSomething() {
		class InnerMostImpl implements Event() {
			
		}
	}

	public void doingSomethingAgain(){
		
		new Event() {
			
		}
	}

	public static void main(String[] args) {
		EventImp1 impl= new EventImp1();
		impl.doSomething();
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}



	
}

