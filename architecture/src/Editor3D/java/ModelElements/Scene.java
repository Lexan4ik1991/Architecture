package ModelElements;


import java.util.List;

public class Scene {
    private List<Flash> flashes;
    public int id;
    public List<PoligonalModel> models;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models,List<Flash> flashes,  List<Camera> cameras) throws Exception {

        this.id = id;
        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должна быть хотя бы одна модель");
        }
        this.flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть хотя бы одна камера");
        }

    }

    public Type method1(Type t) {
        return null;

    }

    public Type method2(Typet t1, Type t2){
        return null;

    }
}
