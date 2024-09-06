package com.cygnivo.easeeitor;

import com.cygnivo.easeeitor.config.AsyncSyncConfiguration;
import com.cygnivo.easeeitor.config.EmbeddedKafka;
import com.cygnivo.easeeitor.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { EaseEditorApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedKafka
public @interface IntegrationTest {
}
