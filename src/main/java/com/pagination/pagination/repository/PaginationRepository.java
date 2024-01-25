package com.pagination.pagination.repository;

import com.pagination.pagination.model.PagenationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaginationRepository extends JpaRepository<PagenationModel,Integer> {

    Page<PagenationModel> findAll(Pageable pagable);
}
