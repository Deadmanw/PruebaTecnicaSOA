package com.example.tecnical.test.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "test_data")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TestData {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name_data", nullable = false)
    private String nameData;
    @Column(name = "description_data", nullable = false)
    private String descriptionData;

}
