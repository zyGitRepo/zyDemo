package cn.zy.spring.di;

import java.io.PrintStream;

/**
 * @author zy
 * @version [v1.0]
 * @Description:
 * @date 2020/2/29
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
