package online_course.com.kh.Narincourse.models;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "enrollments")
@Data
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Students students;
    
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses courses;

    @Column(name = "progress")
    private Integer progress;

    @Column(name = "completed")
    private Integer completed;

    @CreationTimestamp
    @Column(name = "enrolled_at", updatable = false)
    private Date enrolled_at;

}
