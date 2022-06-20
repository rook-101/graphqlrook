package king.queen.graphqlrook.domain.usecase;

import king.queen.graphqlrook.domain.entity.Player;
import king.queen.graphqlrook.domain.entity.PlayerInput;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlayerService {

    Mono<Player> getPlayerById(Integer id);

    Mono<Player> getPlayerByName(String name);

    Flux<Player> getAllPlayers();

    Flux<Player> getPlayersByClub(String club);

    Flux<Player> getPlayersByNationality(String nationality);

    Mono<Player> addPlayer(PlayerInput playerInput);

    Mono<Player> updatePlayer(Integer id, PlayerInput playerInput);

    Mono<Player> deletePlayerById(Integer id);

    Mono<Player> deletePlayerByName(String name);

}
