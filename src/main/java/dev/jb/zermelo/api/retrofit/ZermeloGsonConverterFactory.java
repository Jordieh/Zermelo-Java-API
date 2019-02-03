package dev.jb.zermelo.api.retrofit;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class ZermeloGsonConverterFactory extends Converter.Factory {

    private final Gson gson;
    private final GsonConverterFactory delegate; // TODO: Use our own implementation to eliminate dependency usage

    public ZermeloGsonConverterFactory(Gson gson) {
        this.delegate = GsonConverterFactory.create(gson);
        this.gson = gson;
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return new ZermeloGsonResponseBodyConverter<>(gson, TypeToken.get(type));
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }

}
