package tmall.bean;

/**
 * @ClassName PropertyValue
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 13:57
 * @Version 1.0
 **/
public class PropertyValue {
    private String value;
    private Product product;
    private Property property;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
