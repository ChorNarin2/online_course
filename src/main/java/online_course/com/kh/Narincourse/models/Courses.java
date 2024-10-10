package online_course.com.kh.Narincourse.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "courses")
@Data
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "language")
    private String language;

    @CreationTimestamp
    @Column(updatable = false, name = "create_at")
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructors instructors;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories categories;

    @ManyToOne
    @JoinColumn(name = "rate_id")
    private Rates rates;


}
