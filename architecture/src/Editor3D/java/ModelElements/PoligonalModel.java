package ModelElements;
import java.util.ArrayList;
import java.util.List;


public class    PoligonalModel {
        public List<Texture> Textures;
        public List<Poligon> Poligons;

        public PoligonalModel(List<Texture> textures) {
            this.Textures = textures;
            this.Poligons = new ArrayList<>();


        }

    public PoligonalModel(List<Texture> textures, List<Poligon> poligons) {
        this.Textures = textures;
        this.Poligons = new ArrayList<Poligon>();
    }
}

