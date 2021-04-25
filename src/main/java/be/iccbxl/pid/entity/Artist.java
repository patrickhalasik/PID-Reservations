package be.iccbxl.pid.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Artist {
	@Id
	@GeneratedValue
	
	private long id;
	private String firstname;
	private String lastname;
	
	@OneToMany(targetEntity = Artist_type.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "artist type foreign key", referencedColumnName = "id")
	private List<Artist_type> Artist_types;
	
}
