package com.nationwide;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class ESRController {
	
	@Autowired
	private ESRrepo repo;

@GetMapping("/allTeams")
public List<ESR> index(){
    return repo.findAll();
}

@GetMapping("/team/{client_id}")
public Optional<ESR> show(@PathVariable String client_id){
	int id = Integer.parseInt(client_id);
	return repo.findById(id);
}

@PostMapping("/save2/{client_name}/{game}/{platform}/{genre}/{description}/{image_path}")
	public String saveclient(@PathVariable String client_name,
							@PathVariable String game,
							@PathVariable String platform,
							@PathVariable String genre,
							@PathVariable String description,
							@PathVariable String image_path) {
	ESR Ref = new ESR();
	Ref.setClient_name(client_name);
	Ref.setGame(game);
	Ref.setPlatform(platform);
	Ref.setGenre(genre);
	Ref.setDescription(description);
	repo.save(Ref);
	return "Client Added via URL";
}
@PostMapping("/save3")
	public String savedata(@RequestBody ESR Ref) {
		if(Ref.getClient_name().toString().equals("blocked")) {
			return "This client is blocked";
		}
		else {
			repo.save(Ref);
			return "Client added via body";
		}
	}
@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{client_id}")
public void delete(@PathVariable int client_id) {
	repo.deleteById(client_id);
}
}