package com.negocil.negoturismo.admin.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.security.crypto.encrypt.AesBytesEncryptor;

import java.util.Base64;

@ConfigurationProperties(prefix = "crypto")
public record CryptoProperties(String secretKey, String salt, AesBytesEncryptor encryptor) {

    @ConstructorBinding
    public CryptoProperties(String secretKey, String salt) {
        this(
                secretKey,
                salt,
                new AesBytesEncryptor(
                        secretKey,
                        salt,
                        AesBytesEncryptor.CipherAlgorithm.GCM.defaultIvGenerator()
                )
        );
    }

    public String encrypt(String plainText) {
        byte[] encrypted = encryptor.encrypt(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public String decrypt(String encryptedBase64) {
        byte[] decrypted = encryptor.decrypt(Base64.getDecoder().decode(encryptedBase64));
        return new String(decrypted);
    }
}