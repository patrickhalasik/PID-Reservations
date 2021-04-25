package be.iccbxl.pid.entity;

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

public class Artist_type {
	@Id
	@GeneratedValue
	
	private long id;
	private Artist artist_id;
	private Type type_id;
}
