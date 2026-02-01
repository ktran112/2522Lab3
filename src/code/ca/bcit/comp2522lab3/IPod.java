package ca.bcit.comp2522lab3;

public class IPod extends IDevice
{

    private static final String purpose = "music";

    private int songsStored;

    private double maxVolumeDecibels;

    public IPod(final int songsStored,
                final double maxVolumeDecibels)
    {
        super(purpose);

        validateSongsStored(songsStored);

        this.songsStored = songsStored;
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    private void validateSongsStored(final int songsStored)
    {
        if (songsStored < 0)
        {
            throw new IllegalArgumentException("Cannot have negative songs stored");
        }
    }

    // I was considering a validate dB method that didn't allow values below or beyond the min and max possible dB on Earth, but seemed redundant



    @Override
    void printDetails()
    {
        System.out.println("Amount of Songs stored: " +
                           songsStored +
                           "\nMax Volume: " +
                           maxVolumeDecibels +
                           " dB");
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

        final IPod other = (IPod) obj;
        return songsStored == other.songsStored;
    }

    @Override
    public int hashCode()
    {
        return Integer.hashCode(songsStored);
    }


    @Override
    public String toString()
    {
        return super.toString() + "\n" +
               "Amount of Songs stored: " +
               songsStored +
               "\nMax Volume: " +
               maxVolumeDecibels +
               " dB";
    }

    public final int getSongsStored()
    {
        return songsStored;
    }

    public final double getMaxVolumeDecibels()
    {
        return maxVolumeDecibels;
    }

    private void setSongsStored(final int songsStored)
    {
        if (songsStored < 0)
        {
            throw new IllegalArgumentException("Number of songs cannot be negative");
        }
        this.songsStored = songsStored;
    }

    private void setMaxVolumeDecibels(final double maxVolumeDecibels)
    {
        if (maxVolumeDecibels < 0)
        {
            throw new IllegalArgumentException("Volume cannot be negative");
        }
        this.maxVolumeDecibels = maxVolumeDecibels;
    }
}
