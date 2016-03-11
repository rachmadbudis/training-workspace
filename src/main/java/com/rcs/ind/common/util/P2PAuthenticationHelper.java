package com.rcs.ind.common.util;

import java.security.MessageDigest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class helps to authenticate two points that share a private key.
 * 
 * @author marce
 *
 */
public class P2PAuthenticationHelper {

	private static final Logger logger = LoggerFactory.getLogger(P2PAuthenticationHelper.class);
	private static final String SHA256 = "SHA-256";

	/**
	 * Return a token valid for authentication.
	 * 
	 * @param params
	 *            parameters sent in the request
	 * @param privateKey
	 *            shared private key
	 * @return
	 */
	public static String getAuthenticationTokenParam(String params, String privateKey) {
		String shaWord = params.replace(":", ":" + privateKey + ":");
		return generateSHA(shaWord);
	}

	/**
	 * Return a hashed string.
	 * 
	 * @param word
	 *            string to hash
	 * @return
	 */
	protected static String generateSHA(String word) {
		try {
			MessageDigest md = MessageDigest.getInstance(SHA256);
			md.update(word.getBytes());
			byte byteData[] = md.digest();

			// Convert the byte to hex format.
			StringBuilder hexString = new StringBuilder();
			for (int i = 0; i < byteData.length; i++) {
				String hex = Integer.toHexString(0xff & byteData[i]);
				if (hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}

			return hexString.toString().toUpperCase();
		} catch (Exception e) {
			logger.error("Error executing generateSHA() in P2PAuthenticationHelper. Exception: " + e.getMessage(), e);
		}
		return null;
	}
}
