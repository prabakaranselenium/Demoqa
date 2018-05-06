package DemoqaSteps;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoqaSteps {
	@Given("^user is on DemoQa page$")
	public void user_is_on_DemoQa_page() {
					Base.browserOpen();
					Base.launchApp("http://demoqa.com/registration/");
		
					
					}

	@When("^user clicks  checkbox$")
	public void user_clicks_checkbox() throws Throwable  {
					Pom p = new Pom();
					Thread.sleep(3000);
					p.getHobbyCricket().click();
					p.getHobbyDance().click();
					p.getHobbyReading().click();
		
					}
		

	@Then("^user verifies whether the checkbox is selected or not$")
	public void user_verifies_whether_the_checkbox_is_selected_or_not() throws Throwable {
		            Pom p = new Pom();
					boolean cricket = p.getHobbyCricket().isSelected();
					boolean dance = p.getHobbyDance().isSelected();
					boolean reading = p.getHobbyReading().isSelected();
					Assert.assertTrue(cricket && dance && reading);
					System.out.println("The check box are selected");
					Base.browserClose();
		
					}
		

	@When("^user clicks on the radio button$")
	public void user_clicks_on_the_radio_button(){
		             Pom p = new Pom();
					p.getStatusMarried().click();
					}
	

	@Then("^user verifies whether the radio is selected or not$")
	public void user_verifies_whether_the_radio_is_selected_or_not() throws Throwable {	
		        Pom p = new Pom();
				boolean selected = p.getStatusMarried().isSelected();
				Assert.assertTrue(selected);
				System.out.println("Married radio button is selected");
				Base.browserClose();
			
	}

	@When("^user clicks the dropdown menu$")
	public void user_clicks_the_dropdown_menu() throws Throwable {
		        Pom p = new Pom();			
		        Select s= new Select(p.getDropDownCountry());
				String text = s.getFirstSelectedOption().getText();				
	}

	@Then("^user verifies whether the dropdown default value is same or not$")
	public void user_verifies_whether_the_dropdown_default_value_is_same_or_not() throws Throwable {
		
			 		
			 		String text = null;
					Assert.assertEquals("Afghanistan", text);
			 		System.out.println("The default selected value is : "+text);
			 		Base.browserClose();
				}
			 

}

