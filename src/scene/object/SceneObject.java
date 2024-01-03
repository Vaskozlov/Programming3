package scene.object;

import java.util.Objects;

import lib.*;

public class SceneObject implements SceneObjectInterface {
    private static final IdFactory idFactory = new IdFactory();
    private final int id = idFactory.generateId();
    private final String name;

    public SceneObject(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof SceneObject) {
            return Objects.equals(getId(), ((SceneObject) other).getId());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
