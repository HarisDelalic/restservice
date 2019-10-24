package com.dela.versioning.repositories;

import com.dela.versioning.models.Name;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<Name, Long> { }
