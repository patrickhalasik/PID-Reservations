package be.iccbxl.pid.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Show {
	@Id
	@GeneratedValue
	
	private long id;
	private Location location_id;
	private String slug;
	private String title;
	private String poster_url;
	private boolean bookable;
	private double price;
	private String description;
	private Date created_at;
}
