package Notes.OOPs.Inheritance;

public class Plane extends Car{
    private String modelName;
    private Long id;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
