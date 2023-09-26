package in.shiv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYER_INFO")
public class Player {
	
	@Id
	@Column(name="PLAYER_ID")
	private Integer playerId;
	
	@Column(name="PLAYER_NAME")
	private String playerName;
	
	@Column(name="PLAYER_AGE")
	private Integer playerAge;
	
	private String location;
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
