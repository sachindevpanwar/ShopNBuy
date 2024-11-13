package com.shopnbuy.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.common.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>  {

}
