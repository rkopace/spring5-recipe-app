package guru.springframework.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ingredient {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String description;
	private BigDecimal amount;
	
	@ManyToOne
	Recipe recipe;
	
	AAA
	
}
