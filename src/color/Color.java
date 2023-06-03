package color;

import java.util.Arrays;

public enum Color {
    RED ("#ff0000 (255,0,0)") {
        @Override
        public String toString() {
            return ("This color is red");
        }
    },
    GREEN ("#00ff00 (0,255,0)") {
        @Override
        public String toString() {
            return ("This color is green");
        }
    },
    YELLOW ("#ffff00 (255,255,0)")  {
        @Override
        public String toString() {
            return ("This color is yellow");
        }
    },
    BROWN ("#964B00 (165,42,42)") {
        @Override
        public String toString() {
            return ("This color is brown");
        }
    };
    private String color;
    Color (String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}

