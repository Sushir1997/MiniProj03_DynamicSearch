package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PLAN_CATEGORY_NAME_ENTITY")
public class PlanCategoryNameEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CATEGORY_NAME_ID")
	private Integer categoryNameId;
	@Column(name="CATEGORY_NAME")
	private String categoryName; 
}
