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
        return "1.0.0"
    }

    /**
     * Function that will only be accessible in the v1 of the lib
     *
     * @return a string
     */
    public fun v1Function(): String {
        return "Hello world"
    }
}