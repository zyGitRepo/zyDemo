package cn.zy.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zy
 * @version [v1.0]
 * @Description:
 * @date 2020/2/29
 */
public class BraveKnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        BraveKnight knight = context.getBean(BraveKnight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
