// Замечания:
// 1) В классе ModelStore необходимо добавить по одному экземпляру классов Flash, Camera и т.д.
// 2) В класс Scene лучше не использовать Object (считается дурным тоном в программированиии), реализовывать можно следующим образом:
// public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
// this.ID = id;
// if (models.size() > 0) {
// this.Models = models;
// } else {
// throw new Exception("Должна быть одна модель");
// }
// this.Flashes = flashes;
// if (cameras.size() > 0) {
// this.cameras = cameras;
// } else {
// throw new Exception("Должна быть одна камера");
// }
// }

// public <T> T method1(T flash) {
//     return flash;
// }

// public <T, E> T method2(T Model, E Flash) {
//     return Model;
// }

// /**
// * заглушка
// */
// public Type1 method1(Type1 t) {
// return t;
// }

// /**
// * заглушка
// */
// public Type1 method1(Type1 t1, Type2 t2) {
// return t1;
// }
// 4) Необходимо добавить классы Angle3D, Point3D

package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElement.Camera;
import ModelElement.Flash;
import ModelElement.PoligonalModel;
import ModelElement.Scene;

public class ModelStore implements iModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangedObserver[] changeObservers;

    public iModelChangedObserver[] getChangeObservers() {
        return changeObservers;
    }

    public ModelStore(iModelChangedObserver[] changeObservers) {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
    }

    public Scene getScena(int id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void NotifyChange(iModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }
}
