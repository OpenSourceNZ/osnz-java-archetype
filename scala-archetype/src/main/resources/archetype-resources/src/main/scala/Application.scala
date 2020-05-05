package ${package}

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@RestController
class Application {

  @GetMapping(path = Array("/hello"))
  def index(): String = "Welcome to scala sample"

}

object Application extends App {
  SpringApplication.run(classOf[Application], args: _*)
}