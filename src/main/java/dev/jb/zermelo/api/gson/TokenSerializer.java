package dev.jb.zermelo.api.gson;

import com.google.gson.*;
import dev.jb.zermelo.api.models.Token;

import java.lang.reflect.Type;

public class TokenSerializer implements JsonSerializer<Token> {

    @Override
    public JsonElement serialize(Token token, Type type, JsonSerializationContext context) {
        JsonElement e = new JsonPrimitive(token.getToken());
        System.out.println("ËLEMENT: " + e);
        return e;
    }

}
