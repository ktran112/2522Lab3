package ca.bcit.comp2522lab3;

import java.util.Objects;

/**
 * Represents an iPad device.
 *
 * @author Tommy White
 * @author Kiet Tran
 *
 * @version 1.0
 */
public class IPad extends IDevice
{

    private static final String purpose = "learning";

    private boolean hasCase;

    private String operatingSystem;

    /**
     * Creates an iPad with case status and OS.
     *
     * @param hasCase if device has a case
     * @param operatingSystem type of OS
     */
    public IPad(final boolean hasCase,
                final String operatingSystem)
    {
        super(purpose);

        validateOperatingSystem(operatingSystem);

        this.hasCase = hasCase;
        this.operatingSystem = operatingSystem;
    }

    private static void validateOperatingSystem(String operatingSystem)
    {
        if (operatingSystem == null)
        {
            throw new IllegalArgumentException("Operating system cannot be null");
        }

        if (operatingSystem.isBlank())
        {
            throw new IllegalArgumentException("Must have an operating system");
        }
    }

    /**
     * Prints iPad details.
     */
    @Override
    void printDetails()
    {
        System.out.println("Has a case: " +
                hasCase +
                "\nOperating System: " +
                operatingSystem);
    }

    /**
     * Returns details as a string.
     *
     * @return formatted string
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "\nHas a case: " +
                hasCase +
                "\nOperating System: " +
                operatingSystem;
    }

    /**
     * Checks if device has a case.
     *
     * @return true if it has a case
     */
    public final boolean getHasCase()
    {
        return hasCase;
    }

    /**
     * Gets the operating system.
     *
     * @return OS name
     */
    public final String getOperatingSystem()
    {
        return operatingSystem;
    }

    /**
     * Add or remove case to iPad.
     *
     * @param hasCase true or false, whether wanting to put on case
     */
    public void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    /**
     * Change operating system of iPad.
     *
     * @param operatingSystem the new operating system
     */
    public void setOperatingSystem(final String operatingSystem)
    {
        if (operatingSystem.isBlank())
        {
            throw new IllegalArgumentException("Operating System cannot be left blank");
        }

        this.operatingSystem = operatingSystem;
    }

    /**
     * Compares this iPad to another object.
     *
     * @param obj object to compare
     *
     * @return true if OS matches
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (obj == null)
        {
            return false;
        }

        if (!(obj instanceof IPad))
        {
            return false;
        }

        final IPad that;

        that = (IPad) obj;

        return this.operatingSystem.equals(that.operatingSystem);
    }

    /**
     * Gets hash code based on OS.
     *
     * @return hash code
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(operatingSystem);
    }

}