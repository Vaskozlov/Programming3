package character;

import lib.*;
import scene.object.SceneObject;

public class SceneCharacter extends Character {
    public SceneCharacter(String name) {
        super(name);
    }

    @Override
    public void takeBreath() {
        System.out.printf("%s вздыхает.%n", this);
    }

    @Override
    public void breakHead(String reason) {
        System.out.printf("%s ломает голову, потому что %s.%n", this, reason);
    }

    @Override
    public void thinkAbout(String someThoughts) {
        System.out.printf("%s думает %s.%n", this, someThoughts);
    }

    @Override
    public void cancelThoughts(String reason) {
        System.out.printf("%s передумывает, потому что %s.%n", this, reason);
    }

    @Override
    public void describeState(String state) {
        System.out.printf("%s %s.%n", this, state);
    }

    @Override
    public void interactWithObject(SceneObject sceneObject, String description) {
        System.out.printf("%s %s %s.%n", this, description, sceneObject);
    }

    @Override
    public void interactWithObject(SceneObject sceneObject, FunctionWithVoidReturnAndOneArgument<SceneObject> action, String description) {
        System.out.printf("%s %s %s.%n", this, description, sceneObject);
        action.apply(sceneObject);
    }
}
