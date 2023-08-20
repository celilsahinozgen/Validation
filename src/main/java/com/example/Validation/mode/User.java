package com.example.Validation.mode;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personel")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;


    @Column(name = "ISIM")
    String firstName;

    @Column(name = "SOYISIM")
    String lastName;

    @Column(name = "TCNUMARASI")
    String tcNo;

    @Column(name = "MAIL")
    String mail;

    @Column(name = "sifre")
    Integer sifre;




//    @NotNull
//   @Size(min = 2, message = "Must be not null")
//    @Column(name = "ISIM")
//    String firstName;
//
//    @NotBlank(message = "Must be not blank")
//    @Column(name = "SOYISIM")
//    String lastName;
//
//    @Column(name = "TCNUMARASI")
//    String tcNo;
//
//    @Email(message = "Email should be valid")
//    @Column(name = "MAIL")
//    String mail;
//
//    @Pattern(regexp = "[0-9\\s]{12}")
//    @Column(name = "sifre")
//    Integer sifre;
}
