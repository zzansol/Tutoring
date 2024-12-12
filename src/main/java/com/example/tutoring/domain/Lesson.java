package com.example.tutoring.domain;

import com.example.tutoring.domain.enums.LessonStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Getter
@DynamicUpdate
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lesson extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private LocalDateTime endTime;

    @Column(nullable = false)
    private Duration duration;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'AVAILABLE'")
    private LessonStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tutor_id") // FK
    private Tutor tutor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id") // FK
    private Student student;




}
