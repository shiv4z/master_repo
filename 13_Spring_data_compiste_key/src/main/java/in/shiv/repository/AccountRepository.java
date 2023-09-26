package in.shiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shiv.entity.Account;
import in.shiv.entity.AccountPk;

public interface AccountRepository extends JpaRepository<Account, AccountPk>{

}
