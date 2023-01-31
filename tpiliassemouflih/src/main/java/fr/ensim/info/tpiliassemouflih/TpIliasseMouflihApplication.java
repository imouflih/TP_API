package fr.ensim.info.tpiliassemouflih;

import fr.ensim.info.tpiliassemouflih.model.Address;
import fr.ensim.info.tpiliassemouflih.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TpIliasseMouflihApplication implements ApplicationRunner{

	@Bean
	public org.springframework.web.client.RestTemplate restTemplate(){
		return new org.springframework.web.client.RestTemplate();
	}


	@Autowired
	AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpIliasseMouflihApplication.class, args);

	}

	//Fonction qui se lance au demarrage de l'application qui nous permettra d'ajouter des lignes à la table automatiquement
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		Address address1 = new Address(
				1L,
				new Date(),
				"16 bd charles nicolle",
				"Nicolas"
		);

		Address address2 = new Address(
				2L,
				new Date(),
				"7 rue la paix",
				"François"
		);
		Address address3 = new Address(
				3L,
				new Date(),
				"146 rue gaulle",
				"Guillaume"
		);

		addressRepository.save(address1);
		addressRepository.save(address2);
		addressRepository.save(address3);
	}

}
