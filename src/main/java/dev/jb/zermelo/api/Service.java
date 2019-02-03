package dev.jb.zermelo.api;

import dev.jb.zermelo.api.models.Announcement;
import dev.jb.zermelo.api.models.Appointment;
import dev.jb.zermelo.api.models.AuthenticationToken;
import dev.jb.zermelo.api.models.Token;
import dev.jb.zermelo.api.request.AppointmentParameters;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public interface Service {

    @GET("announcements")
    CompletableFuture<Collection<Announcement>> getAnnouncements(@Query("user") String user, @Query("current") boolean current, @Query("access_token") Token token);

    @GET("announcements")
    CompletableFuture<Collection<Announcement>> getAnnouncements(@Query("user") String user, @Query("current") boolean current, @Query("start") long start, @Query("end") long end, @Query("access_token") Token token);

    default CompletableFuture<Collection<Announcement>> getAnnouncements(Token token) {
        return getAnnouncements("~me", false, token);
    }

    default CompletableFuture<Collection<Announcement>> getAnnouncements(Token token, long start, long end) {
        return getAnnouncements("~me", false, start, end, token);
    }

    @POST("oauth/token?grant_type=authorization_code")
    CompletableFuture<AuthenticationToken> exchangeToken(@Query("code") String code);

    default CompletableFuture<Collection<Appointment>> getAppointments(Token token, long start, long end) {
        return getAppointments(token, new AppointmentParameters().user("~me").start(start).end(end));
    }

    @GET("appointments")
    CompletableFuture<Collection<Appointment>> getAppointments(@Query("access_token") Token token, @QueryMap AppointmentParameters parameters);

}
