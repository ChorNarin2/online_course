package online_course.com.kh.Narincourse.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinTable(name = "student_id")
    private Students students;

    @ManyToOne
    @JoinTable(name = "courses_id")
    private Courses courses;

    @Column(name = "status")
    private String status;

    @CreationTimestamp
    @Column(name = "paid_at", updatable = false)
    private LocalDateTime paid_at;

}
