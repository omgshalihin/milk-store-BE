package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("milk-products")
public class Product {

    @MongoId(value = FieldType.OBJECT_ID)
    private String docId;
    private String id;
    private String name;
    private String type;
    private double storage;
}
