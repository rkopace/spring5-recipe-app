package guru.springframework.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ingredient {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String description;
	private BigDecimal amount;
	
	@ManyToOne
	private Recipe recipe;
	
	@OneToOne(fetch = FetchType.EAGER)
	private UnitOfMeasure unitOfMsr;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public UnitOfMeasure getUnitOfMsr() {
		return unitOfMsr;
	}

	public void setUnitOfMsr(UnitOfMeasure unitOfMsr) {
		this.unitOfMsr = unitOfMsr;
	}
	
	
}
