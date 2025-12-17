package after.rules;

public interface ConvertRule {
	boolean matches(String output, int number);
	String apply(String output, int number);
}
