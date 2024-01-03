import character.*;
import character.Character;
import police.*;
import scene.*;
import scene.object.*;

public class Main {
    static class Police implements PoliceInterface {
        public void receiveCall(
                Character character, ReasonToCallThePolice reason, String description) {
            System.out.printf("%s звонит в полицию, причина: %s, описание: %s.%n", character, reason, description);
        }
    }

    static final Police police = new Police();
    static final Scene scene = new Scene(police);
    static final SceneCharacter boy = new SceneCharacter("Малыш");
    static final SceneCharacter carlson = new SceneCharacter("Карлосон");
    static final SceneCharacter filya = new SceneCharacter("Филя");
    static final SceneCharacter rulya = new SceneCharacter("Рулля");
    static final SceneObject window = new SceneObject("окно");
    static final PeachSeed peachSeed = new PeachSeed("персиковая косточка");

    public static void main(String[] args) {
        scene.addCharacter(boy, carlson, filya, rulya);
        scene.addSceneObject(window, peachSeed);

        boy.takeBreath();
        boy.breakHead(String.format("нужно уберечь %s от %s и %s", carlson, filya, rulya));
        boy.thinkAbout("позвонить в полицию");
        boy.cancelThoughts(String.format("придется объяснять, почему %s и %s хотят поймать %s, а это опасно", filya, rulya, carlson));

        carlson.describeState("не ломает голову и не боится");

        carlson.interactWithObject(window, "стоит у");
        carlson.interactWithObject(peachSeed, "с невозмутимым спокойствием выкапывает");

        carlson.interactWithObject(peachSeed, (SceneObject peachSeed) -> {
            ((PeachSeed)peachSeed).measureDifferenceFromPreviousDayInMM();
        }, "измеряет насколько проросла за сутки");

        boy.describeState("очень напуган");
    }
}
