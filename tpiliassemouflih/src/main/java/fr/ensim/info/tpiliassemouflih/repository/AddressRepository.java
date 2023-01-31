package fr.ensim.info.tpiliassemouflih.repository;

import fr.ensim.info.tpiliassemouflih.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}