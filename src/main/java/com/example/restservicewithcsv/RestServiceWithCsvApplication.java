package com.example.restservicewithcsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class RestServiceWithCsvApplication {

	public static void main(String[] args) throws URISyntaxException, IOException {
		SpringApplication.run(RestServiceWithCsvApplication.class, args);

		//For convenience, I now open the started connection
		//In order to do so, this application cannot be headless, so lets change that
		System.setProperty("java.awt.headless", "false");
		Desktop.getDesktop().browse(new URI("http://localhost:8899/"));
	}
}
