package dev.jb.zermelo.api;

import dev.jb.zermelo.api.models.Token;

import java.util.concurrent.CompletableFuture;

public class TokenCache {

    private Token token;

    public TokenCache(Token token) {
        this.token = token;
    }

    public CompletableFuture<Token> provide() {
        return CompletableFuture.completedFuture(token); // todo ~ Automatic refreshing
    }

    public void refresh(Token token) {
        this.token = token;
    }

}
