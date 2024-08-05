package New.Day17;

public enum ChessPiece {
    ;
    private double value;
    private String representation;

    ChessPiece(double value, String representation) {
        this.value = value;
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }
}
