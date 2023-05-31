package color;

import java.util.Arrays;

public enum Color {
    RED {
        @Override
        public String toString() {
            return ("This color is red");
        }
    },
    GREEN {
        @Override
        public String toString() {
            return ("This color is green");
        }
    },
    YELLOW {
        @Override
        public String toString() {
            return ("This color is  yellow");
        }
    },
    BROWN {
        @Override
        public String toString() {
            return ("This color is brown");
        }
    };
    public String[] hexAndRgb(Color color) {

            switch (color) {
                case RED:
                    System.out.println(Arrays.toString(new String[]{"#ff0000", "(255, 0, 0)"}));
                    return new String[]{"#ff0000", "(255, 0, 0)"};

                case GREEN:
                    System.out.println(Arrays.toString(new String[]{"#00ff00", "(0, 255, 0)"}));
                    return new String[]{"#00ff00", "0, 255, 0)"};

                case YELLOW:
                    System.out.println(Arrays.toString(new String[]{"#ffff00", "(255, 255, 0)"}));
                    return new String[]{"#ffff00", "(255, 255, 0)"};
                case BROWN:
                    System.out.println(Arrays.toString(new String[]{"#964B00", "(165,42,42)"}));
                    return new String[]{"#964B00", "(165,42,42)"};
            }
        return new String[]{"END"};
    }
}

