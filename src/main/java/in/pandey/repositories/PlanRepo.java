package in.pandey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pandey.entities.PlanEntity;

public interface PlanRepo extends JpaRepository<PlanEntity, Integer> {
}
