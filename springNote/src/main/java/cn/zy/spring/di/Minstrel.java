package cn.zy.spring.di;

import java.io.PrintStream;

/**
 * @author zy
 * @version [v1.0]
 * @Description:
 * @date 2020/2/29
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("执行前置增强方法：singBeforeQuest()");
    }

    public void singAfterQuest(){
        stream.println("执行后置增强方法：singAfterQuest()");
    }
}
