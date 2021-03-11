package micronaut.test

import javax.inject.Inject

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest
class MicronautTestSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application

    void 'test something'() {
    }
}
