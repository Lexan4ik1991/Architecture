package RewardApp.Fabric;

import RewardApp.Interface.IGameItem;

public abstract class ItemGenerator {
    public void openReward(){
        createItem().open();
    };
    public abstract IGameItem createItem();
}
