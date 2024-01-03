package character;

import lib.*;
import police.*;

import java.util.Objects;

import scene.object.SceneObject;

public abstract class Character {
    private final String name;

    protected Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public void callThePolice(PoliceInterface police, ReasonToCallThePolice reason, String description) {
        police.receiveCall(this, reason, description);
    }

    public abstract void takeBreath();

    public abstract void breakHead(String reason);

    public abstract void thinkAbout(String someThoughts);

    public abstract void cancelThoughts(String reason);

    public abstract void describeState(String state);

    public abstract void interactWithObject(SceneObject sceneObject, String description);

    public abstract void interactWithObject(
            SceneObject sceneObject,
            FunctionWithVoidReturnAndOneArgument<SceneObject> action,
            String description
    );

    public boolean equals(Object other) {
        if (other instanceof Character) {
            return Objects.equals(getName(), ((Character) other).getName());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
