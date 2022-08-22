package in.ashokit.binding;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Data;

@Data
public class PlanDtlsEntityBinding {

	private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planCategory;
}
