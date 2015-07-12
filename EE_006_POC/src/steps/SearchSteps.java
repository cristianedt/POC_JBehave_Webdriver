package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import driver.WebDriverTestBase;
import pageObject.GooglePage;

public class SearchSteps extends WebDriverTestBase{
	
	private GooglePage page;
	
	public SearchSteps(){
		page = new GooglePage(driver);
	}
	
	@Given("I see the google website")
	public void openSite(){
		page.openSite();
	}
	
	@When("I make to search by $summary")
	public void searchBySummary(String summary){
		page.searchBySummary(summary);
	}
	
	@Then("return all results")
	public void hasResuts(){
		Assert.assertTrue(page.hasResuts());
	}

}
