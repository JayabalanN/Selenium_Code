package mavenproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adactin_Hotel_Pom {
	
	@FindBy(id = "username")
	public static WebElement emailTextBox;
	@FindBy(id = "password")
    public static WebElement passwordTextBox;
	@FindBy(id = "login")
	public static WebElement loginButton;
	//--------------------SEARCH_HOTEL_PAGE------------------------------------------
	@FindBy(id = "location")
	public static WebElement location;
	@FindBy(id = "hotels")
	public static WebElement hotels;
	@FindBy(id = "room_type")
	public static WebElement roomType;
	@FindBy(id = "room_nos")
	public static WebElement numberOfRooms;
	@FindBy(id = "datepick_in")
	public static WebElement checkInDate;
	@FindBy(id = "datepick_out")
	public static WebElement checkOutDate;
	@FindBy(id = "adult_room")
	public static WebElement adultsPerRoom;
	@FindBy(id = "child_room")
    public static WebElement childernsPerRooms;
	@FindBy(id = "Submit")
    public static WebElement searchButton;
	//---------------------------ADACTIN-GROUP-OF-HOTELS-----------------------------
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	public static WebElement continueButton;
	//------------------------------BOOK-HOTEL-----------------------------------------
	@FindBy(xpath = "//input[@name='first_name']")
    public static WebElement firstName;
	@FindBy(xpath = "//input[@name='last_name']")
	public static WebElement lastName;
	@FindBy(id = "address")
	public static WebElement billingAddress;
	@FindBy(xpath = "(//input[@class='reg_input'])[3]")
    public static WebElement creditCardNumber;
	@FindBy(xpath = "//select[@name='cc_type']")
	public static WebElement creditCardType;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	public static WebElement expiryDateMonth;
	@FindBy(xpath = "cc_exp_year")
	public static WebElement expiryDateYear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	public static WebElement cvvNumber;
	@FindBy(xpath = "//input[@name='book_now']")
	public static WebElement bookNowButton;
	//------------------------------BOOK-CONFORMATION----------------------------------------
	@FindBy(xpath = "//input[@name='search_hotel']")
	public static WebElement searchHotelButton;
	@FindBy(xpath = "//input[@name='my_itinerary']")
	public static WebElement myItineraryButton;
	@FindBy(id = "logout")
	public static WebElement logoutButton;
	//---------------------------------BOOK-ITINERARY----------------------------------
	@FindBy(xpath = "//input[@name='ids[]']")
	public static WebElement orderIdcheckBox;
	@FindBy(name = "cancelall")
	public static WebElement cancelSelectButton;
	@FindBy(id = "logout")
	public static WebElement endlogoutButton;
	
	
	
	
	
	
	
	
	
	
	
}
