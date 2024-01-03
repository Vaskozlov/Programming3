package police;

import character.Character;

public interface PoliceInterface {
    void receiveCall(Character character, ReasonToCallThePolice reason, String description);
}
