package tr.edu.medipol.yova.OgrenciWebServisi;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestApi {
	
	private static final List<String> Ogrenciler = new ArrayList<>();
	{
		Ogrenciler.add("Jane");
		Ogrenciler.add("Joe");
	}
	
	@GetMapping("/listele")
	public List<String> listele(){
		return Ogrenciler;
	
	}
	
	
}
