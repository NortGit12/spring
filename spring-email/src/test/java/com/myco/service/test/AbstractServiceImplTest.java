package com.myco.service.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceTestConfig.class})
//@ActiveProfiles("dev")
public abstract class AbstractServiceImplTest {

    // Use this when testing database access
    //  extends AbstractTransactionalJUnit4SpringContextTests {

}