### What is Springboot?
- Springboot is a module of spring framework which is used to create stand-alone applications and rad(rapid application development) with auto configurations and embedded servers
### What is the major difference between spring and springboot?
```
configuration:

- for Spring we have to provide lot of configuration
- for spring boot it is auto configured
```
```
Actuator: it is used for mointoring and manaaging the application
- spring doesnot provide actuator
- springboot proviedes actuator
```
```
Server:
- in spring we need to add server
- in springboot default server is added they are tomcat and jetty 
- springboot supports starter,aop
```
### How Can We Set Up a Spring Boot Application With Maven?
- we can setup by adding the dependency spring-starter-parent
```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.4.0.RELEASE</version>
</parent>
```
### What Is Spring Initializr?
- spring intializer is used to create springboot project 
### What Spring Boot Starters Are Available Out There?
-   spring-boot-starter-core (application.properties,yml,logging)
- spring-boot-starter-web (spring mvc)
- spring-boot-starter-data (jpa,hibernate,mongo)
- spring-boot-starter-security
- spring-boot-starter-test
### How to Disable a Specific Auto-Configuration?
- to disable specific auto-configuration by using exculde attribute
```

@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class MyConfiguration { }

or

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MyConfiguration { }
```
###  How to Tell an Auto-Configuration to Back Away When a Bean Exists?
- to instruct a class to back off if bean already exits by using the annotation @ConditionalOnMissingBean
``` 
@Configuration
public class CustomConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public CustomService service() { ... }
}
```
### How to Deploy Spring Boot Web Applications as Jar and War Files?
- maven provides the plugin tag within plugin we can add the 
- <plugin>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-maven-plugin</artifactId>
  </plugin> 
###  What Are Possible Sources of External Configuration?
- by application.properties files,yaml files,system properties,environmental variables
### What Is Spring Boot DevTools Used For?
- if we add the springboot dev tools it automatically restarts the when ever classpaths are changed
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
```
### How to Write Integration Tests?
- when running the integration test we need application context
- @SpringbootTest provides the application context
### Which Is Better to Configure a Spring Boot Project — Properties or YAML?
- YAML offers many advantages over properties files:
- More clarity and better readability
- Perfect for hierarchical configuration data, which is also represented in a better, more readable format
- Support for maps, lists and scalar types
- Can include several profiles in the same file (since Spring Boot 2.4.0, this is possible for properties files too)
### What Basic Annotations Does Spring Boot Offer?
- it provides @EnableConfiguration
- and also @SpringBootApplication this annotation includes @EnableConfiguration,@Configuration,@ComponentScan
### Why Do We Need Spring Profiles?
- when developing the application for enterprise we have multiple environments such as dev,qa,prod
- these environments need different configurations