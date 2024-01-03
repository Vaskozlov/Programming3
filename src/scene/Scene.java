package scene;

import character.Character;
import police.PoliceInterface;
import scene.object.SceneObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Scene {
    HashMap<String, Character> characters = new HashMap<>();
    ArrayList<SceneObject> sceneObjectList = new ArrayList<>();
    PoliceInterface localPolice;

    public Scene(PoliceInterface localPolice) {
        this.localPolice = localPolice;
    }

    public void addCharacter(Character... newCharacters) {
        for (Character newCharacter : newCharacters) {
            characters.put(newCharacter.getName(), newCharacter);
        }
    }

    public Character getCharacter(String name) {
        return characters.get(name);
    }

    public void addSceneObject(SceneObject... newSceneObjects) {
        Collections.addAll(sceneObjectList, newSceneObjects);
    }

    public List<SceneObject> getSceneObjectList() {
        return sceneObjectList;
    }
}
