package in.shiv.repo;

import org.springframework.data.repository.CrudRepository;

import in.shiv.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer>{

}
