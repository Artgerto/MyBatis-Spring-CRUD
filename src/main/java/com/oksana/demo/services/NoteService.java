package com.oksana.demo.services;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.oksana.demo.models.Note;

@Mapper
public interface NoteService {
    @Select("SELECT * FROM note ORDER BY id")
    List<Note> findAll();

    @Insert("INSERT INTO note (date, title, text) VALUES (#{date},#{title},#{text})")
    public int insertNote(Note note);

    @Update("UPDATE note SET title = #{title}, date = #{date}, text = #{text} WHERE id = #{id}")
    public int updateNote(Note note);

    @Delete("DELETE from note WHERE id = #{id}")
    public int deleteNote(Long id);
}
