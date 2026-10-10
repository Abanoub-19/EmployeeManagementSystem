package model;

public class Department {
    private String name;

    public Department(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Department name cannot be empty.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
