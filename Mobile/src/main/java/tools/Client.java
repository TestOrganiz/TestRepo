package tools;

import java.util.Arrays;
import java.util.List;

public class Client {
	
	String numeClient,codClient,regiune,localitate,adresa,telefon;

	public static Client generateNewClient() {
		Client client = new Client();
		client.numeClient = RandomGenerators.getRandomString("numeClient");
		client.codClient = RandomGenerators.getRandomString("codClient");
		client.regiune = RandomGenerators.getRandomString("regiune");
		client.localitate = RandomGenerators.getRandomString("localitate");
		client.adresa = RandomGenerators.getRandomString("adresa");
		client.telefon = RandomGenerators.getRandomString("telefon");
		Client.saveClientToFile(client);
		return client;
	}
	
	public static Client getRandomExistingClient() {
		List<String> existingClientsList = FileUtils
				.getFileLinesAsList(Constants.EXISTING_CLIENTS_FILE_PATH);
		// we remove the first line which is the header
		existingClientsList.remove(0);
		String clientInfo = StringUtils
				.getRandomItemFromList(existingClientsList);
		List<String> clientDetails = Arrays.asList(StringUtils
				.getSubstringsSplitByKey(clientInfo, ","));
		Client client = new Client();
		client.numeClient = clientDetails.get(0);
		client.codClient = clientDetails.get(1);
		client.regiune = clientDetails.get(2);
		client.localitate = clientDetails.get(3);
		client.adresa = clientDetails.get(4);
		client.telefon = clientDetails.get(5);
		return client;
	}
	
	public static String getClientDetailsForCSV(Client client) {
		String clientDetailsForCSV = "\n";
		for (String detail : Arrays.asList(client.numeClient, client.codClient,
				client.regiune, client.localitate, client.adresa, client.telefon)) {
			clientDetailsForCSV += detail.toString() + ",";
		}
		return clientDetailsForCSV;
	}

	public static void saveClientToFile(Client client) {
		FileUtils.writeToFile(Constants.EXISTING_CLIENTS_FILE_PATH,
				getClientDetailsForCSV(client), true);
	}
	
	
	//test
	
	
	public static void main(String[] args){
		
		for (int i=0;i<10;i++){
			
			generateNewClient();
		}
		
		
	}

}
