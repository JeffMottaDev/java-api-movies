package com.example.screemmatch;

import com.example.screemmatch.model.Series;
import com.example.screemmatch.services.ApiCall;
import com.example.screemmatch.services.MapperData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreemmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreemmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ApiCall api = new ApiCall();
		var json =api.obterDados("http://www.omdbapi.com/?t=The+boys&apikey=6585022c");
		MapperData m = new MapperData();
		System.out.println(json);
		Series serie = m.toMapper(json, Series.class);
		System.out.println(serie);
	}
}
