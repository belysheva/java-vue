package ru.myRestExample.firstExpirience.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.myRestExample.firstExpirience.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
