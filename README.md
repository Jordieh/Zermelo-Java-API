# Zermelo-Java-API
Zermelo Java API using Retrofit &amp; Gson

## Basic usage
```java
public static void main(String[] args) {
    new Zermelo(Version.V3, "myschool", new Retrofit.Builder(), new GsonBuilder(), new SystemLogger());
}
```
