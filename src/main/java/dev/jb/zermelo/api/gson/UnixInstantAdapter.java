package dev.jb.zermelo.api.gson;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.Instant;

public class UnixInstantAdapter implements JsonSerializer<Instant>, JsonDeserializer<Instant> {

    @Override
    public Instant deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        return Instant.ofEpochSecond(element.getAsLong());
    }

    @Override
    public JsonElement serialize(Instant instant, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(instant.getEpochSecond());
    }

}
