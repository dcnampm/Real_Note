package dev.nampd.realnote.service.impl;

import dev.nampd.realnote.repository.NoteRepository;
import dev.nampd.realnote.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;
}
