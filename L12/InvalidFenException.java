class InvalidFenException extends Exception {
    int val;

    public InvalidFenException(int val) {
        this.val = val;
    }

    public String getMessage() {
        switch (val) {
            case 0:
                return "Error, missing fields.";
            case 1:
                return "Error, active color is invalid.";
            case 2:
                return "Error, en passant is invalid.";
            default:
                return "";   
        }
    }
}

