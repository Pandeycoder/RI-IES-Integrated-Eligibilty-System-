package in.pandey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pandey.entities.EligEntity;

public interface EligRepo extends JpaRepository<EligEntity, Integer> {
}
