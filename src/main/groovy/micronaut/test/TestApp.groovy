package micronaut.test

import javax.inject.Inject
import javax.inject.Singleton

import io.micronaut.runtime.event.annotation.EventListener
import io.micronaut.runtime.server.event.ServerStartupEvent

@Singleton
class TestApp {

    @Inject
    TestClient1 client1
    @Inject
    TestClient2 client2
    @Inject
    TestClient3 client3
    @Inject
    TestClient4 client4
    
    @Inject
    TestClient5 client5
    @Inject
    TestClient6 client6
    @Inject
    TestClient7 client7
    @Inject
    TestClient8 client8

    @EventListener
    void onStartup(ServerStartupEvent event) {
        println "1="*50
        try {
            client1.absolute()
        } catch (Exception e) {
        }
        println "-"*50
        try {
            client1.relative()
        } catch (Exception e) {
        }
        println "2="*50
        try {
            client2.absolute()
        } catch (Exception e) {
        }
        println "-"*50
        try {
            client2.relative()
        } catch (Exception e) {
        }
        println "3="*50
        try {
            client3.absolute()
        } catch (Exception e) {
        }
        println "-"*50
        try {
            client3.relative()
        } catch (Exception e) {
        }
        println "4="*50
        try {
            client4.absolute()
        } catch (Exception e) {
        }
        println "-"*50
        try {
            client4.relative()
        } catch (Exception e) {
        }
        println "4="*50
        println "5="*50
        try {
            client5.absolute()
        } catch (Exception e) {
        }
        println "-"*50
        try {
            client5.relative()
        } catch (Exception e) {
        }
        println "6="*50
        try {
            client6.absolute()
        } catch (Exception e) {
        }
        println "-"*50
        try {
            client6.relative()
        } catch (Exception e) {
        }
        println "7="*50
        try {
            client7.absolute()
        } catch (Exception e) {
        }
        println "-"*50
        try {
            client7.relative()
        } catch (Exception e) {
        }
        println "8="*50
        try {
            client8.absolute()
        } catch (Exception e) {
        }
        println "-"*50
        try {
            client8.relative()
        } catch (Exception e) {
        }
        println "="*50
    }
}
