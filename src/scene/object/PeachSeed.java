package scene.object;

public class PeachSeed extends SceneObject {
    public PeachSeed(String name) {
        super(name);
    }

    public double measureDifferenceFromPreviousDayInMM() {
        return Math.random() * 2.5;
    }
}
