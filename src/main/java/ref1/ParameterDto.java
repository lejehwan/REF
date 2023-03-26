package ref1;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ParameterDto {

    private String stringValue;
    private int intValue;
    private Object booleanValue;
}
