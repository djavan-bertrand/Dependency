package sousoum.com.dependencylib

/**
 * Info about the lib.
 */
public class Info {
    /**
     * Returns the version of the lib.
     *
     * @return the version as string
     */
    public fun version(): String {
        return "2.0.0"
    }

    /**
     * Function that will only be accessible in the v2 of the lib
     *
     * @return a string
     */
    public fun v2Function(): String {
        return "Hello world"
    }
}