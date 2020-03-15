package com.example.ppmtool.repositories;

import com.example.ppmtool.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

   List<ProjectTask> findByProjectIdentifierOrderByPriority(String Id);

   ProjectTask findByProjectSequence(String sequence);
}
