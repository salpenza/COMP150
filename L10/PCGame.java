public class PCGame extends Game {
    private int minimumRAM;
    private int hardDriveSpace;
    private float minimumCPU;

    public PCGame(String description, int minimumRAM, int hardDriveSpace, float minimumCPU) {
        // TODO: Complete the constructor method
        // Call the super classes constructor method
        // Call the setter for the minimumRAM field
        // Call the setter for the hardDriveSpace field
        // Call the setter for the minimumCPU field
        super(description);
        this.minimumRAM = minimumRAM;
        this.hardDriveSpace = hardDriveSpace;
        this.minimumCPU = minimumCPU;
    }

    public int getMinimumRAM() {
        return minimumRAM;
    }

    public void setMinimumRAM(int minimumRAM) {
        if (minimumRAM > 0) {
            this.minimumRAM = minimumRAM;
        }
    }

    public int getHardDriveSpace() {
        return hardDriveSpace;
    }

    public void setHardDriveSpace(int hardDriveSpace) {
        if (hardDriveSpace > 0) {
            this.hardDriveSpace = hardDriveSpace;
        }
    }

    public float getMinimumCPU() {
        return minimumCPU;
    }

    public void setMinimumCPU(float minimumCPU) {
        if (minimumCPU > 0.0f) {
            this.minimumCPU = minimumCPU;
        }
    }

    public String toString() {
        // TODO: make sure to create and return a String
        // Don't forget to add the superclasses toString value as well.
        return super.toString() + "\n" + "Min RAM: " + minimumRAM + " MB" + "\n" + "Min CPU: " + minimumCPU + " GHz" + "\n" + "Hard Drive Space: " + hardDriveSpace + " MB" + "\n";
    }
}