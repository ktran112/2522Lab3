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
    private static final int MIN_MINUTES_LEFT_ON_PHONE = 0;

    private static final String purpose = "talking";

    private double minutesLeftOnPhonePlan;

    private String carrier;

    /**
     * Creates an iPhone with minutes and carrier.
     *
     * @param minutesLeftOnPhonePlan minutes remaining
     * @param carrier service provider
     */
    public IPhone(final double minutesLeftOnPhonePlan,
                  final String carrier)
    {
        super(purpose);

        validateMinutesLeftOnPhonePlan(minutesLeftOnPhonePlan);

        this.minutesLeftOnPhonePlan = minutesLeftOnPhonePlan;
        this.carrier = carrier;
    }

    /**
     * Creates an iPhone with minutes only.
     *
     * @param minutesLeftOnPhonePlan minutes remaining
     */
    public IPhone(final double minutesLeftOnPhonePlan)
    {
        this(minutesLeftOnPhonePlan, null);
    }

    /*
     * Validates the Minutes Left on Phone Plan.
     * Constraints:
     * - Cannot be lesser that minimum minutes left on phone
     *
     * @param purpose The purpose to be validated
     */
    private static void validateMinutesLeftOnPhonePlan(final double minutesLeftOnPhonePlan)
    {
        if (minutesLeftOnPhonePlan < MIN_MINUTES_LEFT_ON_PHONE)
        {
            throw new IllegalArgumentException("Cannot have less than minimum minutes on phone plan");
        }
    }

    /**
     * Prints device details.
     */
    @Override
    void printDetails()
    {
        System.out.println("Time left on phone plan: " +
                minutesLeftOnPhonePlan +
                " minutes\n" +
                "Carrier: " +
                carrier);
    }

    /**
     * Returns device details as a string.
     *
     * @return formatted string
     */
    @Override
    public String toString()
    {
        return super.toString() + "\n" +
                "Time left on phone plan: " +
                minutesLeftOnPhonePlan +
                " minutes\n" +
                "Carrier: " +
                carrier;
    }

    /**
     * Gets minutes remaining.
     *
     * @return minutes
     */
    public final double getMinutesLeftOnPhonePlan()
    {
        return minutesLeftOnPhonePlan;
    }

    /**
     * Gets carrier name.
     *
     * @return carrier
     */
    public final String getCarrier()
    {
        return carrier;
    }

    /*
     * Setter for minutes left on phone plan.
     *
     * @param minutesLeftOnPhonePlan The new value for the minutes left on phone plan
     */
    private final void setMinutesLeftOnPhonePlan(final int minutesLeftOnPhonePlan)
    {
        if (minutesLeftOnPhonePlan < MIN_MINUTES_LEFT_ON_PHONE)
        {
            throw new IllegalArgumentException("Number of minutes cannot be lesser than minimum.");
        }
        this.minutesLeftOnPhonePlan = minutesLeftOnPhonePlan;
    }

    /**
     * Changes the phone's carrier.
     *
     * @param carrier the new carrier
     */
    public final void setCarrier(final String carrier)
    {
        if (carrier.isBlank())
        {
            throw new IllegalArgumentException("Carrier cannot be left blank");
        }
        this.carrier = carrier;
    }

    /**
     * Compares this phone to another object.
     *
     * @param obj object to compare
     *
     * @return true if minutes match
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (obj == null)
        {
            return false;
        }

        if (!(obj instanceof IPhone))
        {
            return false;
        }

        final IPhone that;

        that = (IPhone) obj;

        return this.minutesLeftOnPhonePlan == that.minutesLeftOnPhonePlan;
    }

    /**
     * Gets hash code based on minutes.
     *
     * @return hash code
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(minutesLeftOnPhonePlan);
    }


}