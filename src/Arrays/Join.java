package Arrays;

import org.apache.commons.lang3.StringUtils;

public class Join {

	public static void main(String[] args) {
		
		// String.join ile
		String joinedString = String.join(",", "How", "To", "Do", "In", "Java");
		System.out.println(joinedString);
		
		// StringUtils - Apache Commons ile
		String[] array = {"How", "To", "Do", "In", "Java"};
		System.out.println(StringUtils.join(array));

	}

}
