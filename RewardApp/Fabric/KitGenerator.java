package RewardApp.Fabric;

import RewardApp.Interface.IGameItem;
import RewardApp.Product.Kit;

public class KitGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Kit();
    }
}
