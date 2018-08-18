package tmall.bean;

/**
 * @ClassName Property
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 13:58
 * @Version 1.0
 **/
public class Property {
    private String name;
    private Category category;
    private int id;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
