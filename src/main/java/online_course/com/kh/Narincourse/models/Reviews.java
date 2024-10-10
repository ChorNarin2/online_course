package online_course.com.kh.Narincourse.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Students student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    @ManyToOne
    @JoinColumn(name = "rate_id")
    private Rates rate;

    @Column(name = "commet")
    private String comment;

    @CreationTimestamp
    @Column(name = "reviews_at", updatable = false)
    private LocalDateTime reviewedAt;

}
