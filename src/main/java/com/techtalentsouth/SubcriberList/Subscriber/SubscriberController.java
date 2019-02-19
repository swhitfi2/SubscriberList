package com.techtalentsouth.SubcriberList.Subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping; not being used

@Controller
public class SubscriberController {
	
	//tells subscriber to automatically build and run the repository upon initial start
	@Autowired
	private SubscriberRepository subscriberRepository; //creates an instance
	
	//tells system to look for a file/page in the string format
	@GetMapping("/")         
	public String index(Subscriber subscriber) {
		return "subscriber/index.html"; //path to the file location of index file
	}
	
	//user is sending data /used this method when we are passing information to the database
	//this method will be hit when submit button selected 1st save
	@PostMapping(value="/")
	public String addNewSubscriber(Subscriber subscriber, Model model) {
		//subscriberRepository.save(subscriber); //can also perform the following task
		subscriberRepository.save(new Subscriber(subscriber.getFirstName(),subscriber.getLastName(), 
				subscriber.getEmail(), subscriber.getUserName(), subscriber.getPassword(),
				subscriber.getDateOfBirth(), subscriber.getDateCreated()));
		
		//then the add attribute is passing the form data to be used back to the form
		//takes saved variables and 
		model.addAttribute("firstName", subscriber.getFirstName());
		model.addAttribute("lastName", subscriber.getLastName());
		model.addAttribute("email", subscriber.getEmail());
		model.addAttribute("userName", subscriber.getUserName());
		model.addAttribute("password", "Sorry can't pass that");
		model.addAttribute("dateOfBirth", subscriber.getDateOfBirth());
		
		
		return "subscriber/results";
	}
	
}
