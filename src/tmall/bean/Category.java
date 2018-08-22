package tmall.bean;

import java.util.List;

/**
 * @ClassName Category
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 13:55
 * @Version 1.0
 **/
public class Category {
    private String name;
    private int id;
    private List<Product> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category [name=" + name + "]";
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setProductsByRow(List<List<Product>> productsByRow) {
        List<List<Product>> productsByRow1 = productsByRow;
    }
}