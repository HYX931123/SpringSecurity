package org.springframe.test.dao;

import org.junit.Test;
import org.springframe.system.dao.SystemRoleResoucesDao;
import org.springframe.system.vo.SystemRoleResouces;
import org.springframe.test.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * @author: HeYixuan
 * @create: 2017-05-05 13:29
 */
public class SystemRoleResourcesTest extends BaseTest {

    @Autowired
    private SystemRoleResoucesDao systemRoleResoucesDao;

    @Test
    public void getList(){
        Collection<SystemRoleResouces> resouces = systemRoleResoucesDao.getList();
        resouces.stream().forEach( r-> {
            System.err.println(r.toString());
        });
    }
}
