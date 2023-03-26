package ref1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum HumanCode {

    EYES(1, Eyes.getInstance()),
    NOSE(2, Nose.getInstance()),
    MOUSE(3, Mouse.getInstance()),
    EARS(4, Ears.getInstance());

    private final int humanValue;
    private final Human humanFuc;

}