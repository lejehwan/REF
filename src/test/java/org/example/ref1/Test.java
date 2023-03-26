package org.example.ref1;

import ref1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;

class TestClass {

    static Eyes eyes;
    static Nose nose;
    static Mouse mouse;
    static Ears ears;

    @BeforeEach
    void setUp(){
        eyes = Eyes.getInstance();
        nose = Nose.getInstance();
        mouse = Mouse.getInstance();
        ears = Ears.getInstance();
    }

//    @Disabled
//    @Test
//    @DisplayName("최초의 코드")
//    void initCode() {
//        int value = anyInt();
//
//        if (value == 1) {
//            Eyes eyes = new Eyes(anyInt());
//            eyes.func();
//        } else if (value == 2) {
//            Nose nose = new Nose(anyInt(), anyString());
//            nose.func();
//        } else if (value == 3) {
//            Mouse mouse = new Mouse(anyInt(), anyString(), anyBoolean());
//            mouse.func();
//        } else if (value == 4) {
//            Ears ears = new Ears(anyBoolean(), anyInt());
//            ears.func();
//        }
//    }

    @Test
    @DisplayName("DTO 객체 생성(파라미터로 전달받는 데이터를 포함하는 DTO 를 생성)")
    void makeDto() {
        ParameterDto dto = ParameterDto.builder()
                .booleanValue(anyBoolean())
                .stringValue(anyString())
                .intValue(anyInt())
                .build();

        assertThat(dto.getBooleanValue()).isNotEqualTo(null);
        assertThat(dto.getStringValue()).isNotEqualTo(null);
        assertThat(dto.getIntValue()).isNotEqualTo(null);
    }

//    @Disabled
//    @Test
//    @DisplayName("다형성 이용(각 클래스가 상속받을 상위 인터페이스를 생성)")
//    void makeInterface() {
//        Human human = null;
//        int value = 1;
//
//        if (value == 1) {
//            human = new Eyes();
//        } else if (value == 2) {
//            human = new Nose();
//        } else if (value == 3) {
//            human = new Mouse();
//        } else if (value == 4) {
//            human = new Ears();
//        }
//        String repeat = human.func();
//
//        assertThat(human instanceof Eyes).isEqualTo(true);
//        assertThat(repeat).isEqualTo("보다");
//    }

    @Test
    @DisplayName("싱글톤 패턴 사용")
    void useSingletonPattern(){
        Human human = null;
        int value = 1;

        if (value == 1) {
            human = eyes;
        } else if (value == 2) {
            human = nose;
        } else if (value == 3) {
            human = mouse;
        } else if (value == 4) {
            human = ears;
        }
        String repeat = human.func();

        assertThat(human instanceof Eyes).isEqualTo(true);
        assertThat(repeat).isEqualTo("보다");
    }
    
    @Test
    @DisplayName("#1 Enum 사용")
    void useEnum(){
        Human human = null;
        int value = 1;

        for (HumanCode code : HumanCode.values()) {
            if (value == code.getHumanValue()) human = code.getHumanFuc();
        }

        assertThat(human instanceof Eyes).isEqualTo(true);
    }

    @Test
    @DisplayName("#2 팩토리 메서드 패턴 사용")
    void useAbstractFactoryMethodPattern(){
        FactoryMethodPattern factory = new FactoryMethodPattern();
        int value = 1;

        Human human = factory.createFuc(value);

        assertThat(human instanceof Eyes).isEqualTo(true);
    }
}