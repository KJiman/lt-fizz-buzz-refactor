package after;

import java.util.List;

import after.rules.MultipleRule;
import after.rules.PassThroughRule;

public class FizzBuzzAfter {
  public static void main(String[] args) {
    fizzBuzz();
  }

  public static void fizzBuzz() {

    NumberConverter fizzBuzz = new NumberConverter(List.of(
      new MultipleRule(3, "Fizz"),
      new MultipleRule(5, "Buzz"),
      new PassThroughRule()
      ));
    
    for (int i = 1; i <= 100; i++) {
      String result = fizzBuzz.convert(i);
      System.out.println(result);
    }
  }
}