package in.shiv.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shiv.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable>{

}
