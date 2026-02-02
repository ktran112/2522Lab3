package ca.bcit.comp2522lab3;

/**
 * Represents an iPod device.
 *
 * @author Tommy White
 * @author Kiet Tran
 *
 * @version 1.0
 */
public class IPod extends IDevice
{

    private static final String purpose = "music";

    private int songsStored;

    private double maxVolumeDecibels;

    /**
     * Creates an iPod with song count and volume limit.
     * @param songsStored number of songs
     * @param maxVolumeDecibels maximum volume in dB
     */
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

    /**
     * Prints iPod details.
     */
    @Override
    void printDetails()
    {
        System.out.println("Amount of Songs stored: " +
                songsStored +
                "\nMax Volume: " +
                maxVolumeDecibels +
                " dB");
    }

    /**
     * Compares this iPod to another object.
     * @param obj object to compare
     * @return true if song counts match
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

        final IPod other = (IPod) obj;
        return songsStored == other.songsStored;
    }

    /**
     * Gets hash code based on song count.
     * @return hash code
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(songsStored);
    }

    /**
     * Returns details as a string.
     * @return formatted string
     */
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

    /**
     * Gets number of songs stored.
     * @return song count
     */
    public final int getSongsStored()
    {
        return songsStored;
    }

    /**
     * Gets maximum volume.
     * @return decibel level
     */
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