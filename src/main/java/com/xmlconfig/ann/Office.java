package com.xmlconfig.ann;

/**
 * Hello world!
 *
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//adding the annotations
@Component ("cd")
public class Office {
    @Value("Godigit")
    private String name;
    @Value("Shivajinagar")
    private String add;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Office{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }

    public String getadd() {
        return add;
    }

    public void setadd(String add) {
        this.add = add;
    }


}
