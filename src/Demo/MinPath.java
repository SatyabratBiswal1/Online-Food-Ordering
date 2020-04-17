package Demo;
import java.util.HashMap;

import com.twilio.sdk.*;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Account;

public class MinPath {
	public static void main(String[] args) throws TwilioRestException{
		TwilioRestClient client = new TwilioRestClient(System.getenv("TWILIO_ACCOUNT_SID"),System.getenv("TWILIO_AUTH_TOKEN"));
		Account account = client.getAccount();
		SmsFactory factory = account.getSmsFactory();
		HashMap<String,String> msg = new HashMap<>();
		msg.put("To","+8249561618");
		msg.put("From","7873553244");
		msg.put("Body","hii satyabrat");
		
		factory.create(msg);
		
	}
	
}
