package com.christopher.digitalcollection.demo.repository;

import com.christopher.digitalcollection.demo.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {
    // Custom query to find media by type
    List<Media> findByMediaType(String mediaType);
}
