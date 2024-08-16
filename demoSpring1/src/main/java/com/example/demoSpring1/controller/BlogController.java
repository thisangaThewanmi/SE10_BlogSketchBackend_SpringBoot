package com.example.demoSpring1.controller;

import com.example.demoSpring1.entity.Blog;
import com.example.demoSpring1.repository.BlogRepository;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/GetAllPost")
    public List<Blog> getALlPost(){

        return blogRepository.findAll();
    }
    @PostMapping("/savePost")
    public Blog getAllPost(@RequestBody Blog blog){

        return blogRepository.save(blog);
    }

    @GetMapping("GetOnePost/{id}")//methana namai
    public String getOnePost(@PathVariable String id){//methna namai samana wenna one

        return id;
    }

    @PostMapping("/getMapping")
    public String getMapping(){

        System.out.println("hellowww");
        return null;
    }

    @PutMapping ("/updatePost")//meka use karanne update ekata mekedi save eka tibbata alredy exsist id ekaknm eka update katranawa
    public Blog updatePost(@RequestBody Blog blog){

        return blogRepository.save(blog);
    }

    @DeleteMapping ("/deletePost/{id}")//meka use karanne update ekata mekedi save eka tibbata alredy exsist id ekaknm eka update katranawa
    public void deletePost(@PathVariable int id){
         blogRepository.deleteById(id);
    }



}
