package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import objectRepository.HomePageLocatorsSG;

public class HomePage {
public WebDriver driver;


public HomePage(WebDriver driver) {
		this.driver = driver;
	}
		
	HomePageLocatorsSG hpl = new HomePageLocatorsSG(); 
	
	
	public String verifyElements(String string) {
		WebElement tab;
		String actualText = null;
		List<WebElement> TopNavElements = driver.findElements(hpl.HomePageHeader);
		for (int i=0; i<TopNavElements.size(); i++)
		{
			tab = TopNavElements.get(i);
			actualText= tab.getText();			
		}
		return actualText;
		
	}
	
	public String verifyElementsLeftNavigation(String string) {
		WebElement tab;
		String actualText = null;
		List<WebElement> LeftNavElements = driver.findElements(hpl.LeftNavBars);
		for (int i=0; i<LeftNavElements.size(); i++)
		{
			tab = LeftNavElements.get(i);
			actualText= tab.getText();			
		}
		return actualText;
		
	}
	
	public String verifyElementsFooterNavigation(String string) {
		WebElement tab;
		String actualText = null;
		List<WebElement> FooterNavElements = driver.findElements(hpl.FooterLinks);
		for (int i=0; i<FooterNavElements.size(); i++)
		{
			tab = FooterNavElements.get(i);
			actualText= tab.getText();			
		}
		//System.out.println(actualText);
		return actualText;
		
		
	}
	
	//verifyElementsFooterNavigationSocialMedia
	@SuppressWarnings("deprecation")
	public String verifyElementsFooterNavigationSocialMedia(String string) {
		
		String actualText = null;
		WebElement element1 = driver.findElement(hpl.FooterLinks_FB);
		WebElement element2 = driver.findElement(hpl.FooterLinks_INSTA);
		actualText = element1.getAttribute("href");
		actualText+= element2.getAttribute("href");
		
		return actualText;
		
	}

	
	
public boolean verifyElementsFooterLogoAndCopyright(String string) 
{
				
		boolean result;
		if (result = (driver.findElement(hpl.FooterLogo).isDisplayed() && driver.findElement(hpl.CopyR).isDisplayed()))
		{
				if (driver.findElement(hpl.CopyR).getText().equals("? 2022 Bridgestone Tyre Sales Singapore Pte Ltd"))
				{
				System.out.println("Footer ICON and CopyRights Shown with text: "+ driver.findElement(hpl.CopyR).getText() );
				}
		}else
			{
				System.out.println("Footer ICON and CopyRights Shown missing");
			}
		return result;
		
}	
		
	
	public String verifyElementLogo() {
		return driver.findElement(hpl.BridgeStoneLogo).getAccessibleName();

		}

	
}



