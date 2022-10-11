package MyPackage;

public class Student {
    private String StudentName;
    private String StudentId;
    private String StudentCategory;

    public String getId() {
        return StudentId;
    }

    public void setId(String id) {
        this.StudentId = id;
    }

    public String getName() {
        return StudentName;
    }

    public void setName(String name) {
        this.StudentName = name;
    }

    public String getCategory() {
        return StudentCategory;
    }

    public void setCategory(String category) {
        this.StudentCategory = category;
    }
}
