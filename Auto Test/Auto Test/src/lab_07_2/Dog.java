package lab_07_2;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog() {
        final int MAX_SPEED = 200;
        this.setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        this.setName("Dog");
    }

}
