package in.pulseinfotech.printphoto.services.communication.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 
 * This class is a  subclass <code>RegistrationTemplate</code> defining the mail template for Registration Cancellation  mails.
 * 
 * @author Raman Ahuja
 * @version 1.0
 * @since 16 September 2014 <br>
 * <br>
 * @see RegistrationTemplate
 * 
 */
public class RegistrationCancellationTemplate extends RegistrationTemplate{
	@Override
	protected void loadHTML() {
		File html = new File("src/testpkg/RegistrationCancellationTemplate.html");
		System.out.println(html.getAbsolutePath());
		String temp;
		String text = "";
		FileReader fileReader;
		try {
			fileReader = new FileReader(html);
			BufferedReader br = new BufferedReader(fileReader);
			while ((temp = br.readLine()) != null) {
				text = text + temp;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setTemplate(text);

	}
}
