package tmall.servlet;

import tmall.dao.*;
import tmall.util.Page;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @ClassName BaseForeServlet
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 14:13
 * @Version 1.0
 **/
public class BaseForeServlet extends HttpServlet {
    protected CategoryDAO categoryDAO = new CategoryDAO();
    OrderDAO orderDAO = new OrderDAO();
    OrderItemDAO orderItemDAO = new OrderItemDAO();
    ProductDAO productDAO = new ProductDAO();
    ProductImageDAO productImageDAO = new ProductImageDAO();
    PropertyValueDAO propertyValueDAO = new PropertyValueDAO();
    ReviewDAO reviewDAO = new ReviewDAO();
    UserDAO userDAO = new UserDAO();

    BaseForeServlet() {
        PropertyDAO propertyDAO = new PropertyDAO();
    }

    public void service(HttpServletRequest request, HttpServletResponse response) {
        try {
            int start = 0;
            int count = 10;
            try {
                start = Integer.parseInt(request.getParameter("page.start"));
            } catch (Exception ignored) {
            }

            try {
                count = Integer.parseInt(request.getParameter("page.count"));
            } catch (Exception ignored) {
            }

            Page page = new Page(start, count);
            String method = (String) request.getAttribute("method");
            System.out.println(page);
            System.out.println(method);

            Method m = this.getClass().getMethod(
                    method, HttpServletRequest.class,
                    HttpServletResponse.class, Page.class
            );
            String redirect = m.invoke(this, request, response, page).toString();
            BaseBackServlet.redirectStartWithCase(request, response, redirect);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
