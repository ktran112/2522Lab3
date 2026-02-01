package ca.bcit.comp2522lab3;

import java.util.Objects;

public class IPhone17 extends IPhone
{

    private final boolean highResCamera;
    private final int memoryGb;

    public IPhone17(final double minLeftOnPhonePlan,
                    final String carrier,
                    final boolean highResCamera,
                    int memoryGb)
    {
        super(minLeftOnPhonePlan, carrier);

        this.highResCamera = highResCamera;
        this.memoryGb = memoryGb;
    }

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

    @Override
    public final String toString()
    {
        return super.toString()
                + "\nHigh Resolution Camera: "
                + this.highResCamera
                + "\nMemory in gigabytes: "
                +this.memoryGb;

    }

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

    @Override
    public final int hashCode()
    {
        return Double.hashCode(this.getMinLeftOnPhonePlan()
                + Boolean.hashCode(this.highResCamera));
    }


}
