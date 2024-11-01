package week2.day7.homeassignments;

public class Elements  extends Button{
	public static void main(String[] args) {
		
		WebElement web = new WebElement();
		web.click();
		String text = web.setText("webElement");
		System.out.println("Hello "+ text);

		System.out.println("**************************************");
		Button b = new Button();
		b.click();
		String text1 = b.setText("Button");
		System.out.println("Hello "+ text1);
		b.submit();
		
		System.out.println("**************************************");
		TextField tf = new TextField();
		tf.click();
		String text2 = tf.setText("TextField");
		System.out.println("Hello "+ text2);
		tf.getText();
		
		System.out.println("**************************************");
		CheckBoxButton cb = new CheckBoxButton();
		cb.click();
		String text3 = cb.setText("CheckBox");
		System.out.println("Hello "+ text3);
		cb.submit();
		cb.clickCheckButton();
		
		System.out.println("**************************************");
		RadioButton rb = new RadioButton();
		rb.click();
		String text4 = rb.setText("Radio");
		System.out.println("Hello "+ text4);
		rb.submit();
		rb.selectRadioButton();
		
		System.out.println("**************************************");
		Button b1 = new CheckBoxButton();
		b1.click();
		String text5 = b1.setText("button -->checkbox button");
		System.out.println("Hello "+ text5);
		b1.click();
				
		
	}

}
