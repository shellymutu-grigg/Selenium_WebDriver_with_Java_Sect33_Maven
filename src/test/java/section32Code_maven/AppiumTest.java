package section32Code_maven;

import org.testng.annotations.Test;
import java.text.MessageFormat;

import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void NativeAppAndroid() {
		System.out.println(MessageFormat.format("AppiumTest > {0}", "NativeAppAndroid"));
	}

	@Test
	public void IOSApps() {
		System.out.println(MessageFormat.format("AppiumTest > {0}", "IOSApps"));
	}
}
