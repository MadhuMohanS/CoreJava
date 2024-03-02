package com.xworkz.collectionmock.filterbooks;

import java.security.KeyStore.PrivateKeyEntry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//genre publicationyear author rating price
public class BookDto {
private String name;
private String genre;
private int publicationYear;
private String author;
private double rating;
private double price;
}
