package com.account;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acc.service.AccountService;

@RestController
@RequestMapping(value = "/acc")
public class AccountController {
    Logger log = LoggerFactory.getLogger(this.getClass().getName());    
@Autowired
AccountService accountService;

@GetMapping("/bal/{accno}")
public String getBalance(@PathVariable int accno) {
	System.out.println("AC-getBalance() : "+ accno);
	int balance = 0;
	//return new ResponseEntity<Double>(5000);
	if(accno == 2000) {
		balance = 2000*12;
	}else {
		try {
			throw new NoRecordFoundsException("No Records.");
		}catch(Exception e) {
			String msg = e.getMessage();
			
		}
	}
	log.info("End of controller class");
	return Double.toString(balance);
}

	
@RequestMapping(value = "/accounts",  method = {RequestMethod.GET})
public List<Account> getAllAccount() {
	System.out.println("-----AC-getAllAccounts()------- ");	
	List<Account> acc = accountService.getAccountList();
	System.out.println("Account details : "+ acc);
	return acc;
}

@RequestMapping(value = "/createAccount",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
public ResponseEntity<String> createAccount(@RequestBody Account account) {
	System.out.println("-----Create account-createAccount()------- ");	
	
	accountService.createAccount(account);
	System.out.println("Account Created : ");
	return new ResponseEntity<String>("Ok", HttpStatus.OK);
}

}
