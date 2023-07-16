package section32Code_maven;

import org.testng.annotations.Test;
import java.text.MessageFormat;

import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void BrowserAutomation() {
		System.out.println(MessageFormat.format("SeleniumTest > {0}", "BrowserAutomation"));
	}

	@Test
	public void ElementsUI() {
		System.out.println(MessageFormat.format("SeleniumTest > {0}", "ElementsUI"));
	}
}
