package after.rules;

public class MultipleRule implements ConvertRule {

  private int divisor;
  private String replacement;
  
  public MultipleRule(int divisor, String replacement) {
    this.divisor = divisor;
    this.replacement = replacement;
  }

  @Override
  public boolean matches(String output, int number) {
    return number % divisor == 0;
  }

  @Override
  public String apply(String output, int number) {
    return output + replacement;
  }
}