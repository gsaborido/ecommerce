
class UserAddress {
	String street
	String number
	String apartment
	String zipCode
	String city//id
	String state//id
	String country//id
	String information//info extra
	String receiverName
	String phone//tel del que recibe
	UserAddressClassification classif
	UserAddressType type
	
	enum UserAddressType{
		BILLING, SHIPPING
	}

	enum UserAddressClassification{
		COMMERCIAL, RESIDENTIAL
	}
}
