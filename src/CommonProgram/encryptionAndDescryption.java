package CommonProgram;

import java.util.Base64;

public class encryptionAndDescryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password="password@1234";
		byte[] encrypt=Base64.getEncoder().encode(password.getBytes());
		System.out.println("encrypted password is--->" + new String(encrypt) );
		
		byte[] decrypt=Base64.getDecoder().decode(encrypt);
		System.out.println("DECRYPTED PASSWORD IS ---->" + new String(decrypt)) ;

	}

}
