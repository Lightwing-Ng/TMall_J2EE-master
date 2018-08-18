package tmall.servlet;

import tmall.bean.User;
import tmall.util.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ClassName UserServlet
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/15, 14:13
 * @Version 1.0
 **/
public class UserServlet extends BaseBackServlet {
    public String add(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }

    public String delete(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }

    public String edit(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }

    public String update(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }

    public String list(HttpServletRequest request, HttpServletResponse response, Page page) {
        List<User> us = userDAO.list(page.getStart(), page.getCount());
        int total = userDAO.getTotal();
        page.setTotal(total);
        request.setAttribute("us", us);
        request.setAttribute("page", page);
        return "admin/listUser.jsp";
    }
}
