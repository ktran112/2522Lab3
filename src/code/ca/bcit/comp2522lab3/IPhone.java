package ca.bcit.comp2522lab3;

import java.util.Objects;

/**
 * Represents a basic iPhone device.
 *
 * @author Tommy White
 * @author Kiet Tran
 *
 * @version 1.0
 */
public class IPhone extends IDevice
{

    private static final String purpose = "talking";

    private double minLeftOnPhonePlan;

    private String carrier;

    /**
     * Creates an iPhone with minutes and carrier.
     * @param minLeftOnPhonePlan minutes remaining
     * @param carrier service provider
     */
    public IPhone(final double minLeftOnPhonePlan,
                  final String carrier)
    {
        super(purpose);

        validateMinLeftOnPhonePlan(minLeftOnPhonePlan);

        this.minLeftOnPhonePlan = minLeftOnPhonePlan;
        this.carrier = carrier;
    }

    /**
     * Creates an iPhone with minutes only.
     * @param minLeftOnPhonePlan minutes remaining
     */
    public IPhone(final double minLeftOnPhonePlan)
    {
        this(minLeftOnPhonePlan, null);
    }



    private void validateMinLeftOnPhonePlan(final double minLeftOnPhonePlan)
    {
        if (minLeftOnPhonePlan < 0)
        {
            throw new IllegalArgumentException("Cannot have negative minutes on phone plan");  // Okay maybe you can have a negative value,
        }                                                                                      // considering that you would likely just get charged
    }

    /**
     * Prints device details.
     */
    @Override
    void printDetails()
    {
        System.out.println("Time left on phone plan: " +
                minLeftOnPhonePlan +
                " minutes\n" +
                "Carrier: " +
                carrier);
    }

    /**
     * Returns device details as a string.
     * @return formatted string
     */
    @Override
    public String toString()
    {
        return super.toString() + "\n" +
                "Time left on phone plan: " +
                minLeftOnPhonePlan +
                " minutes\n" +
                "Carrier: " +
                carrier;
    }

    /**
     * Gets minutes remaining.
     * @return minutes
     */
    public final double getMinLeftOnPhonePlan()
    {
        return minLeftOnPhonePlan;
    }

    /**
     * Gets carrier name.
     * @return carrier
     */
    public final String getCarrier()
    {
        return carrier;
    }

    private void setMinLeftOnPhonePlan(final int minLeftOnPhonePlan)
    {
        if (minLeftOnPhonePlan < 0)
        {
            throw new IllegalArgumentException("Number of minutes cannot be negative");
        }
        this.minLeftOnPhonePlan = minLeftOnPhonePlan;
    }

    private void setCarrier(final String carrier)
    {
        if (Objects.equals(carrier, ""))
        {
            throw new IllegalArgumentException("Carrier cannot be left blank");
        }
        this.carrier = carrier;
    }

    /**
     * Compares this phone to another object.
     * @param obj object to compare
     * @return true if minutes match
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

        final IPhone other = (IPhone) obj;
        return Double.compare(other.minLeftOnPhonePlan, minLeftOnPhonePlan) == 0;
    }

    /**
     * Gets hash code based on minutes.
     * @return hash code
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(minLeftOnPhonePlan);
    }


}