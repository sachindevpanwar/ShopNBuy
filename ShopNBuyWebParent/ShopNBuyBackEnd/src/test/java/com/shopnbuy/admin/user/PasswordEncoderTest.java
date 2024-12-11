package com.shopnbuy.admin.user;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {
  @Test
  public void testPasswordEncode() {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String rawPassword = "SacchinDevTestPasswordEncoder";

    String encodedPassword = passwordEncoder.encode(rawPassword);

    System.out.println(encodedPassword);
  }

}
