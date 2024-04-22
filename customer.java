public class customer {
public int customerID;
public String custname;
public String address;
public int getcustomerID() {
	return customerID;
}
public String getcustname() {
	return  custname;
}
public String getaddress() {
	return  address;
}
public void setcustomerID(int customerID) {
	this.customerID= Math.abs(customerID);
}
public void setcustname(String custname) {
	this.custname= custname;
}
public void setaddress(String address) {
	this.address= address;
}
public customer(int customerID , String custname , String address) {
	this.customerID=Math.abs(customerID);
	this.custname=custname;
	this.address=address;
}

}
