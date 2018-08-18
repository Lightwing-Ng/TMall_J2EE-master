package tmall.bean;

/**
 * @ClassName ProductImage
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 13:56
 * @Version 1.0
 **/
public class ProductImage {
    private String type;
    private Product product;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
