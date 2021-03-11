package micronaut.test

import javax.inject.Singleton

import org.reactivestreams.Publisher

import io.micronaut.discovery.DiscoveryClient
import io.micronaut.discovery.ServiceInstance
import io.reactivex.Flowable

abstract class TestDiscoveryClient implements DiscoveryClient {

    abstract String getUrl()
    abstract String getId()

    @Override
    public void close() throws IOException {
        // Nothing to do
    }

    @Override
    public String getDescription() {
        id
    }

    @Override
    public Publisher<List<ServiceInstance>> getInstances(String serviceId) {
        if (serviceId != id) {
            return Flowable.just([])
        }
        Flowable.just([
            ServiceInstance.of(id, new URL(url))
        ])
    }

    @Override
    Publisher<List<String>> getServiceIds() {
        Flowable.just([id])
    }
}

@Singleton
class DiscoveryClient1 extends TestDiscoveryClient {

    @Override
    String getId() {
        'host-port-no-slash'
    }

    @Override
    String getUrl() {
        'http://localhost:8080'
    }
}

@Singleton
class DiscoveryClient2 extends TestDiscoveryClient {
    
    @Override
    String getId() {
        'host-port-with-slash'
    }
    
    @Override
    String getUrl() {
        'http://localhost:8080/'
    }
}

@Singleton
class DiscoveryClient3 extends TestDiscoveryClient {
    
    @Override
    String getId() {
        'context-path-no-slash'
    }
    
    @Override
    String getUrl() {
        'http://localhost:8080/context/path'
    }
}

@Singleton
class DiscoveryClient4 extends TestDiscoveryClient {
    
    @Override
    String getId() {
        'context-path-with-slash'
    }
    
    @Override
    String getUrl() {
        'http://localhost:8080/context/path/'
    }
}
