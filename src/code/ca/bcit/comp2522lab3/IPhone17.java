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
    private final boolean highResCamera;
    private double memoryGb;

    /**
     * Constructs an IPhone17 with all specified details.
     * @param minLeftOnPhonePlan minutes remaining on the plan
     * @param carrier the service provider
     * @param highResCamera true if it has a high-res camera
     * @param memoryGb memory in gigabytes
     */
    public IPhone17(final double minLeftOnPhonePlan,
                    final String carrier,
                    final boolean highResCamera,
                    int memoryGb)
    {
        super(minLeftOnPhonePlan, carrier);
        validateMemoryGb(memoryGb);
        this.highResCamera = highResCamera;
        this.memoryGb = memoryGb;
    }

    /**
     * Constructs an IPhone17 with a standard camera by default.
     * @param minLeftOnPhonePlan minutes remaining on the plan
     * @param carrier the service provider
     * @param memoryGb memory in gigabytes
     */
    public IPhone17(final double minLeftOnPhonePlan,
                    final String carrier,
                    int memoryGb)
    {
        this(minLeftOnPhonePlan, carrier, false, memoryGb);
    }

    private void validateMemoryGb(final int memoryGb)
    {
        if (memoryGb < 0)
        {
            throw new IllegalArgumentException("Cannot have negative memory");
        }
    }

    /**
     * Returns a string representation of the iPhone 17.
     * @return details of the iPhone 17
     */
    @Override
    public final String toString()
    {
        return super.toString()
                + "\nHigh Resolution Camera: "
                + this.highResCamera
                + "\nMemory in gigabytes: "
                + this.memoryGb;
    }

    /**
     * Returns the amount of memory in gigabytes.
     * @return this.memoryGb memory in gigabytes
     */
    public final double getMemoryGb()
    {
        return this.memoryGb;
    }

    /**
     * Returns if the iPhone 17 has a high resolution camera.
     * @return this.highResCamera
     */
    public final boolean getHighResCamera()
    {
        return this.highResCamera;
    }

    private final void setMemoryGb(final double memoryGb)
    {
        this.memoryGb = memoryGb;
    }

    /**
     * Compares this iPhone 17 to another object for equality.
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

        return Objects.equals(this.getMinLeftOnPhonePlan(), that.getMinLeftOnPhonePlan())
                && Objects.equals(this.highResCamera, that.highResCamera);
    }

    /**
     * Generates a hash code for this iPhone 17.
     * * @return integer hash code
     */
    @Override
    public final int hashCode()
    {
        return Double.hashCode(this.getMinLeftOnPhonePlan()
                + Boolean.hashCode(this.highResCamera));
    }
}