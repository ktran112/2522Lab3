package ca.bcit.comp2522lab3;

import java.util.Objects;

/**
 * Represents an iPhone 17 mobile device.
 *
 * @author Tommy White
 * @author Kiet Tran
 *
 * @version 1.0
 */
public class IPhone17 extends IPhone
{
    private static final double MIN_MEMORY_GB = 0;

    private final boolean highResCamera;
    private double memoryGB;

    /**
     * Constructs an IPhone17 with all specified details.
     *
     * @param minLeftOnPhonePlan minutes remaining on the plan
     * @param carrier the service provider
     * @param highResCamera true if it has a high-res camera
     * @param memoryGB memory in gigabytes
     */
    public IPhone17(final double minLeftOnPhonePlan,
                    final String carrier,
                    final boolean highResCamera,
                    double memoryGB)
    {
        super(minLeftOnPhonePlan, carrier);

        validateMemoryGB(memoryGB);

        this.highResCamera = highResCamera;
        this.memoryGB = memoryGB;
    }

    /**
     * Constructs an IPhone17 with a standard camera by default.
     *
     * @param minLeftOnPhonePlan minutes remaining on the plan
     * @param carrier the service provider
     * @param memoryGB memory in gigabytes
     */
    public IPhone17(final double minLeftOnPhonePlan,
                    final String carrier,
                    int memoryGB)
    {
        this(minLeftOnPhonePlan, carrier, false, memoryGB);
    }

    /*
     * Validates memory (in Gigabytes).
     * Constraints:
     * - Cannot lesser than minimum memory (in Gigabytes)
     *
     * @param purpose The purpose to be validated
     */
    private void validateMemoryGB(final double memoryGB)
    {
        if (memoryGB < MIN_MEMORY_GB)
        {
            throw new IllegalArgumentException("Cannot have less than the minimum memory");
        }
    }

    /**
     * Returns a string representation of the iPhone 17.
     *
     * @return details of the iPhone 17
     */
    @Override
    public final String toString()
    {
        return super.toString() +
                "\nHigh Resolution Camera: " +
                this.highResCamera +
                "\nMemory in gigabytes: " +
                   this.memoryGB;
    }

    /**
     * Returns the amount of memory in gigabytes.
     *
     * @return this.memoryGB memory in gigabytes
     */
    public final double getMemoryGB()
    {
        return this.memoryGB;
    }

    /**
     * Returns if the iPhone 17 has a high resolution camera.
     *
     * @return this.highResCamera
     */
    public final boolean getHighResCamera()
    {
        return this.highResCamera;
    }

    /*
     * Setter for memory (In gigabytes).
     *
     * @param memoryGB New value for memory
     */
    private final void setMemoryGB(final double memoryGB)
    {
        this.memoryGB = memoryGB;
    }

    /**
     * Compares this iPhone 17 to another object for equality.
     *
     * @param obj the object to compare
     * @return true if minutes left and camera resolution match
     */
    @Override
    public final boolean equals(final Object obj)
    {
        if (obj == null)
        {
            return false;
        }

        if (!(obj instanceof IPhone17))
        {
            return false;
        }

        final IPhone17 that;
        that = (IPhone17) obj;

        return Objects.equals(this.getMinutesLeftOnPhonePlan(), that.getMinutesLeftOnPhonePlan())
                && Objects.equals(this.highResCamera, that.highResCamera);
    }

    /**
     * Generates a hash code for this iPhone 17.
     *
     * @return integer hash code
     */
    @Override
    public final int hashCode()
    {
        return Double.hashCode(this.getMinutesLeftOnPhonePlan()
                + Boolean.hashCode(this.highResCamera));
    }
}