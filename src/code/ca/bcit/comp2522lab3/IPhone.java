package ca.bcit.comp2522lab3;

import java.util.Objects;

public class IPhone extends IDevice
{

    private static final String purpose = "talking";

    private double minLeftOnPhonePlan;

    private String carrier;

    public IPhone(final double minLeftOnPhonePlan,
                  final String carrier)
    {
        super(purpose);
        this.minLeftOnPhonePlan = minLeftOnPhonePlan;
        this.carrier = carrier;
    }

    @Override
    void printDetails()
    {
        System.out.println("Time left on phone plan: " +
                           minLeftOnPhonePlan +
                           " minutes\n" +
                           "Carrier: " +
                           carrier);
    }

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

    public final double getMinLeftOnPhonePlan()
    {
        return minLeftOnPhonePlan;
    }

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

    @Override
    public int hashCode()
    {
        return Objects.hash(minLeftOnPhonePlan);
    }


}
