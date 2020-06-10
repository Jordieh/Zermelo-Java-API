package dev.jb.zermelo.api.retrofit;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import okhttp3.ResponseBody;
import retrofit2.Converter;

import java.io.IOException;
import java.io.Reader;

/**
 * Converter that extracts special Zermelo data inside an encapsulated 'response.data' json object.
 */
public class ZermeloGsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    private final Gson gson;
    private final TypeToken<T> type;

    public ZermeloGsonResponseBodyConverter(Gson gson, TypeToken<T> type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody f) throws IOException {
        try (Reader reader = f.charStream()) {
            JsonElement tree = gson.fromJson(reader, JsonElement.class);

            // Extract data from Zermelo specific objects
            if (tree.isJsonObject()) {
                JsonObject in = tree.getAsJsonObject();

                // The json data component is inside the 'response' object
                JsonElement response = in.get("response");
                if (response != null && response.isJsonObject()) {
                    in = response.getAsJsonObject();
                    // Extract the data object
                    if (in.has("data")) {
                        tree = in.get("data");
                    }
                }
            }

            System.out.println("TREE: " + tree);
            return gson.fromJson(tree, type.getType());
        }
    }

}
