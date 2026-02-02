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

<<<<<<< HEAD
    IDevice(final String purpose)
    {
=======
    IDevice(final String purpose) {

>>>>>>> c71097654b9367f47b87d4a13aa6d9374e673108
        validatePurpose(purpose);

        this.purpose = purpose;
    }

    private void validatePurpose(String purpose)
    {
        if (purpose == null || purpose.isBlank())
        {
            throw new IllegalArgumentException("Must have a purpose");
        }
    }

    public final String getPurpose()
    {
        return "The purpose of this IDevice is \"" + purpose + "\"";
    }

    abstract void printDetails();

    @Override
    public String toString()
    {
        return "Purpose: " + purpose;
    }
}
