package OOP_Task1_Generics;

/**
 * Класс для демонстрации Generics. 
 * <p>
 * Generic мы используем для объявления типа у поля {@code E id}. В случае если необходимо можно объявить поле как {@code String},
 * {@code Integer}, {@code Long} и так далее, в зависмости от потребности. При это нет необходимости переписывать тип поля {@code id} у класса.
 * </p>
 */
public class ParametricWorker<E> {
    private E id;

    private String firstName;
    private String lastName;
    private int age;
    private float salary;
    
    // Constructor with parameters
    public ParametricWorker(E id,
                            String firstName,
                            String lastName,
                            int age,
                            float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    // Gettres & Setters

    public int getAge() {
        return age;
    }

    public E getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setId(E id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Last_Name: %s, Age: %d, Salary %f",
                                    getId(),
                                            getFirstName(),
                                                        getLastName(),
                                                                      getAge(),
                                                                                getSalary());
    }
}
