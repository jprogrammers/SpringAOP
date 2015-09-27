package com.jprogrammers.spring;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * Created by alireza on 9/27/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
public class AppTest extends TestCase {

    @Autowired
    MovieLister movieLister;

    @Test
    public void testAopConcepts() {
        movieLister.moviesDirectedBy("Steven Spielberg");
    }

}
