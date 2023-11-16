package RewardApp.Fabric;

import RewardApp.Interface.IGameItem;
import RewardApp.Product.Heart;

public class HeartGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Heart();
    }
}
