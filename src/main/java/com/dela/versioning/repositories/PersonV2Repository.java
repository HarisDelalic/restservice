package com.dela.versioning.repositories;

import com.dela.versioning.models.PersonV2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonV2Repository extends JpaRepository<PersonV2, Long> { }
