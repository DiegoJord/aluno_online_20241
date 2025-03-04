package br.com.alunoonline.api.model;

import br.com.alunoonline.api.enums.MatriculaAlunoStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class MatriculaAluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double grade1;

    private Double grade2;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Aluno student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Disciplina subject;

    @Enumerated(EnumType.STRING)
    private MatriculaAlunoStatusEnum status;
}
