package dev.jb.zermelo.api;

/**
 * <p>
 * This is a 1:1 mapping of the Zermelo version mentioned in the <a href="https://confluence.zermelo.nl/pages/viewpage.action?pageId=15860178">Documentation</a>.
 * </p>
 * Currently, only version {@link Version#V3} is supported by this library.
 *
 * @author Jordieh
 * @see Zermelo#getVersion()
 */
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
