package guru.springframework.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Recipe {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		//identity - automatic generation
		private Long id;
		
	    private String description;
	    private Integer prepTime;
	    private Integer cookTime;
	    private Integer servings;
	    private String source;
	    private String url;
	    private String directions;
	    //todo add
	    //private Difficulty difficulty;
	    
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receipe")
	    private Set<Ingredient> ingredient;
	    
	    @Lob
	    private Byte[] image;

	    @Enumerated(value = EnumType.STRING)
	    private Difficulty difficulty;
	    
	    @OneToOne(cascade = CascadeType.ALL)
	    private Notes notes;
	    
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Set<Ingredient> getIngredient() {
			return ingredient;
		}
		public void setIngredient(Set<Ingredient> ingredient) {
			this.ingredient = ingredient;
		}
		public Difficulty getDifficulty() {
			return difficulty;
		}
		public void setDifficulty(Difficulty difficulty) {
			this.difficulty = difficulty;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Integer getPrepTime() {
			return prepTime;
		}
		public void setPrepTime(Integer prepTime) {
			this.prepTime = prepTime;
		}
		public Integer getCookTime() {
			return cookTime;
		}
		public void setCookTime(Integer cookTime) {
			this.cookTime = cookTime;
		}
		public Integer getServings() {
			return servings;
		}
		public void setServings(Integer servings) {
			this.servings = servings;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getDirections() {
			return directions;
		}
		public void setDirections(String directions) {
			this.directions = directions;
		}
		public Byte[] getImage() {
			return image;
		}
		public void setImage(Byte[] image) {
			this.image = image;
		}
		public Notes getNotes() {
			return notes;
		}
		public void setNotes(Notes notes) {
			this.notes = notes;
		}
	    
	    
}
