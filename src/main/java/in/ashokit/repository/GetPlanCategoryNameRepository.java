package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.PlanCategoryNameEntity;

public interface GetPlanCategoryNameRepository extends JpaRepository<PlanCategoryNameEntity,Integer> {
   @Query("select categoryName from PlanCategoryNameEntity")
	public List<String> getCategoryName();
}
