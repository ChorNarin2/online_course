package online_course.com.kh.Narincourse.models;


import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import online_course.com.kh.Narincourse.config.enums.RoleEnum;

@Entity
@Table(name = "roles")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   @Column(unique = true, nullable = false)
   @Enumerated(EnumType.STRING)
   private RoleEnum rolename; 

   @CreationTimestamp
   @Column(updatable = false, name = "create_at")
   private Date created_at;

}
