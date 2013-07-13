
class User {
	Long id
	String nickname
	String firstName
	String lastName
	String email
	String telArea
	String telNumber
	String celPhone
	List<UserAddress> adress
	String docType
	String docNumber
	SiteStatus siteStatus
	Date registrationDate
	UserExperience experience
	UserType userType
	
	enum SiteStatus {
		ENABLED, DISABLED}
	
	enum UserType {
		SELLER, BUYER, ADMIN
	}
	
	enum UserExperience{
		newbie,intermediate,advanced
	}

}
