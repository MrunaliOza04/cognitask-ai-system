package com.cognitask.cognitask_ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // main starting point
public class CognitaskAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CognitaskAiApplication.class, args); //Spring, start the entire application.
	}
/*                     /\
Starts Tomcat server   ||

Connects database

Creates beans

Prepares REST APIs

Makes app ready

All because of this ONE line.
 */
}
