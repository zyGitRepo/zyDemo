package cn.zy.spring.di;

/**
 * @author zy
 * @version [v1.0]
 * @Description:
 * @date 2020/2/29
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
