package dev.jb.zermelo.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.jb.zermelo.api.gson.AuthenticationTokenAdapter;
import dev.jb.zermelo.api.gson.TokenSerializer;
import dev.jb.zermelo.api.gson.UnixInstantAdapter;
import dev.jb.zermelo.api.logger.SystemLogger;
import dev.jb.zermelo.api.logger.ZermeloLogger;
import dev.jb.zermelo.api.models.AuthenticationToken;
import dev.jb.zermelo.api.models.Token;
import dev.jb.zermelo.api.retrofit.ZermeloGsonConverterFactory;
import retrofit2.Retrofit;

import java.time.Instant;

/**
 * This is the main API Gateway.
 *
 * @author Jordieh
 * @implSpec https://confluence.zermelo.nl/display/DEV/Introduction
 */
public class Zermelo {

    public static void main(String[] args) {
        new Zermelo(Version.V3, "myschool", new Retrofit.Builder(), new GsonBuilder(), new SystemLogger());
    }

    private final Version version;
    private final Service service;
    private final Gson gson;
    private final ZermeloLogger logger;
    private final TokenCache tokenCache;

    /**
     * Creates a Zermelo API interface.
     *
     * @param version The Zermelo version (Only {@link Version#V3} is properly supported.
     * @param school  The school (###.zportal.nl).
     * @param builder A Retrofit builder instance.
     * @param gson    A Gson instance (Complementary adapters will be added to support the library).
     * @param logger  Logger instance.
     */
    public Zermelo(Version version, String school, Retrofit.Builder builder, GsonBuilder gson, ZermeloLogger logger) {
        this.version = version;
        this.logger = logger;
        this.gson = gson
                .registerTypeAdapter(Token.class, new TokenSerializer())
                .registerTypeAdapter(AuthenticationToken.class, new AuthenticationTokenAdapter())
                .registerTypeAdapter(Instant.class, new UnixInstantAdapter())
                .setVersion(version.getNumber()) // todo
                .create();
        this.service = builder
                .baseUrl("https://" + school + ".zportal.nl/api/" + version.getVersion() + "/")
                .addConverterFactory(new ZermeloGsonConverterFactory(this.gson))
                .build()
                .create(Service.class);
        this.tokenCache = new TokenCache(null);
    }

    public Version getVersion() {
        return version;
    }

    public ZermeloLogger getLogger() {
        return logger;
    }

    /**
     * Returns the API service.
     *
     * @return The API service.
     */
    public Service getService() {
        return service;
    }

    public Gson getGson() {
        return gson;
    }

    public TokenCache getTokenCache() {
        return tokenCache;
    }

}
