package com.vibol.designparttern.udemy_course_design_pattern.coreparttern;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.Test;

import com.vibol.corepattern.singletone.Logger;

public class LoggerTest {

    // ✅ Test Singleton instance
    @Test
    void testSingletonInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2, "Instances should be the same");
    }

    // ✅ Test Multi-threading safety
    @Test
    void testMultiThreadingSingleton() throws InterruptedException {
        int threadCount = 10;
        Logger[] instances = new Logger[threadCount];
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int index = i;
            new Thread(() -> {
                instances[index] = Logger.getInstance();
                latch.countDown();
            }).start();
        }

        latch.await();

        for (int i = 1; i < threadCount; i++) {
            assertSame(instances[0], instances[i],
                    "All instances should be same across threads");
        }
    }

    // ✅ Test clone protection
    @Test
    void testCloneNotAllowed() throws Exception {
        Logger logger = Logger.getInstance();

        var method = Logger.class.getDeclaredMethod("clone");
        method.setAccessible(true);

        assertThrows(Exception.class, () -> {
            method.invoke(logger);
        });
    }

    // ✅ Test serialization safety
    @Test
    void testSerialization() throws Exception {
        Logger original = Logger.getInstance();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(
                new ByteArrayInputStream(bos.toByteArray()));
        Logger deserialized = (Logger) in.readObject();

        assertSame(original, deserialized,
                "Deserialized instance should be same singleton");
    }
}