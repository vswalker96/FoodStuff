package com.revature.foodstuff.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.foodstuff.model.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
	

}