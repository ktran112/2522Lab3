package ca.bcit.comp2522lab3;

import java.util.Objects;

public class IPad extends IDevice
{

    private static final String purpose = "learning";

    private boolean hasCase;

    private String operatingSystem;

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



    @Override
    void printDetails()
    {
        System.out.println("Has a case: " +
                           hasCase +
                           "\nOperating System: " +
                           operatingSystem);
    }

    @Override
    public String toString()
    {
      return super.toString() + "\n" +
             "Has a case: " +
             hasCase +
             "\nOperating System: " +
             operatingSystem;
    }

    public final boolean getHasCase()
    {
        return hasCase;
    }

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

    @Override
    public int hashCode()
    {
        return Objects.hash(operatingSystem);
    }

}
