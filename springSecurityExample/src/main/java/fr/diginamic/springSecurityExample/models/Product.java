/**
 * 
 */
package fr.diginamic.springSecurityExample.models;

/**
 * @author StephanieMC
 *
 */
public class Product {
	private Long id;
	private String title;
	private String description;

	public Product() {
	}

	public Product(Long id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {

		return "Product [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}
