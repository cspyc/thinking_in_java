package cn.pyc.functionalprogram.apple;


/**
 * @author pi
 */
public class Apple {
    private String color;
    private Double wight;

    public Apple(){}

    public Apple(String color,Double wight){
        this.color = color;
        this.wight = wight;
    }

    public String getColor() {
        return color;
    }

    public Double getWight() {
        return wight;
    }
}
