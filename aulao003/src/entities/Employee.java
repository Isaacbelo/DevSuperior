
package entities;

/**
 *
 * @author USER
 */
public class Employee {
    
    private Integer id; 
    private String name; 
    private Double salary;
    
     //Construtor padrão
     public Employee() {
    }
     public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }    
    
    // Getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    //Controle do valor aumento do salário
    public void increaseSalary(Double percentage){
        
        this.salary += (this.salary * percentage)/100;
        
    }
    // Formatter saída de dados
    public String toString(){
    return id + ", "+name+", "+ String.format("%.2f", salary);
    }

   
    
    
    
}
