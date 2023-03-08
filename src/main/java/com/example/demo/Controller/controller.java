package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.service;
import com.example.demo.model.model;
@RestController
@CrossOrigin
public class controller {
         @Autowired
         service s;    
         @GetMapping("/get")
         public List<model> showDetails(){
        	 return s.getDetails();
         }
         @PostMapping("/post")
         public String addDetails(@RequestBody model m) {
        	 s.add(m);
        	 return "Added product "+m.getId();
         }
         @PutMapping("/put")
     	public model updateInfo(@RequestBody model st1) {
     		return s.updateDetails(st1);
     	}
     	@DeleteMapping("/delete/{sid}")
     	public String deleteInfo(@PathVariable("sid")int sid) {
     		s.deleteDetails(sid);
     		return "Deleted details";
     	}     
}