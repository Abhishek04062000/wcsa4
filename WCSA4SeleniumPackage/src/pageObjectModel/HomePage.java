package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
		@FindBy(xpath="//a[.='Logout']")private WebElement logoutLink;
		@FindBy(xpath="//div[.='Users']")private WebElement saveLeaveTime;
		@FindBy(id="SubmitTTButton")private WebElement users;
		@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropDown;
		
		public HomePage(WebDriver driver)

		{
			PageFactory.initElements(driver, this);
		}
		
		// Initialization
		
		public WebElement getLogoutLink() {
			return logoutLink;
		}
	
		public WebElement getSaveLeaveTime() {
			return saveLeaveTime;
		}
	
		public WebElement getUsers() {
			return users;
		}
	
		public WebElement getEnterTimeTrackDropDown() {
			return enterTimeTrackDropDown;
		}

		
		// operational
		
		public void logOut()
		{
			logoutLink.click();
		}
		
		public void clickOnUser()
		{
			users.click();
		}
		
		public void clickOnSaveLeaveTime()
		{
			saveLeaveTime.click();
		}
		public void selectUser(int index)
		{
			Select sel = new Select(enterTimeTrackDropDown);
			sel.selectByIndex(index);
		}
}
