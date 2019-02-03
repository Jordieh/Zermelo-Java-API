package dev.jb.zermelo.api.gson;

import com.google.gson.*;
import dev.jb.zermelo.api.models.AuthenticationToken;

import java.lang.reflect.Type;
import java.util.Calendar;

public class AuthenticationTokenAdapter implements JsonSerializer<AuthenticationToken>, JsonDeserializer<AuthenticationToken> {

    @Override
    public AuthenticationToken deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject object = element.getAsJsonObject();
        Calendar expire = Calendar.getInstance();
        expire.add(Calendar.SECOND, object.get("expires_in").getAsInt());
        return new AuthenticationToken(object.get("access_token").getAsString(), object.get("token_type").getAsString(), expire);
    }

    @Override
    public JsonElement serialize(AuthenticationToken token, Type type, JsonSerializationContext context) {
        JsonObject out = new JsonObject();
        out.addProperty("access_token", token.getAccessToken());
        out.addProperty("token_type", token.getType());
        out.addProperty("expires_in", token.getExpirationTime().getTimeInMillis() - System.currentTimeMillis());
        return out;
    }

}
