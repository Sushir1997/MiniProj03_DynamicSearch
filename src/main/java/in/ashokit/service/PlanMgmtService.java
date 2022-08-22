package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.PlanDtlsEntity;

public interface PlanMgmtService {
	public String createPlanService(PlanDtlsEntity entity);
	public List<String> getPlanCategoryName();


}
