package after.rules;

public class PassThroughRule implements ConvertRule {

	@Override
	public boolean matches(String output, int number) {
		return output.isEmpty();
	}

	@Override
	public String apply(String output, int number) {
		return Integer.toString(number);
	}
}
