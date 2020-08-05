package cn.pyc.functionalprogram.apple;


import cn.pyc.functionalprogram.apple.constants.Constants;

/**
 * @author pi
 */
public class Apple {
    private String color;
    private Double weight;

    public Apple() {
    }

    public Apple(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public Boolean isGreen() {
        return this.color.equals(Constants.GREEN_APPLE_COLOR);
    }

    public Boolean isHeavierThan(Double weight) {
        return this.weight > weight;
    }

    public Boolean identityAppleColor(String color) {
        boolean result = false;
        if (null != color && this.getColor().equals(color)) {
            result = true;
        }
        return result;
    }
}
