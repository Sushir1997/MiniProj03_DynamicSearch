package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="PLAN_DTLS_ENTITY")
public class PlanDtlsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PLAN_ID")
	private Integer planId;
	@Column(name="PLAN_NAME")
	private String planName;
	@Column(name="PLAN_START_DATE")
	private LocalDate planStartDate;
	@Column(name="PLAN_END_DATE")
	private LocalDate planEndDate;
	@Column(name="PLAN_CATEGORY")
	private String planCategory;


}
