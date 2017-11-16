package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CATPages"                                
     , connection="Badger_17_Vocalocity_SysAdmin"
     )             
public class CATPages {

	@ButtonType()
	@FindBy(xpath = "//section[contains(@class, \"accept\")]//button")
	public WebElement AcceptQuote;
	@TextType()
	@FindBy(xpath = "//*[contains(@id, 'CompanyConfirmEmail')]")
	public WebElement CompanyConfirmEmail;
	@TextType()
	@FindBy(xpath = "//*[contains(@id, 'AdminEmailConfirm')]") 
	public WebElement AdminConfirmEmail;
	@ChoiceListType(values = { @ChoiceListValue(value = "Eastern Time Zone"),
			@ChoiceListValue(value = "Central Time Zone"), @ChoiceListValue(value = "Mountain Time Zone"),
			@ChoiceListValue(value = "Pacific Time Zone"), @ChoiceListValue(value = "Alaskan Time Zone"),
			@ChoiceListValue(value = "Hawaiian Time Zone") })
	@FindBy(xpath = "//*[contains(@id, 'TimeZone')]")
	public WebElement TimeZone;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, \"sameCheck\")]//input")
	public WebElement sameAsCompanyContact;
	@ButtonType()
	@FindByLabel(label = "Continue to Shipping")
	public WebElement continueToShipping;
	@TextType()
	@FindBy(xpath = "//*[contains(@id, 'AdminUsername')]")
	public WebElement UserName;
	@LinkType()
	@FindBy(linkText = "Use this address")
	public WebElement useThisAddress;
	@ButtonType()
	@FindByLabel(label = "Confirm Shipping")
	public WebElement confirmShipping;
	@ButtonType()
	@FindBy(xpath = "//*[@class=\"pbButtonb\"]//input[2]")
	public WebElement ContinueToSummary;
	@ButtonType()
	@FindByLabel(label = "Proceed To Payment")
	public WebElement proceedToPayment;
	@ButtonType()
	@FindByLabel(label = "Agree to Terms of Service")
	public WebElement agreeToTermsOfService;
	@ButtonType()
	@FindByLabel(label = "I Accept")
	public WebElement iAccept;
	@BooleanType()
	@FindBy(xpath = "//input[@name=\"cardType\"][@id=\"visa\"]")
	public WebElement visaMastercard;
	

	@PageFrame()
	public static class Paymentinfo {

		@TextType()
		@FindBy(id = "input-creditCardNumber")
		public WebElement cardNumber;
		
		@TextType()
		@FindBy(id = "input-cardSecurityCode")
		public WebElement cvv;
		
		@TextType()
		@FindBy(id = "input-creditCardHolderName")
		public WebElement cardHolderName;
		
		@TextType()
		@FindBy(id = "input-creditCardAddress1")
		public WebElement Address1;
		
		@TextType()
		@FindBy(id = "input-creditCardCity")
		public WebElement City;
		
		@TextType()
		@FindBy(id = "input-creditCardPostalCode")
		public WebElement zipcode;
		
		@ChoiceListType(values = {
				@ChoiceListValue(value = "2017", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2017\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2018", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2018\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2019", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2019\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2020", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2020\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2021", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2021\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2022", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2022\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2023", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2023\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2024", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2024\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2025", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2025\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2026", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2026\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2027", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2027\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2028", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2028\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2029", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2029\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2030", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2030\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2031", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2031\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2032", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2032\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2033", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2033\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2034", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2034\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2035", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2035\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2036", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2036\n\t\t\t\t\t\t\t\t\t\t\t  "), @ChoiceListValue(value = "2037", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t2037\n\t\t\t\t\t\t\t\t\t\t\t  ") })
		@FindBy(id = "input-creditCardExpirationYear")
		public WebElement year;
		
		@LinkType()
		@FindBy(id = "submitButton")
		public WebElement submit;
		
		@ChoiceListType(values = {
				@ChoiceListValue(value = "01", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t01\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "02", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t02\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "03", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t03\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "04", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t04\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "05", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t05\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "06", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t06\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "07", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t07\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "08", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t08\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "09", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t09\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "10", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t10\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "11", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t11\n\t\t\t\t\t\t\t\t\t\t\t  "),
				@ChoiceListValue(value = "12", title = "\n\t\t\t\t\t\t\t\t\t\t\t  \t12\n\t\t\t\t\t\t\t\t\t\t\t  ") })
		@FindBy(id = "input-creditCardExpirationMonth")
		public WebElement expirationMonth;
		
		@ChoiceListType(values = {
				@ChoiceListValue(value = "Alabama", title = "\n                        \n                        \n\t                      \tAlabama\n                        \n                      "),
				@ChoiceListValue(value = "Alaska", title = "\n                        \n                        \n\t                      \tAlaska\n                        \n                      "),
				@ChoiceListValue(value = "Arizona", title = "\n                        \n                        \n\t                      \tArizona\n                        \n                      "),
				@ChoiceListValue(value = "Arkansas", title = "\n                        \n                        \n\t                      \tArkansas\n                        \n                      "),
				@ChoiceListValue(value = "Armed Forces", title = "\n                        \n                        \n\t                      \tArmed Forces\n                        \n                      "),
				@ChoiceListValue(value = "Armed Forces America", title = "\n                        \n                        \n\t                      \tArmed Forces America\n                        \n                      "),
				@ChoiceListValue(value = "Armed Forces Pacific", title = "\n                        \n                        \n\t                      \tArmed Forces Pacific\n                        \n                      "),
				@ChoiceListValue(value = "California", title = "\n                        \n                        \n\t                      \tCalifornia\n                        \n                      "),
				@ChoiceListValue(value = "Colorado", title = "\n                        \n                        \n\t                      \tColorado\n                        \n                      "),
				@ChoiceListValue(value = "Connecticut", title = "\n                        \n                        \n\t                      \tConnecticut\n                        \n                      "),
				@ChoiceListValue(value = "Delaware", title = "\n                        \n                        \n\t                      \tDelaware\n                        \n                      "),
				@ChoiceListValue(value = "Florida", title = "\n                        \n                        \n\t                      \tFlorida\n                        \n                      "),
				@ChoiceListValue(value = "Georgia", title = "\n                        \n                        \n\t                      \tGeorgia\n                        \n                      "),
				@ChoiceListValue(value = "Guam", title = "\n                        \n                        \n\t                      \tGuam\n                        \n                      "),
				@ChoiceListValue(value = "Hawaii", title = "\n                        \n                        \n\t                      \tHawaii\n                        \n                      "),
				@ChoiceListValue(value = "Idaho", title = "\n                        \n                        \n\t                      \tIdaho\n                        \n                      "),
				@ChoiceListValue(value = "Illinois", title = "\n                        \n                        \n\t                      \tIllinois\n                        \n                      "),
				@ChoiceListValue(value = "Indiana", title = "\n                        \n                        \n\t                      \tIndiana\n                        \n                      "),
				@ChoiceListValue(value = "Iowa", title = "\n                        \n                        \n\t                      \tIowa\n                        \n                      "),
				@ChoiceListValue(value = "Kansas", title = "\n                        \n                        \n\t                      \tKansas\n                        \n                      "),
				@ChoiceListValue(value = "Kentucky", title = "\n                        \n                        \n\t                      \tKentucky\n                        \n                      "),
				@ChoiceListValue(value = "Louisiana", title = "\n                        \n                        \n\t                      \tLouisiana\n                        \n                      "),
				@ChoiceListValue(value = "Maine", title = "\n                        \n                        \n\t                      \tMaine\n                        \n                      "),
				@ChoiceListValue(value = "Maryland", title = "\n                        \n                        \n\t                      \tMaryland\n                        \n                      "),
				@ChoiceListValue(value = "Massachusetts", title = "\n                        \n                        \n\t                      \tMassachusetts\n                        \n                      "),
				@ChoiceListValue(value = "Michigan", title = "\n                        \n                        \n\t                      \tMichigan\n                        \n                      "),
				@ChoiceListValue(value = "Minnesota", title = "\n                        \n                        \n\t                      \tMinnesota\n                        \n                      "),
				@ChoiceListValue(value = "Mississippi", title = "\n                        \n                        \n\t                      \tMississippi\n                        \n                      "),
				@ChoiceListValue(value = "Missouri", title = "\n                        \n                        \n\t                      \tMissouri\n                        \n                      "),
				@ChoiceListValue(value = "Montana", title = "\n                        \n                        \n\t                      \tMontana\n                        \n                      "),
				@ChoiceListValue(value = "Nebraska", title = "\n                        \n                        \n\t                      \tNebraska\n                        \n                      "),
				@ChoiceListValue(value = "Nevada", title = "\n                        \n                        \n\t                      \tNevada\n                        \n                      "),
				@ChoiceListValue(value = "New Hampshire", title = "\n                        \n                        \n\t                      \tNew Hampshire\n                        \n                      "),
				@ChoiceListValue(value = "New Jersey", title = "\n                        \n                        \n\t                      \tNew Jersey\n                        \n                      "),
				@ChoiceListValue(value = "New Mexico", title = "\n                        \n                        \n\t                      \tNew Mexico\n                        \n                      "),
				@ChoiceListValue(value = "New York", title = "\n                        \n                        \n\t                      \tNew York\n                        \n                      "),
				@ChoiceListValue(value = "North Carolina", title = "\n                        \n                        \n\t                      \tNorth Carolina\n                        \n                      "),
				@ChoiceListValue(value = "North Dakota", title = "\n                        \n                        \n\t                      \tNorth Dakota\n                        \n                      "),
				@ChoiceListValue(value = "Ohio", title = "\n                        \n                        \n\t                      \tOhio\n                        \n                      "),
				@ChoiceListValue(value = "Oklahoma", title = "\n                        \n                        \n\t                      \tOklahoma\n                        \n                      "),
				@ChoiceListValue(value = "Oregon", title = "\n                        \n                        \n\t                      \tOregon\n                        \n                      "),
				@ChoiceListValue(value = "Pennsylvania", title = "\n                        \n                        \n\t                      \tPennsylvania\n                        \n                      "),
				@ChoiceListValue(value = "Puerto Rico", title = "\n                        \n                        \n\t                      \tPuerto Rico\n                        \n                      "),
				@ChoiceListValue(value = "Rhode Island", title = "\n                        \n                        \n\t                      \tRhode Island\n                        \n                      "),
				@ChoiceListValue(value = "South Carolina", title = "\n                        \n                        \n\t                      \tSouth Carolina\n                        \n                      "),
				@ChoiceListValue(value = "South Dakota", title = "\n                        \n                        \n\t                      \tSouth Dakota\n                        \n                      "),
				@ChoiceListValue(value = "Tennessee", title = "\n                        \n                        \n\t                      \tTennessee\n                        \n                      "),
				@ChoiceListValue(value = "Texas", title = "\n                        \n                        \n\t                      \tTexas\n                        \n                      "),
				@ChoiceListValue(value = "Utah", title = "\n                        \n                        \n\t                      \tUtah\n                        \n                      "),
				@ChoiceListValue(value = "Vermont", title = "\n                        \n                        \n\t                      \tVermont\n                        \n                      "),
				@ChoiceListValue(value = "Virgin Islands", title = "\n                        \n                        \n\t                      \tVirgin Islands\n                        \n                      "),
				@ChoiceListValue(value = "Virginia", title = "\n                        \n                        \n\t                      \tVirginia\n                        \n                      "),
				@ChoiceListValue(value = "Washington", title = "\n                        \n                        \n\t                      \tWashington\n                        \n                      "),
				@ChoiceListValue(value = "Washington DC", title = "\n                        \n                        \n\t                      \tWashington DC\n                        \n                      "),
				@ChoiceListValue(value = "West Virginia", title = "\n                        \n                        \n\t                      \tWest Virginia\n                        \n                      "),
				@ChoiceListValue(value = "Wisconsin", title = "\n                        \n                        \n\t                      \tWisconsin\n                        \n                      "),
				@ChoiceListValue(value = "Wyoming", title = "\n                        \n                        \n\t                      \tWyoming\n                        \n                      ") })
		@FindByLabel(label = "State")
		public WebElement state;
	}
	@FindBy(css = "#z_hppm_iframe")
	public Paymentinfo paymentinfo;
	@TextType()
	@FindBy(xpath = "//*[@id = 'QtcConfirm']//h2")
	public WebElement cattool;

}
