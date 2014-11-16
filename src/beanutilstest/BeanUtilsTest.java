/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beanutilstest;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jgshun
 */
public class BeanUtilsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User();
        String username = "张三";
        String both = "2013-08-14";
        String id = "1";
        
        String[] intresters = {"钓鱼","篮球"};
        try {
            //必须是与属性值相同的类型才能在需要使用自定义Converter的时候调用，例如User 的intresters 定义类型是List就必须是List，不能是ArrayList否则进入不了转换器
            ConvertUtils.register(new DateConverter(), List.class );
//            //1.8.3首先会先判断要设置的值得类型是否符合对象属性
//            BeanUtils.copyProperty(user, "username", username);
//            BeanUtils.copyProperty(user, "id", id);
//            
//            //如果类型不能被默认转换就调用注册的Converter
//            BeanUtils.copyProperty(user, "both", both);
            
            BeanUtils.copyProperty(user, "intresters", intresters);
            
            System.out.println(user);
            
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BeanUtilsTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(BeanUtilsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
