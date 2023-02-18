package OOP;

import java.awt.*;

public class Tree {

    private double treeHeightFt;
    private double truckDiameterInches;
    protected TreeType treeType;

    private static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double treeHeightFt, double truckDiameterInches, TreeType treeType) {
        this.treeHeightFt = treeHeightFt;
        this.truckDiameterInches = truckDiameterInches;
        this.treeType = treeType;
    }

    public double getTreeHeightFt() {
        return treeHeightFt;
    }

    public void setTreeHeightFt(double treeHeightFt) {
        this.treeHeightFt = treeHeightFt;
    }

    public double getTruckDiameterInches() {
        return truckDiameterInches;
    }

    public void setTruckDiameterInches(double truckDiameterInches) {
        this.truckDiameterInches = truckDiameterInches;
    }

    public static Color getTrunkColor() {
        return TRUNK_COLOR;
    }

    public static void setTrunkColor(Color trunkColor) {
        TRUNK_COLOR = trunkColor;
    }

    void grow() {
        treeHeightFt = this.treeHeightFt + 10;
        truckDiameterInches = this.truckDiameterInches + 1;
    }
}
