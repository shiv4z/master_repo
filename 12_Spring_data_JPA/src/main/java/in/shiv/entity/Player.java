package in.shiv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="PLAYER_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
	
	@Id
	@Column(name="PLAYER_ID")
	private Integer playerId;
	
	@Column(name="PLAYER_NAME")
	private String playerName;
	
	@Column(name="PLAYER_AGE")
	private Integer playerAge;
	
	@Column(name="PLAYER_LOCATION")
	private String location;

}
