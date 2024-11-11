package com.william.gestao_cursos.modules.course.repositories;

import com.william.gestao_cursos.modules.course.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<CourseEntity, UUID> {
}
