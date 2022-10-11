package MyPackage;

public class Controller {

    private Student model;
    private StudentProfile view;

    public Controller(Student model, StudentProfile view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentId(String id){
        model.setId(id);
    }

    public String getStudentId(){
        return model.getId();
    }

    public void setStudentCategory(String category){
        model.setCategory(category);
    }

    public String getStudentCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.printDetails(model.getName(), model.getId(), model.getCategory());
    }
}
