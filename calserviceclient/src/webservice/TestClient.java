package webservice;

public class TestClient {

	public static void main(String[] args) throws Exception  {
		java.net.URL endPointURL = new java.net.URL("http://localhost:8080/webservice/services/CalService");
		
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		CalServiceSoapBindingStub obj = new CalServiceSoapBindingStub(endPointURL,service);
		int add = obj.add(10, 20);
		int sub = obj.sub(20, 10);
		System.out.println("add result="+add + "subtract result="+sub);
	}

}
