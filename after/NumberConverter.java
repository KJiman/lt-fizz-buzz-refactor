package after;

import java.util.List;

import after.rules.ConvertRule;

public class NumberConverter {
	
	private List<ConvertRule> convertRules;

	public NumberConverter(List<ConvertRule> rules) {
		this.convertRules = rules;
	}

	public String convert(int number) {
			String output = "";
			for (ConvertRule rule : convertRules) {
				if (rule.matches(output, number)) {
					output = rule.apply(output, number);
				}
			}
			return output;
	}
}
