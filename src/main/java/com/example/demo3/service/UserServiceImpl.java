package com.example.demo3.service;

import com.example.demo3.entity.Account;
import com.example.demo3.entity.User;
import com.example.demo3.utils.AccountType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User gerUserById(Integer userId) {
        User user = new User();

        if(userId.equals(1)){
            user.setUserId(1);
            user.setUserName("FAIZAL");
            Map<String,Account> accountMap = new HashMap<String,Account>();
            Account account = new Account();
            account.setAccountType(AccountType.SAVINGS);
            account.setAccountNumber(2124);
            account.setAccountBalance(3000.00);
            accountMap.put(user.getUserName(),account);
            user.setAccountMap(accountMap);

        }
        return user;
    }
}
