package ca.bcit.comp2522lab3;

/**
 * The parent class for all IDevices.
 *
 * @author Tommy White
 * @author Kiet Tran
 *
 * @version 1.0
 *
 */
abstract class IDevice
{
    private final String purpose;

    /**
     * Creates a device with a purpose.
     *
     * @param purpose the device's main use
     */
    IDevice(final String purpose)
    {
        validatePurpose(purpose);

        this.purpose = purpose;
    }

    /*
     * Validates purpose.
     * Constraints:
     * - Cannot be null
     * - Cannot be blank
     *
     * @param purpose The purpose to be validated
     */
    private void validatePurpose(String purpose)
    {
        if (purpose == null)
        {
            throw new IllegalArgumentException("Purpose cannot be null.");
        }

        if (purpose.isBlank())
        {
            throw new IllegalArgumentException("Purpose cannot be blank");
        }
    }

    /**
     * Returns the device's purpose.
     *
     * @return description of the purpose
     */
    public final String getPurpose()
    {
        return "The purpose of this IDevice is \"" + purpose + "\"";
    }

    /**
     * Prints details of the device.
     */
    abstract void printDetails();

    /**
     * Returns device info as a string.
     *
     * @return purpose string
     */
    @Override
    public String toString()
    {
        return "Purpose: " + purpose;
    }
}