package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.PlanDtlsEntityBinding;
import in.ashokit.entity.PlanDtlsEntity;
import in.ashokit.service.PlanMgmtServiceImpl;

@RestController
public class PlanMgmtController {
@Autowired
	private PlanMgmtServiceImpl service;
@PostMapping("/createplan")
	public String createPlan(@RequestBody  PlanDtlsEntityBinding binding) {
	System.out.println("Create Plan Method started");
	 PlanDtlsEntity entity=new  PlanDtlsEntity();
	 entity.setPlanName(binding.getPlanName());
	 entity.setPlanCategory(binding.getPlanCategory());
	 entity.setPlanStartDate(binding.getPlanStartDate());
	 entity.setPlanEndDate(binding.getPlanEndDate());
      return service.createPlanService(entity);
}

@GetMapping("/category")
public List<String> getPlanCategoryName() {
return service.getPlanCategoryName();
}
	
}
