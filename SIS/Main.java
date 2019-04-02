
public class Main {

	public static void main(String [] args) throws InterruptedException {
		
		SSNInput ssn = new SSNInput();
		String ssn1 = ssn.SSNinput();
				
		cocType coc = new cocType();
		String cocType = coc.getCocType();
		
		cocSelection select = new cocSelection();
		select.Selection(cocType, ssn1);
		//select.Selection(null, ssn1);
	
		
}
}	
	
