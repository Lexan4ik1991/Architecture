package RewardApp.Fabric;

import RewardApp.Interface.IGameItem;
import RewardApp.Product.Gem;

public class GemGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
