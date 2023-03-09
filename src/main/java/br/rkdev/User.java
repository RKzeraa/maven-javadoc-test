package br.rkdev;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa o usuário
 */


@Getter
@Setter
@AllArgsConstructor
public class User {

    private String username;

    private String password;

    private StatusUser status;

    /**
     * Desabilita o usuário informando setando o status DISABLED
     */
    public void disable() { this.status = StatusUser.DISABLED; }

    /**
     * Habilita o usuário informando setando o status ENABLED
     */
    public void enable() { this.status = StatusUser.ENABLED; }

}
