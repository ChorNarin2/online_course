package online_course.com.kh.Narincourse.models;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lesson")
@Data
public class lessons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "descriptions")
    private String content;

    @Column(name = "videos_url")
    private String videos_url;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date created_at;


}
