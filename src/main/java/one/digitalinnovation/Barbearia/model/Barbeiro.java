package one.digitalinnovation.Barbearia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.digitalinnovation.Barbearia.controller.Endereco;

import java.time.LocalDate;
@Entity(name = "Barbeiro")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Barbeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 100)
    private String nome;

    @Column(nullable = false)
    private LocalDate dataNascimento;


    @Embedded
    private Endereco endereco;

    @Column(nullable = false)
    private boolean status;
}
