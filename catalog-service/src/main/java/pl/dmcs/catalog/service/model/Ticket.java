package pl.dmcs.catalog.service.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String title;

    @Column
    private String date;

    @Column
    private String price;

    @Column
    private boolean reserved;

}