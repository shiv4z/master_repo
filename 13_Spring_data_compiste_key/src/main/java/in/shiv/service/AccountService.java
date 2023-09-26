package in.shiv.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.shiv.entity.Account;
import in.shiv.entity.AccountPk;
import in.shiv.repository.AccountRepository;

@Service
//@AllArgsConstructor
public class AccountService {
	
	private AccountRepository accountRepository;
	
	public AccountService( AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	public void getData() {
		AccountPk pk=new AccountPk();
		pk.setAccId(101);
		pk.setAccType("SAVING");;
		pk.setHolderName("SHIV");
		Optional<Account> optional = accountRepository.findById(pk);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
	}
	
	
	
	public void SaveData() {
		
		AccountPk pk=new AccountPk();
		pk.setAccId(102);
		pk.setAccType("CURRENT");
		pk.setHolderName("RISHI");
		
		
		Account account=new Account();
		account.setBranchName("HYDERABAD");
		account.setMinBal(5000.0);
		account.setAccId(pk);
		accountRepository.save(account);
	}

}
