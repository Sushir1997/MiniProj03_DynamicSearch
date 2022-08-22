package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.PlanDtlsEntity;

public interface CreatePlanRepository extends JpaRepository<PlanDtlsEntity, Integer> {

}
