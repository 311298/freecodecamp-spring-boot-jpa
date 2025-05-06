package com.freecodecamp2.jpa.repository;

import com.freecodecamp2.jpa.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
