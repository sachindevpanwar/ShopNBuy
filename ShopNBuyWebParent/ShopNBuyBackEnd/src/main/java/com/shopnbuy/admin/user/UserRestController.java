package com.shopnbuy.admin.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class UserRestController {

  @Autowired
  private UserService userService;

  @PostMapping("/users/check_email")
  public String checkDuplicateEmail(@Param("id") Integer id, @Param("email") String email) {

    return userService.isEmailUnique(id, email) ? "OK" : "Duplicated";
  }

}
