# Zero Code Example usage

> [Zerocode](https://www.zerocode.io/) helps you to design better Test Cases for your business functionalities and then maintain them easily 
to avoid sleepless nights. You do this simply by configuring, declaring and executing the scenario-files 
enabling you to completely eliminate the glue or boilerplate coding.

1. Build application - `mvn clean install -Dmaven.test.skip=true`
1. Run Spring Boot application - `./run.sh` or `mvn spring-boot:run`
1. Check
    1. http://localhost:8888/example
    1. http://localhost:8888/example/actuator/health
    1. http://localhost:8888/example/actuator/info
1. In IDEA run test class `ClientTest` or in another terminal in root of project run command `mvn test`
1. To run load testing from command line `mvn test -Dtest=com.sample.controller.LoadClientTest -Dusers=10 -Dduration=10 -Dloop=3`
   , where
   users = Number of virtual users,
   duration = Ramp up duration for the virtual users,
   loop = How many times to repeat this run
