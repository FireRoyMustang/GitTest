package com.atguigu.springmvc.handlers;

import com.atguigu.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 *@Description
 *@Author ShenYubo
 *@Date 2020/8/15 14:49
 *@Version V1.0
 **/
@SessionAttributes(value = {"user"}, types = {String.class})
@Controller
@RequestMapping("springmvc")
public class SpringMVCTest {
    private static final String SUCCESS = "success";

    @RequestMapping("testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println(user);
        return SUCCESS;
    }

    /**
     * SessionAttributes可以通过指定属性名指定放到会话里面的数据
     * 还可以通过types属性指定放到sessionAttributes中的值
     * @param map
     * @return
     */
    @RequestMapping("testSessionAttribute")
    public String testSessionAttribute(Map<String, Object> map) {
        User user = new User("Tom", "123456", "8891@qq.com", 14);
        map.put("user", user);
        map.put("school", "atguigu");
        return SUCCESS;
    }

    /**
     * 可以使用Servlet原生的API作为目标方法的参数
     * 1、HttpServletRequest
     * 2、HttpServletResponse
     * 3、HttpServletSession
     * 4、java.security.Principal
     * 5、Locale InputStream
     * 6、OutputStream
     * 7、Reader
     * 8、Writer
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     */
    @RequestMapping("/testRequestAPI")
    public String testRequestAPI(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        System.out.println("testServletAPI:" + httpServletRequest + httpServletResponse);
        return SUCCESS;
    }

    @RequestMapping("/testPojo")
    public String testPojo(User user) {
        System.out.println("Test POJO User:" + user);
        return SUCCESS;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String JSESSIONID) {
        System.out.println("Test Cookie JSESSIONID:" + JSESSIONID);
        return SUCCESS;
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language", required = false, defaultValue = "") String al) {
        System.out.println("TestRequestHeader Request Accpet-Language:" + al);
        return SUCCESS;
    }

    //不带参数会出错
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String username,
                                   @RequestParam(value = "age", required = false, defaultValue = "1") Integer age) {
        System.out.println("Test Request Parameter username: " + username);
        System.out.println("Test Request Parameter username: " + age);
        return SUCCESS;
    }

    /**
     * Rest风格url
     * 以CRUD为例
     * 通过POST请求对POST、PUT、DELETE进行再封装
     * @param id
     * @return
     */
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testRestGet(@PathVariable("id") Integer id) {
        System.out.println("testRest GET:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.POST)
    public String testRestPOST(@PathVariable("id") Integer id) {
        System.out.println("testRest POST:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable("id") Integer id) {
        System.out.println("testRest DELETE:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable("id") Integer id) {
        System.out.println("testRest PUT:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value = "id") Integer id) {
        System.out.println("testPathVariable: " + id);
        return SUCCESS;
    }

    //通配符
    @RequestMapping(value = "/testAntPath/*/abc")
    public String testAntPath() {
        System.out.println("Test Ant Path");
        return SUCCESS;
    }

    /**
     * 偶尔有使用params和headers来更加精确的映射请求，params和headers支持简单的表达式
     * @return
     */
    //要求必须有username属性，age不能等于10，要求不能有空格
    @RequestMapping(value = "/testParamsAndHeaders", params = {"username", "age!=10"}, headers = {"Accept-Language=zh-CN,zh;q=0.9"})
    public String testParamsAndHeaders() {
        System.out.println("test parameters and headers");
        return SUCCESS;
    }

    //要求方法为Method
    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testRequestMethod() {
        System.out.println("test method");
        return SUCCESS;
    }

    /**
     * 1、RequestMapping除了修饰方法，还可以修饰类
     * 2、
     *  1）类定义处
     *  2）方法定义处
     * @return
     */
    @RequestMapping("/test")
    public String testRequestMapping() {
        System.out.println("test RequestMapping");
        return SUCCESS;
    }
}
