package RewardApp.Fabric;

import RewardApp.Interface.IGameItem;
import RewardApp.Product.Gold;

public class GoldGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
