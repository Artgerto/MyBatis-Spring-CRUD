package com.oksana.demo.controllers;

import com.oksana.demo.models.Note;
import com.oksana.demo.services.NoteService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class NoteController {

    private final NoteService noteService;

    NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping(value = "/notes", produces = MediaType.APPLICATION_XHTML_XML_VALUE, method = RequestMethod.GET)
    List<Note> getNotes() {
        return noteService.findAll();
    }

    @RequestMapping(value = "/notes", produces = MediaType.APPLICATION_XHTML_XML_VALUE, method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    int insertNote(@RequestBody Note newNote) {
//        Note note = new Note();
//        note.setId((long) 1);
//        note.setDate(new Date());
//        note.setTitle("First");
//        note.setText("tr");
        return noteService.insertNote(newNote);
    }

    @RequestMapping(value = "/notes/{id}", produces = MediaType.APPLICATION_XHTML_XML_VALUE, method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_XML_VALUE)
    int deleteNote(@PathVariable Long id) {
//        Note note = new Note();
//        note.setId((long) 1);
//        note.setDate(new Date());
//        note.setTitle("First");
//        note.setText("tr");
        return noteService.deleteNote(id);
    }

    @RequestMapping(value = "/notes", produces = MediaType.APPLICATION_XHTML_XML_VALUE, method = RequestMethod.PUT, consumes = MediaType.APPLICATION_XML_VALUE)
    int updateNote(@RequestBody Note newNote) {
//        Note note = new Note();
//        note.setId((long) 1);
//        note.setDate(new Date());
//        note.setTitle("First");
//        note.setText("tr");
        return noteService.updateNote(newNote);
    }


}
