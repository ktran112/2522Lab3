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

    private void validateOperatingSystem(String operatingSystem)
    {
        if (operatingSystem == null || operatingSystem.isBlank())
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
     * @return formatted string
     */
    @Override
    public String toString()
    {
        return super.toString() + "\n" +
                "Has a case: " +
                hasCase +
                "\nOperating System: " +
                operatingSystem;
    }

    /**
     * Checks if device has a case.
     * @return true if it has a case
     */
    public final boolean getHasCase()
    {
        return hasCase;
    }

    /**
     * Gets the operating system.
     * @return OS name
     */
    public final String getOperatingSystem()
    {
        return operatingSystem;
    }

    private void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    private void setOperatingSystem(final String operatingSystem)
    {
        if (Objects.equals(operatingSystem, ""))
        {
            throw new IllegalArgumentException("Operating System cannot be left blank");
        }
        this.operatingSystem = operatingSystem;
    }

    /**
     * Compares this iPad to another object.
     * @param obj object to compare
     * @return true if OS matches
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        final IPad other = (IPad) obj;
        return Objects.equals(operatingSystem, other.operatingSystem);
    }

    /**
     * Gets hash code based on OS.
     * @return hash code
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(operatingSystem);
    }

}