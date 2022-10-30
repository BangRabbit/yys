import org.junit.Test;
import org.sikuli.api.ScreenLocation;
import org.sikuli.script.*;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Objects;


/**
 * @author 李威
 * @description
 * @date 2022/10/30 0:39
 */
public class test {

//    public static void main(String[] args) throws FindFailed, InterruptedException {
//        Screen s = new Screen();
//        //定义图片存放路径
//        String imgpath = "C:/Users/李威/Desktop/yyspic/";
//        //双击桌面chrome浏览器图标
//        s.doubleClick(imgpath+"do.png");
//
//        //输入url
//        s.type(imgpath+"url.png","www.bing.com");
//        s.click(imgpath+"lianxiang.png");
//        Thread.sleep(2000);
//        //在bing输入框输入搜索关键字：sikuli,并点击搜索按钮
//        s.type(imgpath+"sreach_input.jpg","sikuli");
//        s.click(imgpath+"sreach_button.png");
//
//        System.out.println("end");
//    }

    @Test
    public void testGetLocation(){

    }

    @Test
    public void testClick() throws FindFailed {

        String path = test.class.getClassLoader().getResource("").getPath();
        Screen screen = new Screen();
        screen.getLastMatch().find(path);
    }
}
