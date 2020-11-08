package com.farmaciasperuanas.ecommerce.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.util.encoders.Hex;

public final class Util {

	private static final String AUTH_HEADER_KEY = "Authorization";
	private static final String AUTH_HEADER_VALUE_PREFIX = "Bearer "; // with trailing space to separate token


	private Util() {}

	public static boolean isEmptyWithTrim(String character) {
		return (character == null) || (character.trim().length() == 0);
	}

	public static boolean isNotNull(Object object) {
		return (object != null);
	}


	public static String encodeSHA256(String originalString)
			throws NoSuchAlgorithmException {

		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(
				originalString.getBytes(StandardCharsets.UTF_8));
		String sha256hex = new String(Hex.encode(hash));
		return sha256hex;
	}

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String password = "123456";
		System.out.println(Util.encodeSHA256(password));
	}
}
