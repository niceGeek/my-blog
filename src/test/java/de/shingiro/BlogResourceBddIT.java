package de.shingiro;

import com.intuit.karate.core.Feature;
import com.intuit.karate.junit5.Karate;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class BlogResourceBddIT {

    @Karate.Test
    Karate testGetMethod() {
        return new Karate()
                .features(Feature.read("classpath:/karate/blog-resource.feature"));
    }

}
