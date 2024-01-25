package com.pagination.pagination.controller;


import com.pagination.pagination.model.PagenationModel;
import com.pagination.pagination.repository.PaginationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/p")
public class PaginationController {

    @Autowired
    private PaginationRepository paginationRepository;

    @GetMapping("/get")
    public List<PagenationModel> getAll(){
        return paginationRepository.findAll();
    }

    @PostMapping("/add")
    public PagenationModel add(@RequestBody PagenationModel pagedata){
        return paginationRepository.save(pagedata);
    }

    //pagination
    @GetMapping
    public Page<PagenationModel> getdata(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int size){

        PageRequest p = PageRequest.of(page,size);
        return paginationRepository.findAll(p);

    }


}
