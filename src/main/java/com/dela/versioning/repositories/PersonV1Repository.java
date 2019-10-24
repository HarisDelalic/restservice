package com.dela.versioning.repositories;

import com.dela.versioning.models.PersonV1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonV1Repository extends JpaRepository<PersonV1, Long> { }
