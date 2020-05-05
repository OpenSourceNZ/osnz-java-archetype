package ${package}

import org.fest.assertions.Assertions.assertThat
import org.junit.Test

class HelloTest {

  @Test
  def hello() {

    assertThat("hello").isEqualTo("hello")
  }
}
