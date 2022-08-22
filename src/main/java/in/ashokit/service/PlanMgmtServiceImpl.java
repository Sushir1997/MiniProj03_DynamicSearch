package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.PlanDtlsEntity;
import in.ashokit.repository.CreatePlanRepository;
import in.ashokit.repository.GetPlanCategoryNameRepository;

@Service
public class PlanMgmtServiceImpl implements PlanMgmtService {
	@Autowired
	private CreatePlanRepository planRepo;
	@Autowired
	private GetPlanCategoryNameRepository categoryRepo;

	public String createPlanService(PlanDtlsEntity entity) {
                planRepo.save(entity);
		return "Plan Saved Successfully";
	}

	public List<String> getPlanCategoryName() {
		
		return categoryRepo.getCategoryName();
	}

}
