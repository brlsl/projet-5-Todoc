package com.cleanup.todoc.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.cleanup.todoc.model.Project;

import java.util.List;

@Dao
public interface ProjectDao {

    // insert a project for instrumented test
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertProject(Project project);

    @Query("SELECT * FROM project_table")
    LiveData<List<Project>> getProjects();
}
