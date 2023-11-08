package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;

    public ModelStore(IModelChangedObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        List<Texture> Textures = new ArrayList<>();
        this.models.add(new PoligonalModel(Textures));

        this.flashes.add(new Flash());
        this.cameras.add(new Camera());

        this.scenes.add(new Scene(0, models, flashes, cameras));

    }
    public Scene GetScene(int id){
        return scenes.get(id);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }

}
