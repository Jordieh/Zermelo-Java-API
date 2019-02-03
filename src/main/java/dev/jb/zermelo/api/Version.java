package dev.jb.zermelo.api;

public enum Version {

    V1(false, "v1", 1),
    V2(false, "v2", 2),
    V3(true, "v3", 3);

    private final boolean supported;
    private final String version;
    private final int number;

    Version(boolean supported, String version, int number) {
        this.supported = supported;
        this.version = version;
        this.number = number;
    }

    public boolean isSupported() {
        return supported;
    }

    public String getVersion() {
        return version;
    }

    public int getNumber() {
        return number;
    }

}
