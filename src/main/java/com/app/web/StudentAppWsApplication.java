package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class StudentAppWsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppWsApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Estudiante estudiante1 = new Estudiante("Christian", "Ramirez", "cris20@gmail.com");
		repositorio.save(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Andre", "Carrillo", "andrecar20@gmail.com");
		repositorio.save(estudiante2);*/
	}
}
