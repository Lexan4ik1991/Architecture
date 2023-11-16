package RewardApp.Fabric;

import RewardApp.Interface.IGameItem;
import RewardApp.Product.Skill;

public class SkillGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Skill();
    }
}
