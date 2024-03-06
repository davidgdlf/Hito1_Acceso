package es.dataanalyzer.model;

import jakarta.persistence.*;



@Entity
@Table(name = "profesionales_sanitarios")
public class Datos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "año")
    private int año;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "total")
    private double total;

    // Constructor vacío
    public Datos() {
    }


    // Constructor lleno
    public Datos(int año, String sexo, double total) {
        this.año = año;
        this.sexo = sexo;
        this.total = total;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
