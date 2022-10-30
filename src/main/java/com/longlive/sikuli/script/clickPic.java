package com.longlive.sikuli.script;

import org.sikuli.script.*;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author 李威
 * @description
 * @date 2022/10/30 0:49
 */
public class clickPic {
    //根目录
    private static final String ROOTPATH = clickPic.class.getClassLoader().getResource("").getPath();

    public boolean patternPersonNum(){
        boolean b = true;
        String path = ROOTPATH.substring(1,ROOTPATH.length());
        Pattern searchImage = new Pattern((path+"images/rats.png")).similar((float)0.9);
        String ScreenImage =path+"images/ratsAll.png"; //In this case, the image you want to search
        Finder objFinder = null;
        Match objMatch = null;
        objFinder = new Finder(ScreenImage);
        objFinder.findAll(searchImage);
        //searchImage is the image you want to search within ScreenImage
        int counter = 0;
        while(objFinder.hasNext())
        {
            objMatch = objFinder.next(); //objMatch gives you the matching region.
            counter++;
            int x = objMatch.x;
            int y = objMatch.y;
            System.out.println("x:"+x+"  y:"+y);
        }
        if(counter!=0)
            System.out.println("Match Found!");
        return b;
    }



    public static void main(String[] args) throws FindFailed {
        //boolean b = new clickPic().patternPersonNum();
        Screen screen = new Screen();

        screen.click(ROOTPATH+"images/rats.png");
        List<Match> list = screen.findAllList(ROOTPATH + "images/rats.png");
        list.forEach(match -> {
            int x = match.x;
            int y = match.y;
            Location location = screen.newLocation(x, y);
            screen.doubleClick();
        });


//        while (all.hasNext()){
//            System.out.println(all.next().x);
//
//            System.out.println(all.next().y);
//        }


    }
}
