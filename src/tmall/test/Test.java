package tmall.test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import tmall.bean.Category;
import tmall.bean.Product;
import tmall.bean.ProductImage;
import tmall.dao.CategoryDAO;
import tmall.dao.ProductDAO;
import tmall.dao.ProductImageDAO;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 14:14
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        List<Category> cs = new CategoryDAO().list();
        for (Category c : cs) {
            List<Product> ps = new ProductDAO().list(c.getId(), 0, Short.MAX_VALUE);
            for (Product p : ps) {
                List<ProductImage> pis1 = new ProductImageDAO().list(p, ProductImageDAO.type_single);
                List<ProductImage> pis2 = new ProductImageDAO().list(p, ProductImageDAO.type_detail);
                for (ProductImage pi : pis2) {
                    String fileNameFormat = "/Users/lightwingng/Desktop/tmall/web/img/productDetail/%d.jpg";
                    String srcFileName = String.format(fileNameFormat, pi.getId());
                    String destFileName = StringUtils.replace(srcFileName, "tmall_original", "tmall");
                    FileUtils.copyFile(new File(srcFileName), new File(destFileName));
                }
            }
        }
    }
}
