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
    private static final int MIN_SONGS_STORED = 0;
    private static final int MIN_VOLUME_DB = 0;

    private int songsStored;

    private double maxVolumeDecibels;

    /**
     * Creates an iPod with song count and volume limit.
     *
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

    /*
     * Validates songs stored.
     * Constraints:
     * - Cannot be lesser than minimum
     *
     * @param purpose The purpose to be validated
     */
    private void validateSongsStored(final int songsStored)
    {
        if (songsStored < MIN_SONGS_STORED)
        {
            throw new IllegalArgumentException("Cannot have less than minimum songs stored");
        }
    }

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
     *
     * @param obj object to compare
     *
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
     *
     * @return hash code
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(songsStored);
    }

    /**
     * Returns details as a string.
     *
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
     *
     * @return song count
     */
    public final int getSongsStored()
    {
        return songsStored;
    }

    /**
     * Gets maximum volume.
     *
     * @return decibel level
     */
    public final double getMaxVolumeDecibels()
    {
        return maxVolumeDecibels;
    }

    /**
     * Set the amount of songs stored/
     *
     * @param songsStored number of stored songs
     */
    public final void setSongsStored(final int songsStored)
    {
        if (songsStored < MIN_SONGS_STORED)
        {
            throw new IllegalArgumentException("Number of songs cannot be below minimum songs stored: " + MIN_SONGS_STORED);
        }
        this.songsStored = songsStored;
    }

    /*
     * Setter for max volume (in decibels).
     *
     * @param New value for decibels
     */
    private final void setMaxVolumeDecibels(final double maxVolumeDecibels)
    {
        if (maxVolumeDecibels < MIN_VOLUME_DB)
        {
            throw new IllegalArgumentException("Volume cannot be below minimum: " + MIN_VOLUME_DB);
        }
        this.maxVolumeDecibels = maxVolumeDecibels;
    }
}