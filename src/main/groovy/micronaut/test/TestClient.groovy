package micronaut.test

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

interface TestClient {
    
    @Get('relative')
    void relative()
    
    @Get('/absolute')
    void absolute()

}

@Client('host-port-no-slash')
interface TestClient1 extends TestClient {
}

@Client('host-port-with-slash')
interface TestClient2 extends TestClient {
}

@Client('context-path-no-slash')
interface TestClient3 extends TestClient {
}

@Client('context-path-with-slash')
interface TestClient4 extends TestClient {
}

@Client('http://localhost:8080')
interface TestClient5 extends TestClient {
}

@Client('http://localhost:8080/')
interface TestClient6 extends TestClient {
}

@Client('http://localhost:8080/context/path')
interface TestClient7 extends TestClient {
}

@Client('http://localhost:8080/context/path/')
interface TestClient8 extends TestClient {
}
