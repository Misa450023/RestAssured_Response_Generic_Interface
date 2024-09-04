package rest;

public class Payload {
	
	
String clientName;
String clientEmail;


public String getClientName() {
	return clientName;
}
public void setClientName(String clientName) {
	this.clientName = clientName;
}
public String getClientEmail() {
	return clientEmail;
}
public void setClientEmail(String clientEmail) {
	this.clientEmail = clientEmail;
}
public Payload(String clientName, String clientEmail) {
	
	this.clientName = clientName;
	this.clientEmail = clientEmail;
}
public Payload() {
	
}





}
