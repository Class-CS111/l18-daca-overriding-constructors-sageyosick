/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * <@author Sage Yosick
 *
 * @version 1.2
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
-----------------------------------------
*/

public class DACArecipient
{
  public static final String DEFAULT_SURNAME = "Unknown";
	/***** INSTANCE VARIABLES *****/
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;
	

	//TODO: don't forget to copy all your methods from the previous labs!
  public String getSurname() {
    return surname;
  }
  public String getGivenName() {
    return givenName;
  }
  public String getUscisNumber() {
    return uscisNumber;
  }
  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }
  public int getBirthday() {
    return birthday;
  }
  public int getValidFromDate() {
    return validFromDate;
  }
  public int getExpirationDate() {
    return expirationDate;
  }
  public char getSex() {
    return sex;
  }

  //SETTERS
  public void setSurname(String surname) {
    this.surname = surname;
  }
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }
  public void setUscisNumber(String uscisNumber) {
    this.uscisNumber = uscisNumber;
  }
  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }
  public void setBirthday(int birthday) {
    this.birthday = birthday;
  }
  public void setValidFromDate(int validFromDate) {
    this.validFromDate = validFromDate;
  }
  public void setExpirationDate(int expirationDate) {
    this.expirationDate = expirationDate;
  }
  public void setSex(char sex) {
    this.sex = sex;
  }

  //SET ALL METHOD
  public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex) {
    this.setSurname(surname);
    this.setGivenName(givenName);
    this.setUscisNumber(uscisNumber);
    this.setCountryOfOrigin(countryOfOrigin);
    this.setBirthday(birthday);
    this.setValidFromDate(validFromDate);
    this.setExpirationDate(expirationDate);
    this.setSex(sex);
  }
	
  /**** CONSTRUCTORS ****/
  //TODO: Write the no-argument constructor and full constructor. Remember to include documentation for each method.
  public DACArecipient() 
  {
    //surname = "Unknown"; givenName = "Unknown"; uscisNumber = "Unknown"; countryOfOrigin = "Unknown"; birthday = 2415021; validFromDate = 2415021; expirationDate = 2415021; sex = 'X'; 
    setAll(DEFAULT_SURNAME, "Unknown", "Unknown", "Unknown", 2415021, 2415021, 2415021, 'X');
  }

  public DACArecipient(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
  {
    /*this.surname = surname; 
    this.givenName = givenName;
    this.uscisNumber = uscisNumber;
    this.countryOfOrigin = countryOfOrigin;
    this.birthday = birthday;
    this.validFromDate = validFromDate;
    this.expirationDate = expirationDate;
    this.sex = sex;*/

    setAll(surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
  }

	/***** OTHER REQUIRED METHODS *****/
  public String toString()
  {
    return "Surname: " + surname + ", Given Name: " + givenName + ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin + ", Birthday: " + birthday + ", Valid From Date: " + validFromDate + ", Expiration Date: " + expirationDate + ", Sex: " + sex;
  }
}